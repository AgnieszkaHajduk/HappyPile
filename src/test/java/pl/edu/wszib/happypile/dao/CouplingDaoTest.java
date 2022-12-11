package pl.edu.wszib.happypile.dao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.edu.wszib.happypile.entities.Coupling;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class CouplingDaoTest {

    private static final String COUPLING_R32 = "R32";
    private static final String COUPLING_R38 = "R38";
    private static final String COUPLING_R51 = "R51";
    private static final int TOTAL_COUPLINGS = 3;

    @Autowired
    CouplingDao couplingDao;

    @BeforeEach
    void setUp() {
        Coupling coupling1 = new Coupling("RM032NA", "Łącznik", "R32", "szt", 0.95, new BigDecimal("3.20"));
        Coupling coupling2 = new Coupling("RM038NA", "Łącznik", "R38", "szt", 1.2, new BigDecimal("6.70"));
        Coupling coupling3 = new Coupling("RM051NA", "Łącznik", "R51", "szt", 2.2, new BigDecimal("7.50"));

        couplingDao.save(coupling1);
        couplingDao.save(coupling2);
        couplingDao.save(coupling3);

        assertNotNull(coupling1.getId());
        assertNotNull(coupling2.getId());
        assertNotNull(coupling3.getId());
    }

    @Test
    void testFetchData() {
        Coupling coupling = couplingDao.findCouplingByDiameter(COUPLING_R32);
        assertEquals(COUPLING_R32, coupling.getDiameter(), "Znaleziono nieprawidłowy łącznik!");
    }

    @Test
    void testFetchAllData() {
        Collection coupling = (Collection) couplingDao.findAll();
        assertEquals(TOTAL_COUPLINGS, coupling.size(), "Nieprawidłowa ilość łączników!");
    }
}