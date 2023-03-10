package com.example.demo.ModelClass;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "cleaners")
public class Cleaner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String surname;


    @ManyToMany(mappedBy = "cleanerSet")
    private Set<Room> roomSet;


    public Set<Room> getRoomSet() {
        return roomSet;
    }

    public void setRoomSet(Set<Room> roomSet) {
        this.roomSet = roomSet;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Cleaner(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Cleaner() {
    }
}
