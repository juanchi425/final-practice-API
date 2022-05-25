package ar.steps;

import ar.validator.WorkspaceValidator;
import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import services.BaseService;
import services.ProjectService;

public class ProjectSteps extends PageSteps {

    @Given("Mi cuenta creada en clockify y mi X-Api-Key geneada")
    public void miCuentaCreadaEnClockifyYMiXApiKeyGeneada() {
        BaseService.API_KEY.set("NDRmZWUwYzEtOTZhMS00NDk5LWJkZWItY2FiNmY1MjQ3NGNh");
    }
    @Given("un Api-Key valido")
    public void unApiKeyValido() {
        BaseService.API_KEY.set("Y2UxNTAyNDYtMmIwYy00ZjM4LWI5NWYtZDFiOTYyYjI0NTkw");

    }

    @And("un Worspace-id valido")
    public void unWorspaceIdValido() {
        BaseService.W_SPACE.set("628807ae3bf26277d6055a6e");
    }

    @Then("Obtengo los los projectos de mi Worspace")
    public void obtengoLosLosProjectosDeMiWorspace() {
    }

    @Given("X-Api-Key invalido")
    public void xApiKeyInvalido() {
        BaseService.API_KEY.set("Y2UxNTAyNDYtMmIwYy00ZjM4LWI5NWYtZDFiOTYyYjI0NTk");
    }
}
