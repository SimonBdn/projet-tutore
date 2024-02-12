package isis.projet.backend.entity;
import jakarta.persistence.*;
import lombok.*;

@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity
public class BPM extends DonneesCapteur{
        private int value_BPM;
}
