package pl.edu.wszib.happypile.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import pl.edu.wszib.happypile.dao.PlateDao;
import pl.edu.wszib.happypile.entities.*;
import pl.edu.wszib.happypile.models.EquipmentModel;
import pl.edu.wszib.happypile.models.SelectEquipmentModel;
import pl.edu.wszib.happypile.services.*;

import javax.validation.Valid;

@Controller
public class SelectEquipmentController {

    private final SelectEquipmentService selectEquipmentService;
    private final BarService barService;
    private final CouplingService couplingService;
    private final EquipmentService equipmentService;
    private final NutService nutService;
    private final PlateDao plateDao;

    public SelectEquipmentController(SelectEquipmentService selectEquipmentService, BarService barService, CouplingService couplingService, EquipmentService equipmentService, NutService nutService, PlateDao plateDao) {
        this.selectEquipmentService = selectEquipmentService;
        this.barService = barService;
        this.couplingService = couplingService;
        this.equipmentService = equipmentService;
        this.nutService = nutService;
        this.plateDao = plateDao;
    }

    @GetMapping("select-equipment")
    public String showSelectEquipmentPage(Model model) {
        model.addAttribute("selectEquipment", new SelectEquipment());
        Double[] barLengths = {1.0, 1.5, 2.0, 3.0, 4.0, 6.0};
        model.addAttribute("barLengths", barLengths);
        Integer[] nutsQuantity = {1, 2};
        model.addAttribute("nutsQuantity", nutsQuantity);
        String[] nutType = {"Nakrętka kulista", "Nakrętka kulista galv", "Nakrętka HEX", "Nakrętka HEX galv"};
        model.addAttribute("nutType", nutType);
        Integer[] platesQuantity = {1, 2};
        model.addAttribute("platesQuantity", platesQuantity);
        String[] plateSize = {"150x150x8", "150x150x10", "200x200x10", "200x200x20", "200x200x25", "250x250x20", "250x250x25", "250x250x30"};
        model.addAttribute("plateSize", plateSize);
        return "selectEquipment";
    }

    @PostMapping("select-equipment")
    public String createEquipment(@ModelAttribute("selectEquipment") @Valid SelectEquipmentModel selectEquipment,
                                  BindingResult bindingResult,
                                  @ModelAttribute("equipment") EquipmentModel equipment,
                                  RedirectAttributes attributes,
                                  Model model) {

        if (bindingResult.hasErrors()) {

            return "selectEquipment";
        }

        selectEquipmentService.saveSelectEquipment(selectEquipment);
        attributes.addFlashAttribute("selectEquipment", selectEquipment);

        model.addAttribute("equipment", new Equipment());
        Bar bar = barService.chooseBar(selectEquipment);
        equipment.setBar(bar);
        int barsQuantity = barService.countQuantityOfBars(selectEquipment);
        equipment.setBarsQuantity(barsQuantity);
        Coupling coupling = couplingService.chooseCoupling(bar);
        equipment.setCoupling(coupling);
        int couplingsQuantity = couplingService.countQuantityOfCouplings(barsQuantity);
        equipment.setCouplingsQuantity(couplingsQuantity);
        Nut nut = nutService.chooseNut(selectEquipment, bar);
        equipment.setNut(nut);
        Plate plate = plateDao.findPlateBySize(selectEquipment.getPlateSize());
        equipment.setPlate(plate);

        equipmentService.saveEquipment(equipment);
        attributes.addFlashAttribute("equipment", equipment);

        return "redirect:/quote";
    }
}