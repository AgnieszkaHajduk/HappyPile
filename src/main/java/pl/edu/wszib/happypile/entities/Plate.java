package pl.edu.wszib.happypile.entities;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "plates")
public class Plate {

    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "name")
    private String name;
    @Column(name = "size")
    private String size;
    @Column(name = "international_unit")
    private String internationalUnit;
    @Column(name = "weight")
    private Double weight;
    @Column(name = "price")
    private BigDecimal price;
    @OneToOne(mappedBy = "plate")
    private Equipment equipment;

    public Plate() {
    }

    public Plate(String id, String name, String size, String internationalUnit, Double weight, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.size = size;
        this.internationalUnit = internationalUnit;
        this.weight = weight;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getInternationalUnit() {
        return internationalUnit;
    }

    public void setInternationalUnit(String internationalUnit) {
        this.internationalUnit = internationalUnit;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }
}
