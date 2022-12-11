package pl.edu.wszib.happypile.models;

import pl.edu.wszib.happypile.entities.*;

public class EquipmentModel {

    private SelectEquipment selectEquipment;
    private Bar bar;
    private int barsQuantity;
    private Coupling coupling;
    private int couplingsQuantity;
    private Nut nut;
    private Plate plate;

    public EquipmentModel() {
    }

    public EquipmentModel(SelectEquipment selectEquipment, Bar bar, int barsQuantity, Coupling coupling, int couplingsQuantity, Nut nut, Plate plate) {
        this.selectEquipment = selectEquipment;
        this.bar = bar;
        this.barsQuantity = barsQuantity;
        this.coupling = coupling;
        this.couplingsQuantity = couplingsQuantity;
        this.nut = nut;
        this.plate = plate;
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
