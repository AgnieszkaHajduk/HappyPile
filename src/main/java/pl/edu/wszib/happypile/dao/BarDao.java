package pl.edu.wszib.happypile.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.happypile.entities.Bar;

@Repository
public interface BarDao extends JpaRepository<Bar, String> {
    Bar findByYieldLoad(double chosenYieldLoad);
}
