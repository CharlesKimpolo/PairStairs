package twza_pairstairs_kimpolo.domain.repository;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import twza_pairstairs_kimpolo.IntegrationTest;
import twza_pairstairs_kimpolo.domain.model.PairStairsParticipant;

import static org.hibernate.validator.internal.util.Contracts.*;
import static util.SessionFactoryExtensions.*;

public class GenericRepositoryTest extends IntegrationTest {

    private Repository<PairStairsParticipant> repository;

    @Before
    public void setUp() throws Exception {
        repository = new GenericRepository<PairStairsParticipant>(sessionFactory, PairStairsParticipant.class);
    }

    @Test
    public void should_save_a_new_object() throws Exception {
        PairStairsParticipant pairStairsParticipant = new PairStairsParticipant("Hello World!");
        repository.save(pairStairsParticipant);

        assertNotNull(reload(sessionFactory, pairStairsParticipant));
    }

    // TODO : Implement remaining tests for the repository
    @Test
    @Ignore
    public void should_retrieve_an_object_by_id() throws Exception {
        throw new UnsupportedOperationException("Not Yet Implemented");
    }

    @Test
    @Ignore
    public void should_retrieve_all_objects() throws Exception {
        throw new UnsupportedOperationException("Not Yet Implemented");
    }

    @Test
    @Ignore
    public void should_retrieve_all_objects_matching_a_specified_field_value() throws Exception {
        throw new UnsupportedOperationException("Not Yet Implemented");
    }

    @Test
    @Ignore
    public void should_retrieve_a_single_object_matching_a_specified_field_value() throws Exception {
        throw new UnsupportedOperationException("Not Yet Implemented");
    }

    @Test
    @Ignore
    public void should_update_an_object() throws Exception {
        throw new UnsupportedOperationException("Not Yet Implemented");
    }

    @Test
    @Ignore
    public void should_delete_an_object() throws Exception {
        throw new UnsupportedOperationException("Not Yet Implemented");
    }
}
