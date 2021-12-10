/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModel.ServiceProvider;
import java.util.ArrayList;
/**
 *
 * @author sudar
 */
public class ServiceProviderDirectory {
     private ArrayList<ServiceProvider> serviceProviderDirectory;

    public ServiceProviderDirectory()
    {
        serviceProviderDirectory = new ArrayList<>();
    }

    public ArrayList<ServiceProvider> getServiceProviderDirectory() 
    {
        return serviceProviderDirectory;
    }

    public void setServiceProviderDirectory(ArrayList<ServiceProvider> serviceProviderDirectory)
    {
        this.serviceProviderDirectory = serviceProviderDirectory;
    }
    
    
    public ServiceProvider addServiceProvider()
    {
        ServiceProvider sp = new ServiceProvider();
        serviceProviderDirectory.add(sp);
        return sp;
    }
    
    public void removeSeviceProvider(ServiceProvider sp)
    {
        serviceProviderDirectory.remove(sp);
    }
    
}
