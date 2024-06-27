package services;

import api.model.AddTimeEntry;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;

public class TimeEntryPOST extends MethodsService {
    public Response post(String jsonName){
        return post(jsonName, AddTimeEntry.class);
    }

}
