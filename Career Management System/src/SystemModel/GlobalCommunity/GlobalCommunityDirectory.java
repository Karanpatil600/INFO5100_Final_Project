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
    private ArrayList<GlobalCommunity> gcdirectory;

    public GlobalCommunityDirectory() 
    {
    gcdirectory= new ArrayList<>();
    }

    public ArrayList<GlobalCommunity> getGcdirectory()
    {
        return gcdirectory;
    }

    public void setGcdirectory(ArrayList<GlobalCommunity> gcdirectory) 
    {
        this.gcdirectory = gcdirectory;
    }
    
    public GlobalCommunity addNGO()
    {
        GlobalCommunity n =new GlobalCommunity();
        gcdirectory.add(n);
        return n;
    }
    
    public void removeNGO(GlobalCommunity n)
    {
        gcdirectory.remove(n);   
    }
}




 