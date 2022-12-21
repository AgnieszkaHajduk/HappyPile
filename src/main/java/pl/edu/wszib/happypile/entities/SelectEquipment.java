package pl.edu.wszib.happypile.entities;

import javax.persistence.*;

@Entity
@Table(name = "select_equipment")
public class SelectEquipment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "client_name")
    private String clientName;
    @Column(name = "piles_quantity")
    private Integer pilesQuantity;
    @Column(name = "depth")
    private Double depth;
    @Column(name = "capacity")
    private Double capacity;
    @Column(name = "single_bar_length")
    private Double singleBarLength;
    @Column(name = "nuts_quantity")
    private Integer nutsQuantity;
    @Column(name = "nut_type")
    private String nutType;
    @Column(name = "plates_quantity")
    private Integer platesQuantity;
    @Column(name = "plate_size")
    private String plateSize;
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

    public SelectEquipment() {
    }

    public SelectEquipment(String clientName, Integer pilesQuantity, Double depth, Double capacity, Double singleBarLength, Integer nutsQuantity, String nutType, Integer platesQuantity, String plateSize, Bar bar, int barsQuantity, Coupling coupling, int couplingsQuantity, Nut nut, Plate plate) {
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
