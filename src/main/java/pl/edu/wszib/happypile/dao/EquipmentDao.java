package pl.edu.wszib.happypile.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.happypile.entities.Equipment;

@Repository
public interface EquipmentDao extends JpaRepository<Equipment, Long> {
    Equipment findFirstBySelectEquipment_ClientName(String clientName);
}
