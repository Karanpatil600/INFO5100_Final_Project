/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModel.Location;
import SystemModel.EnterpriseManagement.EnterpriseDirectory;

/**
 *
 * @author Karan
 */


public class Location 
{
    
    private String locationName;
    private EnterpriseDirectory enterpriseDirectory;
    
    public Location()
    {
     enterpriseDirectory = new EnterpriseDirectory();
    }

    public EnterpriseDirectory getEnterpriseDirectory() 
    {
        return enterpriseDirectory;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    @Override
    public String toString()
    {
        return locationName;
    }
}


