package services;

import api.model.Project.ProjectResponse;
import api.model.TimeEntries.TimeEntryResponse;
import com.crowdar.api.rest.Response;

public class UpdateTimeEntriesService extends BaseService {


    public static Response put(String jsonName) {

        return put(jsonName, TimeEntryResponse.class,setParamsUpdateTimeEntries());
    }



}
