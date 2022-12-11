package pl.edu.wszib.happypile.services;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import pl.edu.wszib.happypile.dao.NutDao;
import pl.edu.wszib.happypile.entities.Bar;
import pl.edu.wszib.happypile.entities.Nut;
import pl.edu.wszib.happypile.models.SelectEquipmentModel;

@Service
public class NutService {

    private final NutDao nutDao;

    public NutService(NutDao nutDao) {
        this.nutDao = nutDao;
    }

    public Nut chooseNut(
            @RequestBody SelectEquipmentModel selectEquipment,
            @ModelAttribute Bar bar) {
        String barDiameter = bar.getDiameter();
        Nut chosenNut = nutDao.findNutByTypeAndDiameter(selectEquipment.getNutType(), barDiameter);
        return chosenNut;
    }
}
