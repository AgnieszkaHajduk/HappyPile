package pl.edu.wszib.happypile.services;

import org.springframework.stereotype.Service;
import pl.edu.wszib.happypile.dao.EquipmentDao;
import pl.edu.wszib.happypile.entities.Equipment;
import pl.edu.wszib.happypile.mapper.EquipmentMapper;
import pl.edu.wszib.happypile.models.EquipmentModel;

import javax.transaction.Transactional;

@Service
public class EquipmentService {

    private final EquipmentDao equipmentDao;

    public EquipmentService(EquipmentDao equipmentDao) {
        this.equipmentDao = equipmentDao;
    }

    @Transactional
    public void saveEquipment(EquipmentModel equipmentModel) {

        Equipment equipment = EquipmentMapper.toEntity(equipmentModel);

        equipment.setSelectEquipment(equipment.getSelectEquipment());
        equipment.setBar(equipment.getBar());
        equipment.setCoupling(equipment.getCoupling());
        equipment.setNut(equipment.getNut());
        equipment.setPlate(equipment.getPlate());

        equipmentDao.save(equipment);
    }
}
