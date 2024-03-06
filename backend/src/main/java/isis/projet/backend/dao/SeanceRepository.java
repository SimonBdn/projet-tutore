package isis.projet.backend.dao;

import isis.projet.backend.entity.DonneesCapteur;
import org.springframework.data.jpa.repository.JpaRepository;
public interface SeanceRepository extends JpaRepository<DonneesCapteur, Integer>{
}
