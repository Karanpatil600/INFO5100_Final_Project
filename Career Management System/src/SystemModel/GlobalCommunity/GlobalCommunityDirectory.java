/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModel.GlobalCommunity;

import java.util.ArrayList;

/**
 *
 * @author Karan
 */

public class GlobalCommunityDirectory 
{
    private ArrayList<GlobalCommunity> gcDirectory;

    public GlobalCommunityDirectory() 
    {
    gcDirectory= new ArrayList<>();
    }

    public ArrayList<GlobalCommunity> getGcDirectory()
    {
        return gcDirectory;
    }

    public void setGcDirectory(ArrayList<GlobalCommunity> gcDirectory) 
    {
        this.gcDirectory = gcDirectory;
    }
    
    public GlobalCommunity addGC()
    {
        GlobalCommunity gc =new GlobalCommunity();
        gcDirectory.add(gc);
        return gc;
    }
    
    public void removeGC(GlobalCommunity gc)
    {
        gcDirectory.remove(gc);   
    }
}




 