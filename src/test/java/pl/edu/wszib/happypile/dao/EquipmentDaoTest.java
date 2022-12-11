package pl.edu.wszib.happypile.dao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.edu.wszib.happypile.entities.*;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class EquipmentDaoTest {

    public static final String QUOTE_KELLER = "Keller";
    public static final String QUOTE_POLBUD = "Polbud";
    public static final String QUOTE_TERGON = "Tergon";
    public static final int TOTAL_QUOTES = 3;

    @Autowired
    EquipmentDao equipmentDao;

    @BeforeEach
    void setUp() {

        SelectEquipment selectEquipment1 = new SelectEquipment("Keller", 5, 7.5, 350.0, 1.5, 1, "Nakrętka kulista", 1, "200x200x20");
        SelectEquipment selectEquipment2 = new SelectEquipment("Polbud", 10, 10.0, 550.0, 2.0, 2, "Nakrętka HEX", 2, "250x250x30");
        SelectEquipment selectEquipment3 = new SelectEquipment("Tergon", 7, 6.0, 200.0, 3.0, 1, "Nakrętka kulista galv", 2, "150x150x8");

        Bar bar1 = new Bar("RR03204S", "Żerdź samowiercąca", "R32", "4,5S", 240, 200.0, "mb", 2.75, new BigDecimal("8.50"));
        Bar bar2 = new Bar("RR03805S", "Żerdź samowiercąca", "R38", "5,2S", 350, 300.0, "mb", 4.05, new BigDecimal("12.50"));
        Bar bar3 = new Bar("RR05107S", "Żerdź samowiercąca", "R51", "7,1S", 610, 510.0, "mb", 7.38, new BigDecimal("22.00"));

        Coupling coupling1 = new Coupling("RM032NA", "Łącznik", "R32", "szt", 0.95, new BigDecimal("3.20"));
        Coupling coupling2 = new Coupling("RM038NA", "Łącznik", "R38", "szt", 1.2, new BigDecimal("6.70"));
        Coupling coupling3 = new Coupling("RM051NA", "Łącznik", "R51", "szt", 2.2, new BigDecimal("7.50"));

        Nut nut1 = new Nut("RD032D", "Nakrętka kulista", "R32", "szt", 0.55, new BigDecimal("4.80"));
        Nut nut2 = new Nut("RD051D", "Nakrętka kulista", "R51", "szt", 1.7, new BigDecimal("15.00"));
        Nut nut3 = new Nut("RD032L", "Nakrętka HEX", "R32", "szt", 0.48, new BigDecimal("6.00"));

        Plate plate1 = new Plate("PR150x8", "Płyta oporowa", "150x150x8", "szt", 1.4, new BigDecimal("3.20"));
        Plate plate2 = new Plate("PR150x10", "Płyta oporowa", "150x150x10", "szt", 1.7, new BigDecimal("4.00"));
        Plate plate3 = new Plate("PR250x30", "Płyta oporowa", "250x250x30", "szt", 14.7, new BigDecimal("41.20"));

        Equipment equipment1 = new Equipment(selectEquipment1, bar1, 25, coupling1, 24, nut1, plate1);
        Equipment equipment2 = new Equipment(selectEquipment2, bar2, 25, coupling2, 24, nut2, plate2);
        Equipment equipment3 = new Equipment(selectEquipment3, bar3, 25, coupling3, 24, nut3, plate3);

        assertNull(equipment1.getId());
        assertNull(equipment2.getId());
        assertNull(equipment3.getId());

        equipmentDao.save(equipment1);
        equipmentDao.save(equipment2);
        equipmentDao.save(equipment3);

        assertNotNull(equipment1.getId());
        assertNotNull(equipment2.getId());
        assertNotNull(equipment3.getId());
    }

    @Test
    void testFetchData() {
        Equipment equipment = equipmentDao.findFirstBySelectEquipment_ClientName(QUOTE_KELLER);
        assertEquals(QUOTE_KELLER, equipment.getSelectEquipment().getClientName(), "Znaleziono nieprawidłową wycenę!");
    }

    @Test
    void testFetchAllData() {
        Collection equipment = (Collection) equipmentDao.findAll();
        assertEquals(TOTAL_QUOTES, equipment.size(), "Nieprawidłowa ilość wycen!");
    }
}