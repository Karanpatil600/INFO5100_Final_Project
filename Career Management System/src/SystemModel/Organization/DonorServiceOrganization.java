/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModel.Organization;
import SystemModel.Role.Role;
import SystemModel.Role.DonorRole;
import SystemModel.Donor.Donor;
import SystemModel.Donor.DonorDirectory;
import java.util.HashSet;

/**
 *
 * @author Karan
 */

    

public class DonorServiceOrganization extends Organization {
    DonorDirectory donorList;

    public DonorServiceOrganization(String name) {
        super(Organization.Type.Donor.getValue());
        donorList = new DonorDirectory();
    }

    public DonorDirectory getDonorList() {
        return donorList;
    }

    public void setDonorList(DonorDirectory donorList) {
        this.donorList = donorList;
    }
    
    @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new DonorRole());
       return role;
    }
    
}






