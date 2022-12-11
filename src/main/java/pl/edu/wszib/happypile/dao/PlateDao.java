package pl.edu.wszib.happypile.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.happypile.entities.Plate;

@Repository
public interface PlateDao extends JpaRepository<Plate, String> {
    Plate findPlateBySize(String size);
}
