package pl.piotrdawidziuk.roundone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.piotrdawidziuk.roundone.model.Practice;

public interface PracticeRepository extends JpaRepository <Practice, Long> {

}
