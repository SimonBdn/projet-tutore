package isis.projet.backend.entity;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Time;
import java.util.Date;

@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity
public class DonneesCapteur {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_Donnee;
    private Date date_Donnee;
    private Time heure_Donnee;

}
