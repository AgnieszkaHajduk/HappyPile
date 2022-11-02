package pl.edu.wszib.happypile.entities;

import javax.persistence.*;

@Entity
@Table(name= "piles")
public class Pile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "number_of_piles")
    private Integer numberOfPiles;
    @Column(name = "depth")
    private Double depth;
    @Column(name = "capacity")
    private Integer capacity;

    public Pile(){}

    public Pile(Integer numberOfPiles, Double depth, Integer capacity) {
        this.numberOfPiles = numberOfPiles;
        this.depth = depth;
        this.capacity = capacity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumberOfPiles() {
        return numberOfPiles;
    }

    public void setNumberOfPiles(Integer numberOfPiles) {
        this.numberOfPiles = numberOfPiles;
    }

    public Double getDepth() {
        return depth;
    }

    public void setDepth(Double depth) {
        this.depth = depth;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

}
