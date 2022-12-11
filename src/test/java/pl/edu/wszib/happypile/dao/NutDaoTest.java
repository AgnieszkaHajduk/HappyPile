package pl.edu.wszib.happypile.dao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.edu.wszib.happypile.entities.Nut;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class NutDaoTest {

    public static final String KULISTA = "Nakrętka kulista";
    public static final String HEX = "Nakrętka HEX";
    public static final String R32 = "R32";
    public static final String R51 = "R51";

    public static final int TOTAL_NUTS = 3;

    @Autowired
    NutDao nutDao;

    @BeforeEach
    void setUp() {
        Nut nut1 = new Nut("RD032D", "Nakrętka kulista", "R32", "szt", 0.55, new BigDecimal("4.80"));
        Nut nut2 = new Nut("RD051D", "Nakrętka kulista", "R51", "szt", 1.7, new BigDecimal("15.00"));
        Nut nut3 = new Nut("RD032L", "Nakrętka HEX", "R32", "szt", 0.48, new BigDecimal("6.00"));

        nutDao.save(nut1);
        nutDao.save(nut2);
        nutDao.save(nut3);

        assertNotNull(nut1.getId());
        assertNotNull(nut2.getId());
        assertNotNull(nut3.getId());
    }

    @Test
    void testFetchData() {
        Nut nut = nutDao.findNutByTypeAndDiameter(KULISTA, R32);
        assertEquals(KULISTA, nut.getType(), "Znaleziono nieprawidłową nakrętkę!");
        assertEquals(R32, nut.getDiameter(), "Znaleziono nieprawidłową nakrętkę!");
    }

    @Test
    void testFetchAllData() {
        Collection nut = (Collection) nutDao.findAll();
        assertEquals(TOTAL_NUTS, nut.size(), "Nieprawidłowa ilość nakrętek!");
    }
}