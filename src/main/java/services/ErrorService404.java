package services;


import api.model.Project.ErrorResponse404;
import com.crowdar.api.rest.Response;


public class ErrorService404 extends BaseService{
    public static Response get(String jsonName){

        return get(jsonName, ErrorResponse404.class,setParams());
    }
}
