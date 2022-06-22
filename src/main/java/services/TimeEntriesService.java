package services;


import api.model.TimeEntries.TimeEntryResponse;
import com.crowdar.api.rest.Response;

public class TimeEntriesService extends BaseService {


    public static Response get(String jsonName) {

        return get(jsonName, TimeEntryResponse[].class,setParamsGetTimeEntries());
    }



}
