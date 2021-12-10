/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModel.Role;
import SystemModel.EcoSystem;
import SystemModel.Enterprise.Enterprise;
import SystemModel.Organization.ServiceProviderOrganization;
import SystemModel.Organization.Organization;
import SystemModel.UserAccount.UserAccount;
import SystemUI.ServiceProvider.ServiceProviderUser.ServiceProviderUserWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author sudar
 */
public class ServiceProviderRole extends Role {
    
    @Override
    public JPanel createWorkArea(JPanel downJPanel, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new ServiceProviderUserWorkArea(downJPanel, account, (ServiceProviderOrganization) organization, enterprise, system);
    }

    @Override
    public String toString() {
        return Role.RoleType.ServiceProvider.getValue();
    }
    
}
