package pl.edu.wszib.happypile.dao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.edu.wszib.happypile.entities.Plate;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class PlateDaoTest {

    public static final String PR150x8 = "150x150x8";
    public static final String PR150x10 = "150x150x10";
    public static final String PR250x30 = "250x250x30";
    public static final int TOTAL_PLATES = 3;

    @Autowired
    PlateDao plateDao;

    @BeforeEach
    void setUp() {
        Plate plate1 = new Plate("PR150x8", "Płyta oporowa", "150x150x8", "szt", 1.4, new BigDecimal("3.20"));
        Plate plate2 = new Plate("PR150x10", "Płyta oporowa", "150x150x10", "szt", 1.7, new BigDecimal("4.00"));
        Plate plate3 = new Plate("PR250x30", "Płyta oporowa", "250x250x30", "szt", 14.7, new BigDecimal("41.20"));

        plateDao.save(plate1);
        plateDao.save(plate2);
        plateDao.save(plate3);
    }

    @Test
    void testFetchData() {
        Plate plate = plateDao.findPlateBySize(PR150x8);
        assertEquals(PR150x8, plate.getSize(), "Znaleziono nieprawidłową płytę oporową!");
    }

    @Test
    void testFetchAllData() {
        Collection plate = (Collection) plateDao.findAll();
        assertEquals(TOTAL_PLATES, plate.size(), "Nieprawidłowa ilość płyt oporowych!");
    }

}