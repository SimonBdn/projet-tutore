package isis.projet.backend.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity

public class Velo {

    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    @NonNull
    private String type;

    @Column
    @NonNull
    private String modele;

    @Column
    private String puissanceW;
}
