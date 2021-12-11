/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModel.Organization;
import SystemModel.ServiceSeeker.ServiceSeekerDirectory;
import SystemModel.Role.ServiceSeekerRole;
import SystemModel.Role.Role;
import java.util.HashSet;
/**
 *
 * @author sudar
 */
public class ServiceSeekerOrganization extends Organization{
    
    ServiceSeekerDirectory serviceSeekerlist;
    public ServiceSeekerOrganization()
    {
        super(Organization.Type.ServiceSeeker.getValue());
        serviceSeekerlist=new ServiceSeekerDirectory();
    }

    public ServiceSeekerDirectory getServiceSeekerlist() {
        return serviceSeekerlist;
    }

    public void setServiceSeekerlist(ServiceSeekerDirectory serviceSeekerlist) {
        this.serviceSeekerlist = serviceSeekerlist;
    }
    
    @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new ServiceSeekerRole());
        return role;
        
    }
}
