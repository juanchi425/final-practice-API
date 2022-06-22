package services;

import api.model.Project.ProjectResponse;
import api.model.TimeEntries.TimeEntryResponse;
import com.crowdar.api.rest.Response;

public class AddTimeEntriesService extends BaseService {


    public static Response post(String jsonName) {

        return post(jsonName, TimeEntryResponse.class,setParamsAddTimeEntries());
    }



}
