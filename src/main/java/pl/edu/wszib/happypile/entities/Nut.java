package pl.edu.wszib.happypile.entities;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "nuts")
public class Nut {

    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "type")
    private String type;
    @Column(name = "diameter")
    private String diameter;
    @Column(name = "international_unit")
    private String internationalUnit;
    @Column(name = "weight")
    private Double weight;
    @Column(name = "price")
    private BigDecimal price;
    @OneToOne(mappedBy = "nut")
    private SelectEquipment selectEquipment;

    public Nut() {
    }

    public Nut(String id, String type, String diameter, String internationalUnit, Double weight, BigDecimal price) {
        this.id = id;
        this.type = type;
        this.diameter = diameter;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDiameter() {
        return diameter;
    }

    public void setDiameter(String diameter) {
        this.diameter = diameter;
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

    public SelectEquipment getSelectEquipment() {
        return selectEquipment;
    }

    public void setSelectEquipment(SelectEquipment selectEquipment) {
        this.selectEquipment = selectEquipment;
    }
}
