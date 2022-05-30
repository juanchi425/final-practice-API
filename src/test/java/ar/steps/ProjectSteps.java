package ar.steps;

import ar.validator.WorkspaceValidator;
import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import services.BaseService;
import services.ProjectService;

import static ar.validator.ProjectValidator.*;

public class ProjectSteps extends PageSteps {

    @Given("Mi cuenta creada en clockify y mi X-Api-Key geneada")
    public void miCuentaCreadaEnClockifyYMiXApiKeyGeneada() {
        BaseService.API_KEY.set("NDRmZWUwYzEtOTZhMS00NDk5LWJkZWItY2FiNmY1MjQ3NGNh");
    }
    @Given("un Api-Key valido '(.*)'")
    public void unApiKeyValido(String key) {
        BaseService.API_KEY.set(key);

    }

    @And("un Worspace-id valido '(.*)'")
    public void unWorspaceIdValido(String worspaceId) {
        BaseService.W_SPACE.set(worspaceId);
    }

    @Then("Obtengo los los projectos de mi Worspace")
    public void obtengoLosLosProjectosDeMiWorspace() {
    }

    @Given("X-Api-Key invalido '(.*)'")
    public void xApiKeyInvalido(String KeyInvalido) {
        BaseService.API_KEY.set(KeyInvalido);
    }

    @Then("se obtuvo el response esperado")
    public void seObtuvoElResponseEsperado() {
        ValidatorError404();
    }

    @And("projectId valido '(.*)'")
    public void project_idValido(String projectId) {
      BaseService.PROJECT_ID.set(projectId);
    }


    @And("un nombre del proyecto '(.*)'")
    public void unNombreDelProyecto(String nombre) {
        BaseService.NAME_PROJECT.set(nombre);
    }

    @And("un color '(.*)'")
    public void unColor(String color) {
        BaseService.COLOR_PROYECT.set(color);
    }

    @Then("se valida que el proyecto fue modificado '(.*)' '(.*)'")
    public void seValidaQueElProyectoFueModificado(String nombre, String color) {
        ValidatorUpdateProject(nombre, color);
    }

    @Then("se valida que el proyecto fue creado '(.*)'")
    public void seValidaQueElProyectoFueCreado(String nombre) {
        ValidatorAddNewProject(nombre);
    }

    @Then("se valida que los campos nombres no esten vacios")
    public void seValidaQueLosCamposNombresNoEstenVacios() {
        validatorNameProjectNotNull();
    }

    @Then("se valida que su Id y nombre no esten vacios")
    public void seValidaQueSuIdYNombreNoEstenVacios() {
        validatorNameyIdProject();
    }
}
