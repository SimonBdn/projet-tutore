package isis.projet.backend.entity;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity
public class Poids {

    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_Poids;

    @Column @NonNull
    private Date date_mesure;

    @Column @NonNull
    private float value_Poids;


}
