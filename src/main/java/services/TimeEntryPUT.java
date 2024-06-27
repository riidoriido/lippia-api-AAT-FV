package services;

import api.model.EditTimeEntry;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;

public class TimeEntryPUT extends MethodsService {
    public Response put(String jsonName){
        return put(jsonName, EditTimeEntry.class);
    }
}
