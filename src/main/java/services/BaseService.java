package services;

import com.crowdar.api.rest.MethodsService;
import com.crowdar.core.PropertyManager;

import java.util.HashMap;
import java.util.Map;

public class BaseService extends MethodsService {

    public static final ThreadLocal<String> API_KEY = new ThreadLocal<String>();
    public static final ThreadLocal<String> W_SPACE = new ThreadLocal<String>();
    public static final ThreadLocal<String> PROJECT_ID = new ThreadLocal<String>();
    public static final ThreadLocal<String> NAME_PROJECT = new ThreadLocal<String>();
    public static final ThreadLocal<String> COLOR_PROYECT = new ThreadLocal<String>();

    protected static Map<String, String> setParams() {
        Map<String, String> params = new HashMap<String, String>();
        params.put("base.url", PropertyManager.getProperty("base.api.url"));
        params.put("api-key",API_KEY.get());
        params.put("workspace",W_SPACE.get());
        return params;
    }
    protected static Map<String, String> setParamsProject_Id() {
        Map<String, String> params = new HashMap<String, String>();
        params.put("base.url", PropertyManager.getProperty("base.api.url"));
        params.put("api-key",API_KEY.get());
        params.put("workspace",W_SPACE.get());
        params.put("project_id",PROJECT_ID.get());
        return params;
    }
    protected static Map<String, String> setParamsUpdateProject() {
        Map<String, String> params = new HashMap<String, String>();
        params.put("base.url", PropertyManager.getProperty("base.api.url"));
        params.put("api-key",API_KEY.get());
        params.put("workspace",W_SPACE.get());
        params.put("project_id",PROJECT_ID.get());
        params.put("nameProject",NAME_PROJECT.get());
        params.put("colorProject",COLOR_PROYECT.get());
        return params;
    }
    protected static Map<String, String> setParamsAddNewProject() {
        Map<String, String> params = new HashMap<String, String>();
        params.put("base.url", PropertyManager.getProperty("base.api.url"));
        params.put("api-key",API_KEY.get());
        params.put("workspace",W_SPACE.get());
        params.put("newProyect",NAME_PROJECT.get());
        return params;
    }
}
