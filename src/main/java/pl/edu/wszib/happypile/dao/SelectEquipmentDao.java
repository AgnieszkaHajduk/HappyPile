package pl.edu.wszib.happypile.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.happypile.entities.SelectEquipment;

@Repository
public interface SelectEquipmentDao extends JpaRepository<SelectEquipment, Long> {
    SelectEquipment findFirstByClientName(String clientName);
}
