/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModel.WorkFlow;

/**
 *
 * @author Karan
 */
public class GCOWorkRequest extends WorkRequest {
 
    
    private String title;
    private String description;
    private String location;
    private int creatorRequired;
    private int creatorAcquired;
    private boolean add;
    private String creatorQty;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCreatorRequired() {
        return creatorRequired;
    }

    public void setCreatorRequired(int creatorRequired) {
        this.creatorRequired = creatorRequired;
    }

    public int getCreatorAcquired() {
        return creatorAcquired;
    }

    public void setCreatorAcquired(int creatorAcquired) {
        this.creatorAcquired = creatorAcquired;
    }

    public boolean isAdd() {
        return add;
    }
    
    public void setAdd(boolean add) {
        this.add = add;
    }

    public String getCreatorQty() {
        return creatorQty;
    }

    public void setCreatorQty(String creatorQty) {
        this.creatorQty = creatorQty;
    }
    
    
}
