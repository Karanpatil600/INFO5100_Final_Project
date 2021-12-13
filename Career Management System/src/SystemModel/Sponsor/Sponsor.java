/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModel.Sponsor;
import SystemModel.WorkFlow.WorkRequestList;
/**
 *
 * @author Karan
 */

public class Sponsor 
{
    private String sponsorName;
    private String id;
    private static int count=0;
    private WorkRequestList workRequestList;
    
    public Sponsor() 
            
    {
        id = "Sponsor"+(++count);
        workRequestList= new WorkRequestList();
    }

    public WorkRequestList getWorkRequestList() {
        return workRequestList; 
    }

    public void setWorkRequestList(WorkRequestList workRequestList) {
        this.workRequestList = workRequestList;
    }

    
    public String getSponsorName() {
        return sponsorName;
    }

    public void setSponsorName(String sponsorName) {
        this.sponsorName = sponsorName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    @Override
    public String toString(){
    return sponsorName;
    
    }
    
}







