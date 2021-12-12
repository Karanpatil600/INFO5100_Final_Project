/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModel.VentureCapital;

/**
 *
 * @author Ashish
 * 
 */
public class VentureCapital {
    
    private String VentureName;
    private String ventureId;
    private static int count;
    
    public VentureCapital() {
        
        ventureId="VEN"+(++count);
        
    }

    public String getVentureName() {
        return VentureName;
    }

    public void setVentureName(String VentureName) {
        this.VentureName = VentureName;
    }

    public String getVentureId() {
        return ventureId;
    }

    public void setVentureId(String ventureId) {
        this.ventureId = ventureId;
    }
    
    @Override
    public String toString() {

        return VentureName;
    }
}


