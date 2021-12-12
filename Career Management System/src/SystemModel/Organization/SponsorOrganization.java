/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModel.Organization;
import SystemModel.Role.Role;
import SystemModel.Role.SponsorRole;
import SystemModel.Sponsor.SponsorDirectory;
import java.util.HashSet;

/**
 *
 * @author Karan
 */

    

public class SponsorOrganization extends Organization {
    SponsorDirectory sponsorList;

    public SponsorOrganization(String name) {
        super(Organization.Type.Sponsor.getValue());
        sponsorList = new SponsorDirectory();
    }

    public SponsorDirectory getSponsorList() {
        return sponsorList;
    }

    public void setSponsorList(SponsorDirectory sponsorList) {
        this.sponsorList = sponsorList;
    }
    
    @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new SponsorRole());
       return role;
    }
    
}






