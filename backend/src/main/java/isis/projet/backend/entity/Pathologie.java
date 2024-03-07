package isis.projet.backend.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
@Entity
public class Pathologie {

    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_Pathologie;

    @Column
    private String value_Pathologie;
}
