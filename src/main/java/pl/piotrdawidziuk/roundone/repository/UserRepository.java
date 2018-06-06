package pl.piotrdawidziuk.roundone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.piotrdawidziuk.roundone.model.User;

public interface UserRepository extends JpaRepository <User, Long> {

}
