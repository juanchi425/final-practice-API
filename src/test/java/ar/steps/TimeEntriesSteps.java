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

    @And("un Task valido '(.*)'")
    public void unTaskValidoTaskId(String taskId) {
        BaseService.TASK_ID.set(taskId);
    }

    @And("un Tag valido '(.*)'")
    public void unTagValidoTagId(String tagId) {
        BaseService.TAG_ID.set(tagId);
    }

    @And("una Hora de inicio '(.*)'")
    public void unaHoraDeInicioH_inicio(String H_inicio) {
        BaseService.H_INICIO.set(H_inicio);
    }

    @And("una hora final  '(.*)'")
    public void unaHoraFinalH_final(String H_final ) {
        BaseService.H_FINAL.set(H_final);
    }



    @Then("se valida que los id de project '(.*)' y task '(.*)'coincidan")
    public void seValidaQueLosIdDeProjectProjectIdYTaskTaskIdCoincidan(String projectid, String taskId){
        validarIds(projectid,taskId);
    }

    @And("se valida que la hora de inicio '(.*)' y la hora final '(.*)' coincidadn")
    public void seValidaQueLaHoraDeInicioH_inicioYLaHoraFinalH_finalCoincidadn(String H_inicio, String H_final) {
        validarHoras(H_inicio,H_final);
    }

    @And("un timeEntries-id valido '(.*)'")
    public void unTimeEntriesIdValidoTimeEntriesId(String timeEntriesId) {
        BaseService.TIME_ENTRIES_ID.set(timeEntriesId);
    }

    @And("una descripcion '(.*)'")
    public void unaDescripcionDescripcion(String descripcion) {
        BaseService.DESCRIPTION.set(descripcion);
    }

    @And("Se verifica campos no vacios")
    public void seVerificaCamposNoVacios() {
        validaCamposNoVacios();
    }
}
