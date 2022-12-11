package pl.edu.wszib.happypile.services;

import org.springframework.stereotype.Service;
import pl.edu.wszib.happypile.dao.SelectEquipmentDao;
import pl.edu.wszib.happypile.entities.SelectEquipment;
import pl.edu.wszib.happypile.mapper.SelectEquipmentMapper;
import pl.edu.wszib.happypile.models.SelectEquipmentModel;

import javax.transaction.Transactional;

@Service
public class SelectEquipmentService {

    private final SelectEquipmentDao selectEquipmentDao;

    public SelectEquipmentService(SelectEquipmentDao selectEquipmentDao) {
        this.selectEquipmentDao = selectEquipmentDao;
    }

    @Transactional
    public void saveSelectEquipment(SelectEquipmentModel selectEquipmentModel) {

        SelectEquipment selectEquipment = SelectEquipmentMapper.toEntity(selectEquipmentModel);

        selectEquipment.setClientName(selectEquipment.getClientName());
        selectEquipment.setPilesQuantity(selectEquipment.getPilesQuantity());
        selectEquipment.setDepth(selectEquipment.getDepth());
        selectEquipment.setCapacity(selectEquipment.getCapacity());
        selectEquipment.setSingleBarLength(selectEquipment.getSingleBarLength());
        selectEquipment.setNutsQuantity(selectEquipment.getNutsQuantity());
        selectEquipment.setNutType(selectEquipment.getNutType());
        selectEquipment.setPlatesQuantity(selectEquipment.getPlatesQuantity());
        selectEquipment.setPlateSize(selectEquipment.getPlateSize());

        selectEquipmentDao.save(selectEquipment);
    }
}
