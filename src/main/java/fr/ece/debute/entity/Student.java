package fr.ece.debute.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class Student extends User{
    @ManyToOne
    private Groupe groupe;

}
