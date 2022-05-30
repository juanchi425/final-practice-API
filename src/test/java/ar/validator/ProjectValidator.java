package ar.validator;


import api.model.Project.ErrorResponse404;
import api.model.Project.ProjectResponse;
import api.model.workspaces.WorkspacesResponse;
import com.crowdar.api.rest.APIManager;
import org.testng.Assert;

public class ProjectValidator {
        public static void validate(){
            WorkspacesResponse[] response = (WorkspacesResponse[]) APIManager.getLastResponse().getResponse();
            Assert.assertNotNull(response[0].getId(),"El campo ID es nulo");
        }
        public static  void ValidatorError404(){
            ErrorResponse404 response = (ErrorResponse404) APIManager.getLastResponse().getResponse();
            Assert.assertNotNull(response.getTimestamp());
            Assert.assertEquals(Integer.toString(response.getStatus()),"404");
            Assert.assertEquals(response.getError(),"Not Found");
            Assert.assertEquals(response.getPath(),"/v1/workspaces/628807ae3bf26277d6055a6e/project");
        }
    public static  void ValidatorUpdateProject(String nombre, String color){
        ProjectResponse response = (ProjectResponse) APIManager.getLastResponse().getResponse();
        Assert.assertEquals(response.getName(), nombre);
        Assert.assertEquals(response.getColor(),color);
    }
    public static  void ValidatorAddNewProject(String nombre){
        ProjectResponse response = (ProjectResponse) APIManager.getLastResponse().getResponse();
        Assert.assertEquals(response.getName(),nombre);

    }
    public static void validatorNameProjectNotNull(){
            ProjectResponse[] response = (ProjectResponse[]) APIManager.getLastResponse().getResponse();
            for(ProjectResponse project : response){
                Assert.assertNotNull(project.getName());
            }
        }

    public static void validatorNameyIdProject(){
        ProjectResponse response = (ProjectResponse) APIManager.getLastResponse().getResponse();
             Assert.assertNotNull(response.getId());
             Assert.assertNotNull(response.getName());
    }
}
