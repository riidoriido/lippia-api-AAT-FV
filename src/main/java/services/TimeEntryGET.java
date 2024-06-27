package services;

import api.model.GetTimeEntry;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;

public class TimeEntryGET extends MethodsService {

    public Response get(String jsonName){
        return get(jsonName, GetTimeEntry.class);
    }

}
