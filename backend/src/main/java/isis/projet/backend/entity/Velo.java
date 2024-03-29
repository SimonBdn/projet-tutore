package isis.projet.backend.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity

public class Velo {

    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_Velo;

    @Column
    @NonNull
    private String type_Velo;

    @Column
    @NonNull
    private String modele_Velo;

    @Column
    private String puissanceW_Velo;
}
