package pl.edu.wszib.happypile.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "bars")
public class Bar {

    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "name")
    private String name;
    @Column(name = "diameter")
    private String diameter;
    @Column(name = "wall_thickness")
    private String wallThickness;
    @Column(name = "ultimate_load")
    private Integer ultimateLoad;
    @Column(name = "yield_load")
    private Double yieldLoad;
    @Column(name = "international_unit")
    private String internationalUnit;
    @Column(name = "weight")
    private Double weight;
    @Column(name = "price")
    private BigDecimal price;
    @OneToMany(mappedBy = "bar")
    private List<SelectEquipment> selectEquipment;

    public Bar() {
    }

    public Bar(String id, String name, String diameter, String wallThickness, Integer ultimateLoad, Double yieldLoad, String internationalUnit, Double weight, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.diameter = diameter;
        this.wallThickness = wallThickness;
        this.ultimateLoad = ultimateLoad;
        this.yieldLoad = yieldLoad;
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

    public String getWallThickness() {
        return wallThickness;
    }

    public void setWallThickness(String wallThickness) {
        this.wallThickness = wallThickness;
    }

    public String getDiameter() {
        return diameter;
    }

    public void setDiameter(String diameter) {
        this.diameter = diameter;
    }

    public Double getYieldLoad() {
        return yieldLoad;
    }

    public void setYieldLoad(Double yieldLoad) {
        this.yieldLoad = yieldLoad;
    }

    public Integer getUltimateLoad() {
        return ultimateLoad;
    }

    public void setUltimateLoad(Integer ultimateLoad) {
        this.ultimateLoad = ultimateLoad;
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

    public List<SelectEquipment> getSelectEquipment() {
        return selectEquipment;
    }

    public void setSelectEquipment(List<SelectEquipment> selectEquipment) {
        this.selectEquipment = selectEquipment;
    }
}
