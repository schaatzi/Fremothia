package com.example.preqachecklsit;

public class TaskTable {

    String itemId, itemName, status;

    public TaskTable() {
    }

    public TaskTable(String itemId, String itemName, String status) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.status = status;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
