/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModel.ServiceSeeker;
import SystemModel.WorkFlow.WorkRequestList;

/**
 *
 * @author sudar
 */
public class ServiceSeeker {
    private String id; 
    private String name;
    private WorkRequestList workRequestList;
    
    private static int count;
    
    public ServiceSeeker()
     {
         
        id= "SS"+(++count);
    }

    public WorkRequestList getWorkRequestList() 
    {
       return workRequestList;
    }

    public void setWorkRequestList(WorkRequestList workRequestList) 
    {
        this.workRequestList = workRequestList;
    }
 
     
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
     
     @Override
     public String toString(){
         return name;
     }
    
}
