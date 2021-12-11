/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModel.Role;
import SystemModel.EcoSystem;
import SystemModel.Enterprise.Enterprise;
import SystemModel.Organization.ServiceSeekerOrganization;
import SystemModel.Organization.Organization;
import SystemModel.UserAccount.UserAccount;
import SystemUI.ServiceSeeker.ServiceSeekerAdminWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author sudar
 */
public class ServiceSeekerAdminRole extends Role {
    
    @Override
    public JPanel createWorkArea(JPanel workArea, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new ServiceSeekerAdminWorkArea(workArea, enterprise);
    }

    @Override
    public String toString() {
        return Role.RoleType.ServiceSeekerAdmin.getValue();
    }
}
