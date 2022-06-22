package ar.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import services.BaseService;

import static ar.validator.ProjectValidator.*;
import static ar.validator.TimeEntriesValidator.*;

public class TimeEntriesSteps extends PageSteps {



    @And("un user-id valido '(.*)'")
    public void unUserIdValidoUserId(String userId) {
        BaseService.USER_ID.set(userId);
    }

    @Then("se valida que los campos no esten vacios")
    public void seValidaQueLosCamposNoEstenVacios() {
        validarCamposVacios();
    }
}
