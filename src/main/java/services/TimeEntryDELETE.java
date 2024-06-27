package services;

import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;

public class TimeEntryDELETE extends MethodsService {
    public Response delete(String jsonName){return delete(jsonName,null);}
}
