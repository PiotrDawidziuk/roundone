package pl.piotrdawidziuk.roundone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.piotrdawidziuk.roundone.model.Fighter;

public interface FighterRepository extends JpaRepository <Fighter, Long> {

}
