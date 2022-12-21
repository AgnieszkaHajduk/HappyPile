package pl.edu.wszib.happypile.models;

import pl.edu.wszib.happypile.entities.Bar;
import pl.edu.wszib.happypile.entities.Coupling;
import pl.edu.wszib.happypile.entities.Nut;
import pl.edu.wszib.happypile.entities.Plate;
import javax.validation.constraints.*;

public class SelectEquipmentModel {

    @NotEmpty
    @Size(min = 3)
    private String clientName;
    @NotNull
    @Min(1)
    private Integer pilesQuantity;
    @NotNull
    @Min(1)
    @Max(30)
    private Double depth;
    @NotNull
    @Min(1)
    private Double capacity;
    private Double singleBarLength;
    private Integer nutsQuantity;
    private String nutType;
    private Integer platesQuantity;
    private String plateSize;
    private Bar bar;
    private int barsQuantity;
    private Coupling coupling;
    private int couplingsQuantity;
    private Nut nut;
    private Plate plate;

    public SelectEquipmentModel() {
    }

    public SelectEquipmentModel(String clientName, Integer pilesQuantity, Double depth, Double capacity, Double singleBarLength, Integer nutsQuantity, String nutType, Integer platesQuantity, String plateSize, Bar bar, int barsQuantity, Coupling coupling, int couplingsQuantity, Nut nut, Plate plate) {
        this.clientName = clientName;
        this.pilesQuantity = pilesQuantity;
        this.depth = depth;
        this.capacity = capacity;
        this.singleBarLength = singleBarLength;
        this.nutsQuantity = nutsQuantity;
        this.nutType = nutType;
        this.platesQuantity = platesQuantity;
        this.plateSize = plateSize;
        this.bar = bar;
        this.barsQuantity = barsQuantity;
        this.coupling = coupling;
        this.couplingsQuantity = couplingsQuantity;
        this.nut = nut;
        this.plate = plate;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Integer getPilesQuantity() {
        return pilesQuantity;
    }

    public void setPilesQuantity(Integer pilesQuantity) {
        this.pilesQuantity = pilesQuantity;
    }

    public Double getDepth() {
        return depth;
    }

    public void setDepth(Double depth) {
        this.depth = depth;
    }

    public Double getCapacity() {
        return capacity;
    }

    public void setCapacity(Double capacity) {
        this.capacity = capacity;
    }

    public Double getSingleBarLength() {
        return singleBarLength;
    }

    public void setSingleBarLength(Double singleBarLength) {
        this.singleBarLength = singleBarLength;
    }

    public Integer getNutsQuantity() {
        return nutsQuantity;
    }

    public void setNutsQuantity(Integer nutsQuantity) {
        this.nutsQuantity = nutsQuantity;
    }

    public String getNutType() {
        return nutType;
    }

    public void setNutType(String nutType) {
        this.nutType = nutType;
    }

    public Integer getPlatesQuantity() {
        return platesQuantity;
    }

    public void setPlatesQuantity(Integer platesQuantity) {
        this.platesQuantity = platesQuantity;
    }

    public String getPlateSize() {
        return plateSize;
    }

    public void setPlateSize(String plateSize) {
        this.plateSize = plateSize;
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
