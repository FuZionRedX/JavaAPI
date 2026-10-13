package fr.ece.debute.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Teacher extends User {
    @ManyToMany
    @JoinTable(
            name = "teacher_topic",
            joinColumns =  @JoinColumn(name = "topic_id" ),
            inverseJoinColumns = @JoinColumn(name = "teacher_id")
    )
    private List<Topic> topics;

}
