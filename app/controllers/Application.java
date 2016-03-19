package controllers;

import models.Item;
import play.db.jpa.JPA;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

public class Application extends Controller {
    @Transactional
    public Result index() {
        Item i = new Item();
        i.name = "item1";
        JPA.em().persist(i);

        return ok(index.render("Your new application is ready."));
    }

}
