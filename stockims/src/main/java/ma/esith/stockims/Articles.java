package ma.esith.stockims;

import jakarta.persistence.*;
import lombok.*;
@Entity
@Table(name = "article")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)

public class Articles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true, length = 20)
    private String reference;
     @Column(nullable = false, length = 80)
    private String designation;

    public Articles(String reference, String designation) {
        if (reference == null || reference.isBlank() || reference.length() > 20) {
            throw new IllegalArgumentException("Référence invalide.");
        }
        if (designation == null || designation.isBlank() || designation.length() > 80) {
            throw new IllegalArgumentException("Désignation invalide.");
        }

        this.reference = reference.trim();
        this.designation = designation.trim();
    }
}
