package pl.edu.wszib.happypile.entities;

import javax.persistence.*;

@Entity
@Table(name = "equipment")
public class Equipment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne(cascade = CascadeType.ALL)
    private SelectEquipment selectEquipment;
    @OneToOne(cascade = CascadeType.ALL)
    private Bar bar;
    @Transient
    private int barsQuantity;
    @OneToOne(cascade = CascadeType.ALL)
    private Coupling coupling;
    @Transient
    private int couplingsQuantity;
    @OneToOne(cascade = CascadeType.ALL)
    private Nut nut;
    @OneToOne(cascade = CascadeType.ALL)
    private Plate plate;

    public Equipment() {
    }

    public Equipment(SelectEquipment selectEquipment, Bar bar, int barsQuantity, Coupling coupling, int couplingsQuantity, Nut nut, Plate plate) {
        this.selectEquipment = selectEquipment;
        this.bar = bar;
        this.barsQuantity = barsQuantity;
        this.coupling = coupling;
        this.couplingsQuantity = couplingsQuantity;
        this.nut = nut;
        this.plate = plate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SelectEquipment getSelectEquipment() {
        return selectEquipment;
    }

    public void setSelectEquipment(SelectEquipment selectEquipment) {
        this.selectEquipment = selectEquipment;
    }

    public Bar getBar() {
        return bar;
    }

    public void setBar(Bar bar) {
        this.bar = bar;
    }

    public int getBarsQuantity() {
        return barsQuantity;
    }

    public void setBarsQuantity(int barsQuantity) {
        this.barsQuantity = barsQuantity;
    }

    public Coupling getCoupling() {
        return coupling;
    }

    public void setCoupling(Coupling coupling) {
        this.coupling = coupling;
    }

    public int getCouplingsQuantity() {
        return couplingsQuantity;
    }

    public void setCouplingsQuantity(int couplingsQuantity) {
        this.couplingsQuantity = couplingsQuantity;
    }

    public Nut getNut() {
        return nut;
    }

    public void setNut(Nut nut) {
        this.nut = nut;
    }

    public Plate getPlate() {
        return plate;
    }

    public void setPlate(Plate plate) {
        this.plate = plate;
    }
}
