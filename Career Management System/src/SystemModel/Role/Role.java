/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModel.Role;
import SystemModel.EcoSystem;

import SystemModel.UserAccount.UserAccount;
import SystemModel.Enterprise.Enterprise;
import SystemModel.Organization.Organization;
import javax.swing.JPanel;

/**
 *
 * @author Karan
 */

public abstract class Role {
    
    public enum RoleType{
        SystemAdministrator("SystemAdministrator"),
        ServiceProviderAdmin("ServiceProviderAdmin"),
        ServiceProvider("ServiceProvider"),
        ServiceSeekerAdmin("ServiceSeekerAdmin"),
        ServiceSeeker("ServiceSeeker"),
        EnterpriseAdmin("EnterpriseAdmin"),
        HospitalAdmin("HospitalAdmin"),
        GlobalCommunityAdminRole("GlobalCommunityAdminRole"),
        GlobalCommunityManagerRole("GlobalCommunityManagerRole"),
        CareerServiceAdminRole("CareerServiceAdminRole"), 
        
        VentureCapitalAdminRole("VentureCapitalAdminRole"),
        VentureCapitalRole("VentureCapitalRole"),
        
        SupplierServiceAdminRole("SupplierServiceAdminRole"),
        
        SupplierManagerRole("SupplierManagerRole"),
        CreatorAdminRole("CreatorAdminRole"),
        CreatorRole("CreatorRole"),
        DonorRole("DonorRole"),
        DonorAdminRole("DonorAdminRole"),
        DoctorAdminRole("DoctorAdminRole"),
        DoctorUserRole("DoctorUserRole"),
        HospitalAdminRole("HospitalAdminRole");
        
        
        
        private String value;
        private RoleType(String value){
            this.value=value;
        }

        public String getValue() {
            return value;
        }
        
        @Override
        public String toString(){
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,EcoSystem system);
    
    
}











