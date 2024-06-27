package services;

import api.model.GetTimeEntry;
import com.crowdar.api.rest.Response;


public class TimeEntryGET {

    public static Response get(String jsonName) {
        return get(jsonName, GetTimeEntry.class);
    }
}
