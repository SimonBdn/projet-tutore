package isis.projet.backend.entity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity
public class Seance {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int num_Seance;

    @Column @NonNull
    private LocalDate date_Seance;

    @Column @NonNull
    private LocalDateTime debut_Seance;

    @Column @NonNull
    private LocalDateTime fin_Seance;

    @Column
    private float distance;

    @Column
    private int denivele;

    @Column
    private String formulaire_Fin_Seance;


}
