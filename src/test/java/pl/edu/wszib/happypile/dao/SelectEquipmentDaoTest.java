package pl.edu.wszib.happypile.dao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.edu.wszib.happypile.entities.SelectEquipment;

import javax.transaction.Transactional;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class SelectEquipmentDaoTest {

    public static final String QUOTE_KELLER = "Keller";
    public static final String QUOTE_POLBUD = "Polbud";
    public static final String QUOTE_TERGON = "Tergon";
    public static final int TOTAL_QUOTES = 3;

    @Autowired
    SelectEquipmentDao selectEquipmentDao;

    @BeforeEach
    void setUp() {
        SelectEquipment selectEquipment1 = new SelectEquipment("Keller", 5, 7.5, 350.0, 1.5, 1, "Nakrętka kulista", 1, "200x200x20");
        SelectEquipment selectEquipment2 = new SelectEquipment("Polbud", 10, 10.0, 550.0, 2.0, 2, "Nakrętka HEX", 2, "250x250x30");
        SelectEquipment selectEquipment3 = new SelectEquipment("Tergon", 7, 6.0, 200.0, 3.0, 1, "Nakrętka kulista galv", 2, "150x150x8");

        assertNull(selectEquipment1.getId());
        assertNull(selectEquipment2.getId());
        assertNull(selectEquipment3.getId());

        selectEquipmentDao.save(selectEquipment1);
        selectEquipmentDao.save(selectEquipment2);
        selectEquipmentDao.save(selectEquipment3);

        assertNotNull(selectEquipment1.getId());
        assertNotNull(selectEquipment2.getId());
        assertNotNull(selectEquipment3.getId());
    }

    @Test
    void testFetchData() {
        SelectEquipment selectEquipment = selectEquipmentDao.findFirstByClientName(QUOTE_KELLER);
        assertEquals(QUOTE_KELLER, selectEquipment.getClientName(), "Znaleziono nieprawidłową wycenę!");
    }

    @Test
    void testFetchAllData() {
        Collection selectEquipment = (Collection) selectEquipmentDao.findAll();
        assertEquals(TOTAL_QUOTES, selectEquipment.size(), "Nieprawidłowa ilość wycen!");
    }
}