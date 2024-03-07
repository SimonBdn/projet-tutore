package isis.projet.backend.dao;

import isis.projet.backend.entity.DonneesCapteur;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UtillisateurRepository extends JpaRepository<DonneesCapteur, Integer>{
}
