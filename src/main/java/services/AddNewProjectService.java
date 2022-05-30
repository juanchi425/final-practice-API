package services;

import api.model.Project.ProjectResponse;
import com.crowdar.api.rest.Response;

public class updateProjectService extends BaseService {


    public static Response put(String jsonName) {

        return put(jsonName,ProjectResponse.class,setParamsUpdateProject());
    }



}
