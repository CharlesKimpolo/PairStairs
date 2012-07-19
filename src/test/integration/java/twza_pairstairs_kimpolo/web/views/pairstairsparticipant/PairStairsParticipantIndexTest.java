package twza_pairstairs_kimpolo.web.views.pairstairsparticipant;


import org.junit.Test;
import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareModelMap;
import twza_pairstairs_kimpolo.domain.model.PairStairsParticipant;
import twza_pairstairs_kimpolo.web.views.ViewTest;

import static org.junit.Assert.assertEquals;

public class PairStairsParticipantIndexTest extends ViewTest {

    public static final String VIEW_NAME = "pairstairparticipant/index";

    @Test
    public void shouldDisplayListOfThingies() throws Exception {
        Model model = new BindingAwareModelMap() {{
            put("pairstairsparticipantList", new PairStairsParticipant[]{new PairStairsParticipant("Bob")});
        }};
        String result = render(VIEW_NAME, model);

        // TODO: Make this a sensible assertion and implement the view accordingly
        assertEquals("INDEX", result.trim());
    }
}