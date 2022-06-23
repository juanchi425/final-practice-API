package ar.validator;


import api.model.Project.ErrorResponse404;
import api.model.Project.ProjectResponse;
import api.model.TimeEntries.CustomFieldValues;
import api.model.TimeEntries.TimeEntryResponse;
import api.model.workspaces.WorkspacesResponse;
import com.crowdar.api.rest.APIManager;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class TimeEntriesValidator {

    public static void validarCamposVacios(){
        TimeEntryResponse[] response = (TimeEntryResponse[]) APIManager.getLastResponse().getResponse();
        for(TimeEntryResponse times : response){
            Assert.assertNotNull(times.getId(),"El campo Id esta vacio");
            Assert.assertNotNull(times.getDescription(),"El campo Descripcion esta vacio");
            Assert.assertNotNull(times.getTagIds(),"El campo TagsId esta vacio");
            Assert.assertNotNull(times.getUserId(),"El campo UserId esta vacio");
            Assert.assertNotNull(times.getProjectId(),"El campo ProjectId esta vacio");
            Assert.assertNotNull(times.getTimeInterval(),"El campo TimeInvernal esta vacio");
            Assert.assertNotNull(times.getWorkspaceId(),"El campo WorspaceId esta vacio");

        }
    }
    public static void validarIds(String projectid, String taskId){
        TimeEntryResponse response = (TimeEntryResponse) APIManager.getLastResponse().getResponse();
        Assert.assertEquals(response.getProjectId(),projectid);
        Assert.assertEquals(response.getTaskId(),taskId);
    }

    public static void validarHoras(String H_inicio,String H_final){
        TimeEntryResponse response = (TimeEntryResponse) APIManager.getLastResponse().getResponse();
        Assert.assertEquals(response.getTimeInterval().getStart().substring(11,16),H_inicio.substring(11,16));
        Assert.assertEquals(response.getTimeInterval().getEnd().substring(11,16),H_final.substring(11,16));
    }
    public static void  validaCamposNoVacios(){
        TimeEntryResponse response = (TimeEntryResponse) APIManager.getLastResponse().getResponse();
        Assert.assertNotNull(response.getId(),"El campo Id esta vacio");
        Assert.assertNotNull(response.getDescription(),"El campo Descripcion esta vacio");
        Assert.assertNotNull(response.getTagIds(),"El campo TagsId esta vacio");
        Assert.assertNotNull(response.getUserId(),"El campo UserId esta vacio");
        Assert.assertNotNull(response.getProjectId(),"El campo ProjectId esta vacio");
        Assert.assertNotNull(response.getTimeInterval(),"El campo TimeInvernal esta vacio");
        Assert.assertNotNull(response.getWorkspaceId(),"El campo WorspaceId esta vacio");
    }
}

