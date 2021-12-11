/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModel.ServiceSeeker;
import java.util.ArrayList;
 
/**
 *
 * @author sudar
 */
public class ServiceSeekerDirectory {
    
    private ArrayList<ServiceSeeker> serviceSeekerDirectory;

    public ServiceSeekerDirectory()
    {
        serviceSeekerDirectory = new ArrayList<>();
        
    }

    public ArrayList<ServiceSeeker> getServiceSeekerDirectory() 
    {
        return serviceSeekerDirectory;
    }

    public void setChangeSeekerDirectory(ArrayList<ServiceSeeker> serviceSeekerDirectory) 
    {
        this.serviceSeekerDirectory = serviceSeekerDirectory;
    }
    
    public ServiceSeeker addServiceSeeker()
    {
        ServiceSeeker ss = new ServiceSeeker();
        serviceSeekerDirectory.add(ss);
        return ss;
    }
    
    public void removeHelpSeeker(ServiceSeeker ss)
    {
        serviceSeekerDirectory.remove(ss);
    }
    
}
