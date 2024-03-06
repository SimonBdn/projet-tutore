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

    @Column @NonNull
    private Date date_Donnee;

    @Column @NonNull
    private Time heure_Donnee;

    @ManyToOne
    @JoinColumn(name = "num_Seance")
    private Seance seance;

}
