package api.config;

import services.*;

public enum EntityConfiguration {
    GET_TIME_ENTRY {
        @Override
        public Class<?> getEntityService() {
            return TimeEntryGET.class;
        }
    },
    PUT_TIME_ENTRY {
        @Override
        public Class<?> getEntityService() {
            return TimeEntryPUT.class;
        }
    },
    POST_TIME_ENTRY {
        @Override
        public Class<?> getEntityService() {
            return TimeEntryPOST.class;
        }
    },
    DELETE_TIME_ENTRY {
        @Override
        public Class<?> getEntityService() {
            return TimeEntryDELETE.class;
        }
    };

    public abstract Class<?> getEntityService();
}



