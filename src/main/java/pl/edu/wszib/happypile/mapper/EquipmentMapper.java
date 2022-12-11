package pl.edu.wszib.happypile.mapper;

import pl.edu.wszib.happypile.entities.Equipment;
import pl.edu.wszib.happypile.models.EquipmentModel;

public class EquipmentMapper {

    public static Equipment toEntity(EquipmentModel model) {
        Equipment entity = new Equipment();
        entity.setSelectEquipment(model.getSelectEquipment());
        entity.setBar(model.getBar());
        entity.setCoupling(model.getCoupling());
        entity.setNut(model.getNut());
        entity.setPlate(model.getPlate());
        return entity;
    }
}
