package pl.piotrdawidziuk.roundone.model;

import javax.persistence.*;

@Entity
@Table (name = "figters")
public class Fighter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    String name;

}