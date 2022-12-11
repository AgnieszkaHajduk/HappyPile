package pl.edu.wszib.happypile.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.happypile.entities.Nut;

@Repository
public interface NutDao extends JpaRepository<Nut, String> {
    Nut findNutByTypeAndDiameter(String type, String diameter);
}
