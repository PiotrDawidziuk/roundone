package pl.piotrdawidziuk.roundone.model;

import javax.persistence.*;

@Entity
@Table (name = "practices")
public class Practice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    String day;
    int duration;
    

}
