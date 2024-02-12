package isis.projet.backend.entity;
import jakarta.persistence.*;
import lombok.*;

@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity
public class BPM {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_BPM;

}
