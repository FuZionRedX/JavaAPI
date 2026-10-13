package fr.ece.debute.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Data
@Entity
public class Topic {
    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
    private UUID id;

    private String label;

    @ManyToMany(mappedBy = "topics")
    private List<Teacher> teachers;

    @ManyToMany(mappedBy = "topics")
    private List<Groupe> groupes;

}
