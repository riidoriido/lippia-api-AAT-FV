package api.model;

import java.util.ArrayList;

public class GetTimeEntry {
    public String id;
    public String description;
    public ArrayList<String> tagIds;
    public String userId;
    public boolean billable;
    public Object taskId;
    public String projectId;
    public String workspaceId;
    public TimeInterval timeInterval;
    public ArrayList<Object> customFieldValues;
    public String type;
    public Object kioskId;
    public HourlyRate hourlyRate;
    public CostRate costRate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<String> getTagIds() {
        return tagIds;
    }

    public void setTagIds(ArrayList<String> tagIds) {
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

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public TimeInterval getTimeInterval() {
        return timeInterval;
    }

    public void setTimeInterval(TimeInterval timeInterval) {
        this.timeInterval = timeInterval;
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

    public HourlyRate getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(HourlyRate hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public CostRate getCostRate() {
        return costRate;
    }

    public void setCostRate(CostRate costRate) {
        this.costRate = costRate;
    }
}
