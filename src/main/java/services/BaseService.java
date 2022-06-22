package services;

import com.crowdar.api.rest.MethodsService;
import com.crowdar.core.PropertyManager;

import java.util.HashMap;
import java.util.Map;

public class BaseService extends MethodsService {

    public static final ThreadLocal<String> API_KEY = new ThreadLocal<String>();
    public static final ThreadLocal<String> W_SPACE = new ThreadLocal<String>();
    public static final ThreadLocal<String> USER_ID = new ThreadLocal<String>();
    public static final ThreadLocal<String> PROJECT_ID = new ThreadLocal<String>();
    public static final ThreadLocal<String> NAME_PROJECT = new ThreadLocal<String>();
    public static final ThreadLocal<String> COLOR_PROYECT = new ThreadLocal<String>();
    public static final ThreadLocal<String> TASK_ID = new ThreadLocal<String>();
    public static final ThreadLocal<String> TAG_ID = new ThreadLocal<String>();
    public static final ThreadLocal<String> H_INICIO = new ThreadLocal<String>();
    public static final ThreadLocal<String> H_FINAL = new ThreadLocal<String>();
    public static final ThreadLocal<String> TIME_ENTRIES_ID = new ThreadLocal<String>();
    public static final ThreadLocal<String> DESCRIPCION = new ThreadLocal<String>();

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
    protected static Map<String, String> setParamsGetTimeEntries(){
        Map<String, String> params = new HashMap<String, String>();
        params.put("base.url", PropertyManager.getProperty("base.api.url"));
        params.put("api-key",API_KEY.get());
        params.put("workspace",W_SPACE.get());
        params.put("userId",USER_ID.get());
        return params;
    }
    protected static Map<String, String> setParamsAddTimeEntries(){
        Map<String, String> params = new HashMap<String, String>();
        params.put("base.url", PropertyManager.getProperty("base.api.url"));
        params.put("api-key",API_KEY.get());
        params.put("workspace",W_SPACE.get());
        params.put("project_id",PROJECT_ID.get());
        params.put("taskId",TASK_ID.get());
        params.put("tagId",TAG_ID.get());
        params.put("H_inicio",H_INICIO.get());
        params.put("H_final",H_FINAL.get());
        return params;
    }

    protected static Map<String, String> setParamsUpdateTimeEntries() {
        Map<String, String> params = new HashMap<String, String>();
        params.put("base.url", PropertyManager.getProperty("base.api.url"));
        params.put("api-key",API_KEY.get());
        params.put("workspace",W_SPACE.get());
        params.put("timeEntriesId",TIME_ENTRIES_ID.get());
        params.put("descripcion",DESCRIPCION.get());
        params.put("project_id",PROJECT_ID.get());
        params.put("taskId",TASK_ID.get());
        params.put("tagId",TAG_ID.get());
        return params;
    }
}
