package api.model;

import java.util.ArrayList;

public class EditTimeEntry {
    public String id;
    public Object description;
    public Object tagIds;
    public String userId;
    public boolean billable;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object getDescription() {
        return description;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public Object getTagIds() {
        return tagIds;
    }

    public void setTagIds(Object tagIds) {
        this.tagIds = tagIds;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public boolean isBillable() {
        return billable;
    }

    public void setBillable(boolean billable) {
        this.billable = billable;
    }

    public Object getTaskId() {
        return taskId;
    }

    public void setTaskId(Object taskId) {
        this.taskId = taskId;
    }

    public Object getProjectId() {
        return projectId;
    }

    public void setProjectId(Object projectId) {
        this.projectId = projectId;
    }

    public TimeInterval getTimeInterval() {
        return timeInterval;
    }

    public void setTimeInterval(TimeInterval timeInterval) {
        this.timeInterval = timeInterval;
    }

    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    public ArrayList<Object> getCustomFieldValues() {
        return customFieldValues;
    }

    public void setCustomFieldValues(ArrayList<Object> customFieldValues) {
        this.customFieldValues = customFieldValues;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object getKioskId() {
        return kioskId;
    }

    public void setKioskId(Object kioskId) {
        this.kioskId = kioskId;
    }

    public Object taskId;
    public Object projectId;
    public TimeInterval timeInterval;
    public String workspaceId;
    public boolean isLocked;
    public ArrayList<Object> customFieldValues;
    public String type;
    public Object kioskId;
}
