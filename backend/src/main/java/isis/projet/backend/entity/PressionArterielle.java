package isis.projet.backend.entity;
import jakarta.persistence.*;
import lombok.*;

@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity
public class PressionArterielle extends DonneesCapteur{

    @Column @NonNull
    private int value_PressionArterielle;

}