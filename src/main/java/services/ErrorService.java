package services;

import api.model.Project.ErrorResponse;
import com.crowdar.api.rest.Response;

public class ErrorService extends BaseService {

    public static Response get(String jsonName) {
        return get(jsonName, ErrorResponse.class,setParams());
    }


}
