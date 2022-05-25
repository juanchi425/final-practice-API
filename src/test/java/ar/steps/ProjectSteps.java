package ar.steps;

import ar.validator.WorkspaceValidator;
import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import services.BaseService;
import services.ProjectService;

public class ProjectSteps extends PageSteps {


    @Given("un Api-Key valido")
    public void unApiKeyValido() {
        ProjectService.API_KEY.set("Y2UxNTAyNDYtMmIwYy00ZjM4LWI5NWYtZDFiOTYyYjI0NTkw");

    }

    @And("un Worspace-id valido")
    public void unWorspaceIdValido() {
        ProjectService.W_SPACE.set("628807ae3bf26277d6055a6e");
    }

    @Then("Obtengo los los projectos de mi Worspace")
    public void obtengoLosLosProjectosDeMiWorspace() {
    }
}
