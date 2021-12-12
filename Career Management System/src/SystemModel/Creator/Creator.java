/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModel.Creator;
import SystemModel.WorkFlow.WorkRequestList;

/**
 *
 * @author sudar
 */
public class Creator {
    private String creatorName;
    private String id;
    private static int count = 0;
    private WorkRequestList workRequestList;
    
    public Creator() 
    {
        id="Vol"+(++count);
        workRequestList= new WorkRequestList();
    }

    public WorkRequestList getWorkRequestList() {
       return workRequestList;
    }

    public void setWorkRequestList(WorkRequestList workRequestList) {
        this.workRequestList = workRequestList;
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
