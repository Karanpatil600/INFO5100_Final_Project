/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModel.Organization;
import SystemModel.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author Karan
 */


public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;
    
    public OrganizationDirectory()
    {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    
    
    public Organization createOrganization(Organization.Type type,String name)
    {
    Organization organization = null;
        if (type.getValue().equals(Organization.Type.ServiceProvider.getValue())){
            
            organization = new ServiceProviderOrganization();
            organization.setOrganizationName(name);
            organizationList.add(organization); 
        }
        else if (type.getValue().equals(Organization.Type.ServiceSeeker.getValue())){
            organization = new ServiceSeekerOrganization();
            organization.setOrganizationName(name);
            organizationList.add(organization);
        }
       
        else if (type.getValue().equals(Organization.Type.GCO.getValue())){
            organization = new GlobalCommunityOrganization();
            organization.setOrganizationName(name);
            organizationList.add(organization);
        }
         /*
        else if (type.getValue().equals(Organization.Type.Supplier.getValue())){
            organization = new SupplierOrganization(name);
            organization.setOrganizationName(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Donor.getValue())){
            organization = new DonorOrganization(name);
            organization.setOrganizationName(name);
            organizationList.add(organization);
        }*/
        else if (type.getValue().equals(Organization.Type.Creator.getValue())){
            organization = new CreatorOrganization(name);
            organization.setOrganizationName(name);
            organizationList.add(organization);
        }
        /*
        else if (type.getValue().equals(Organization.Type.Doctor.getValue())){
            organization = new DoctorOrganization(name);
            organization.setOrganizationName(name);
            organizationList.add(organization);
        }
        */
        
        return organization;
    }


    
}








