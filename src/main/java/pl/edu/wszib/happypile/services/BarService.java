package pl.edu.wszib.happypile.services;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import pl.edu.wszib.happypile.dao.BarDao;
import pl.edu.wszib.happypile.entities.Bar;
import pl.edu.wszib.happypile.models.SelectEquipmentModel;

import java.util.List;

@Service
public class BarService {

    private final BarDao barDao;

    public BarService(BarDao barDao) {
        this.barDao = barDao;
    }

    public Bar chooseBar(@RequestBody SelectEquipmentModel selectEquipment) {
        List<Bar> bars = barDao.findAll();
        Double capacity = selectEquipment.getCapacity();
        Double chosenYieldLoad;
        Double currentYieldLoad;
        Bar chosenBar = bars.get(0);
        for (int i = 0; i < bars.size(); i++) {
            currentYieldLoad = bars.get(i).getYieldLoad();
            if ((currentYieldLoad / 1.15) <= capacity) {
                chosenYieldLoad = currentYieldLoad;
                chosenBar = barDao.findByYieldLoad(chosenYieldLoad);
            }
        }
        return chosenBar;
    }

    public int countQuantityOfBars(@RequestBody SelectEquipmentModel selectEquipment) {
        double barsQuantity = selectEquipment.getPilesQuantity() * java.lang.Math.ceil(selectEquipment.getDepth() / selectEquipment.getSingleBarLength());
        return (int) barsQuantity;
    }
}
