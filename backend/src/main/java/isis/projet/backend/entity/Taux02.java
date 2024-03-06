package isis.projet.backend.entity;
import jakarta.persistence.*;
import lombok.*;

@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity
public class Taux02 extends DonneesCapteur{
    @Column @NonNull
    private int value_Taux02;
}
