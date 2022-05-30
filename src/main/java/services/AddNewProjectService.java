package services;

import api.model.Project.ProjectResponse;
import com.crowdar.api.rest.Response;

public class AddNewProjectService extends BaseService {


    public static Response post(String jsonName) {

        return post(jsonName,ProjectResponse.class,setParamsAddNewProject());
    }



}
