package services;

import api.model.TimeEntries.TimeEntryResponse;
import com.crowdar.api.rest.Response;

public class DeleteTimeEntriesService extends BaseService {


    public static Response delete(String jsonName) {

        return delete(jsonName, TimeEntryResponse.class,setParamsDeleteTimeEntries());
    }



}
