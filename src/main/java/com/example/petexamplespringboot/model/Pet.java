package com.example.petexamplespringboot.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "pets")
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private int age;

    private String species;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pet")
    @JsonManagedReference
    private List<Toy> toys = new ArrayList<>();


    @ManyToMany
    @JoinTable(
            name="pet_vet",
            joinColumns={@JoinColumn(name="pet_id")},
            inverseJoinColumns={@JoinColumn(name="vet_id")}
    )
    @JsonManagedReference
    private List<Vet> vets = new ArrayList<>();

    public Pet() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public List<Toy> getToys() {
        return toys;
    }

    public void setToys(List<Toy> toys) {
        this.toys = toys;
    }

    public List<Vet> getVets() {
        return vets;
    }

    public void setVets(List<Vet> vets) {
        this.vets = vets;
    }
}
