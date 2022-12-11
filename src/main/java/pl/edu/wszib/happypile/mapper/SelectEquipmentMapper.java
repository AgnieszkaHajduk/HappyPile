package pl.edu.wszib.happypile.mapper;

import pl.edu.wszib.happypile.entities.SelectEquipment;
import pl.edu.wszib.happypile.models.SelectEquipmentModel;

public class SelectEquipmentMapper {
    public static SelectEquipment toEntity(SelectEquipmentModel model) {
        SelectEquipment entity = new SelectEquipment();
        entity.setClientName(model.getClientName());
        entity.setPilesQuantity(model.getPilesQuantity());
        entity.setDepth(model.getDepth());
        entity.setCapacity(model.getCapacity());
        entity.setSingleBarLength(model.getSingleBarLength());
        entity.setNutsQuantity(model.getNutsQuantity());
        entity.setNutType(model.getNutType());
        entity.setPlatesQuantity(model.getPlatesQuantity());
        entity.setPlateSize(model.getPlateSize());
        return entity;
    }
}
