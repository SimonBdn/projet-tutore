package isis.projet.backend.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity // Une entité JPA
public class Velo {
    // Identifiant technique
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    // Identifiant métier (code ISO)
    @Column(unique=true)
    @NonNull
    private String type;

    @Column(unique=true)
    @NonNull
    private String modele;

    @Column(unique=true)
    private String puissanceW;
}
// pas fini cest pas formément unique le modele et la puissance non plus