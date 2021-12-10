/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModel.Organization;
import SystemModel.ServiceProvider.ServiceProviderDirectory;
import SystemModel.Role.ServiceProviderRole;
import SystemModel.Role.Role;
import java.util.HashSet;
/**
 *
 * @author sudar
 */
public class ServiceProviderOrganization extends Organization{
    
    
    ServiceProviderDirectory serviceProviderlist;
    
    public ServiceProviderOrganization()
    {
        super(Organization.Type.ServiceProvider.getValue());
        serviceProviderlist = new ServiceProviderDirectory();
    }

    public ServiceProviderDirectory getServiceproviderlist() {
        return serviceProviderlist;
    }

    public void setServiceProviderlist(ServiceProviderDirectory serviceProviderlist) 
    {
        this.serviceProviderlist = serviceProviderlist;
    }
    
    
    @Override
    public HashSet<Role> getSupportedRole(){
       role.add(new ServiceProviderRole());
       return role;
       
    }
    
}
