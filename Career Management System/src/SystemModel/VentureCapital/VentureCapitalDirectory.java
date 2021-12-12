/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModel.VentureCapital;

import java.util.ArrayList;

/**
 *
 * @author Ashish
 */

public class VentureCapitalDirectory {
    private ArrayList<VentureCapital> venturedirectory;

    public VentureCapitalDirectory() 
    {
    venturedirectory= new ArrayList<>();
    }

    public ArrayList<VentureCapital> getVenturedirectory()
    {
        return venturedirectory;
    }

    public void setVenturedirectory(ArrayList<VentureCapital> venturedirectory) 
    {
        this.venturedirectory = venturedirectory;
    }
    
    public VentureCapital addDoc()
    {
        VentureCapital ven =new VentureCapital();
        venturedirectory.add(ven);
        return ven;
    }
    
    public void removeDoc(VentureCapital ven)
    {
        venturedirectory.remove(ven);   
    }
}


