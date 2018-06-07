package pl.piotrdawidziuk.roundone.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "practices")
public class Practice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    String day;
    int duration;

    @ManyToOne
    User user;

    @OneToMany(mappedBy = "user")
    List<Fighter> fighters;



}
