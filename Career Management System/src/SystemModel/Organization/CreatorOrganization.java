/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModel.Organization;
import SystemModel.Role.Role;
import SystemModel.Role.CreatorRole;
import SystemModel.Creator.CreatorDirectory;
import java.util.HashSet;
/**
 *
 * @author sudar
 */

public class CreatorOrganization extends Organization{
    CreatorDirectory creatorList;

    public CreatorOrganization(String name) {
        super(Organization.Type.Creator.getValue());
        creatorList= new CreatorDirectory();
    }

    public CreatorDirectory getCreatorList() {
        return creatorList;
    }

    public void setCreatorList(CreatorDirectory creatorList) {
        this.creatorList = creatorList;
    }
    
    @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new CreatorRole());
       return role;
    }
}
