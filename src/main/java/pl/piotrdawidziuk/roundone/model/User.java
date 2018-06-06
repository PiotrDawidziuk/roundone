package pl.piotrdawidziuk.roundone.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    String username;



    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    List<Practice> practices;





}