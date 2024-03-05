package isis.projet.backend.entity;

import isis.projet.backend.config.SpringDataRestConfig;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Date;

@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity
public class Traitement {

    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_Traitement;

    @Column @NonNull
    private Date date_debut_Traitement;

    @Column
    private Date date_fin_Traitement;

    @Column @NonNull
    private String nom_medicament;

    @Column @NonNull
    private float dose_medicament;

    @Column @NonNull
    private LocalDateTime periodicite_medicament;

}
