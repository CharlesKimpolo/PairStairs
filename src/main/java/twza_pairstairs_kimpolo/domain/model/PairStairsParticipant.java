package twza_pairstairs_kimpolo.domain.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PairStairsParticipant {
    @Id
    private int id;

    @NotEmpty
    private String name;

    private PairStairsParticipant() { /* for hibernate */ }

    public PairStairsParticipant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
