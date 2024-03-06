package isis.projet.backend.entity;
import isis.projet.backend.dao.SeanceRepository;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;


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

    public void enregistrerDonnéesCardiaques(List<DonneesCapteur> donneesCardiaques) {
        for (DonneesCapteur donneeCardiaque : donneesCardiaques) {
            donneeCardiaque.setSeance(this);
        }
        // Ne sauvegardez pas la séance ici, cela devrait être géré par la couche de service
    }
}
