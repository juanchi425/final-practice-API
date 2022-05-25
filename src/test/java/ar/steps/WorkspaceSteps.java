package ar.steps;

import ar.validator.WorkspaceValidator;
import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import services.BaseService;

public class WorkspaceSteps extends PageSteps {



    @Then("Obtengo los datos de mi Workspace")
    public void obtengoLosDatosDeMiWorkspace() {
        WorkspaceValidator.validate();
    }


}
