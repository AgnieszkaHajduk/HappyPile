package pl.edu.wszib.happypile.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.happypile.entities.Coupling;

@Repository
public interface CouplingDao extends JpaRepository<Coupling, String> {
    Coupling findCouplingByDiameter(String diameter);
}
