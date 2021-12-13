/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModel.WorkFlow;

import java.util.ArrayList;

/**
 *
 * @author Karan 
 */
public class WorkRequestList {
    
    private ArrayList<WorkRequest> workReqestList;
    
    public WorkRequestList(){
        workReqestList = new ArrayList<>();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workReqestList;
    }
    
    
    
}
