package pl.edu.wszib.happypile.services;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import pl.edu.wszib.happypile.dao.CouplingDao;
import pl.edu.wszib.happypile.entities.Bar;
import pl.edu.wszib.happypile.entities.Coupling;

@Service
public class CouplingService {

    private final CouplingDao couplingDao;

    public CouplingService(CouplingDao couplingDao) {
        this.couplingDao = couplingDao;
    }

    public Coupling chooseCoupling(@ModelAttribute Bar bar) {
        String barDiameter = bar.getDiameter();
        Coupling chosenCoupling = couplingDao.findCouplingByDiameter(barDiameter);
        return chosenCoupling;
    }

    public int countQuantityOfCouplings(@RequestParam int barsQuantity){
        return barsQuantity - 1;
    }
}
