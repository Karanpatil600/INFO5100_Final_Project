/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModel.Creator;
import SystemModel.WorkQueue.WorkQueue;

/**
 *
 * @author sudar
 */
public class Creator {
    private String creatorName;
    private String id;
    private static int count=0;
    private WorkQueue workqueue;
    public Creator() 
    {
        id="Vol"+(++count);
        workqueue= new WorkQueue();
    }

    public WorkQueue getWorkqueue() {
       return workqueue;
    }

    public void setWorkqueue(WorkQueue workqueue) {
        this.workqueue = workqueue;
    }

    
    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    @Override
    public String toString(){
    return creatorName;
    
    }
}
