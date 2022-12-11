package pl.edu.wszib.happypile.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import pl.edu.wszib.happypile.models.EquipmentModel;
import pl.edu.wszib.happypile.models.SelectEquipmentModel;

@Controller
public class QuoteController {

    @GetMapping("quote")
    public String showQuotePage(@ModelAttribute("selectEquipment") SelectEquipmentModel selectEquipment,
                                @ModelAttribute("equipment") EquipmentModel equipment) {
        return "quote";
    }
}
