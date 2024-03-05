package isis.projet.backend.entity;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity
public class Antecedent {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_Antecedent;

    @Column @NonNull
    private Date date_evenement;

    @Column @NonNull
    private boolean operation;

    @Column
    private String detail;

    @Column
    private String diagnostic;

}
