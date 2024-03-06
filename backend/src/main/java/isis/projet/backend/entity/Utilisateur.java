package isis.projet.backend.entity;
import jakarta.persistence.*;
import lombok.*;

@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity
public class Utilisateur {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_Utilisateur;

    @Column @NonNull
    private String nom;

    @Column @NonNull
    private String prenom;

    @Column @NonNull
    private int age;

    @Column
    private float taille;

}
