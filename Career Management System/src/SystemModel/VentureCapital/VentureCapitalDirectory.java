/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModel.VentureCapital;

import SystemModel.VentureCapital.VentureCapital;
import java.util.ArrayList;

/**
 *
 * @author Ashish
 */
public class VentureCapitalDirectory {
    private ArrayList<VentureCapital> docdirectory;

    public VentureCapitalDirectory() 
    {
    docdirectory= new ArrayList<>();
    }

    public ArrayList<VentureCapital> getDocdirectory()
    {
        return docdirectory;
    }

    public void setDocdirectory(ArrayList<VentureCapital> docdirectory) 
    {
        this.docdirectory = docdirectory;
    }
    
    public VentureCapital addDoc()
    {
        VentureCapital d =new VentureCapital();
        docdirectory.add(d);
        return d;
    }
    
    public void removeDoc(VentureCapital d)
    {
        docdirectory.remove(d);   
    }
}


