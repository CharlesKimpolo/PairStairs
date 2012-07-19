package twza_pairstairs_kimpolo.web.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import twza_pairstairs_kimpolo.domain.model.PairStairsParticipant;


@org.springframework.stereotype.Controller


@RequestMapping(PairStairsParticipantController.ROUTE)
public class PairStairsParticipantController {

    static final String ROUTE = "/pairstairparticipant";

    @RequestMapping
    public String index() {
        return viewName("index");
    }

    @RequestMapping(value = "", method = RequestMethod.POST) // Find out more on the PUT method
    public String create() {
        new PairStairsParticipant("utuytgtuy");

        return viewName("create");
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String show(@PathVariable String id) {
        return viewName("show");
    }

    @RequestMapping(value = "/{id}/edit", method = RequestMethod.GET)
    public String edit(@PathVariable String id) {
        return viewName("edit");
    }

    @RequestMapping(value = "/new", method = RequestMethod.GET)
    public String newObject() {
        return viewName("newObject");
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)  // Find out more on the PUT method
    public String update(@PathVariable String id) {
        return viewName("update");
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE) // Find out more on the DELETE method
    public String destroy(@PathVariable String id) {
        return viewName("destroy");
    }

    private String viewName(String name) {
        return String.format("%s/%s", ROUTE, name);
    }
}
