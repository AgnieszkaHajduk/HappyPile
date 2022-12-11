package pl.edu.wszib.happypile.dao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.edu.wszib.happypile.entities.Bar;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class BarDaoTest {

    public static final double RR03204S = 200;
    public static final double RR03805S = 300;
    public static final double RR05107S = 510;
    public static final int TOTAL_BARS = 3;

    @Autowired
    BarDao barDao;

    @BeforeEach
    void setUp() {
        Bar bar1 = new Bar("RR03204S", "Żerdź samowiercąca", "R32", "4,5S", 240, 200.0, "mb", 2.75, new BigDecimal("8.50"));
        Bar bar2 = new Bar("RR03805S", "Żerdź samowiercąca", "R38", "5,2S", 350, 300.0, "mb", 4.05, new BigDecimal("12.50"));
        Bar bar3 = new Bar("RR05107S", "Żerdź samowiercąca", "R51", "7,1S", 610, 510.0, "mb", 7.38, new BigDecimal("22.00"));

        barDao.save(bar1);
        barDao.save(bar2);
        barDao.save(bar3);

        assertNotNull(bar1.getId());
        assertNotNull(bar2.getId());
        assertNotNull(bar3.getId());
    }

    @Test
    void testFetchData() {
        Bar bar = barDao.findByYieldLoad(RR03204S);
        assertEquals(RR03204S, bar.getYieldLoad(), "Znaleziono nieprawidłową żerdź!");
    }

    @Test
    void testFetchAllData() {
        Collection bar = (Collection) barDao.findAll();
        assertEquals(TOTAL_BARS, bar.size(), "Nieprawidłowa ilość żerdzi!");
    }
}