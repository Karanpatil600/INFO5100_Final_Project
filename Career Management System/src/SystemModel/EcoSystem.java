/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModel;

import SystemModel.EnterpriseManagement.Enterprise;
import SystemModel.Location.Location;
import SystemModel.Role.Role;
import SystemModel.Role.SystemAdministratorRole;
import SystemModel.UserAccount.UserAccount;
import SystemModel.Organization.Organization;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author Karan
 */
    public class EcoSystem extends Organization {
    
    private static EcoSystem business;
    private ArrayList<Location> locationList;
    
    
        public static EcoSystem getInstance() {
            if (business == null) {
                business = new EcoSystem();
            }
            return business;
        }
    
        private EcoSystem() {
            
            super(null);
            locationList = new ArrayList<>();

        }

        public ArrayList<Location> getLocationList() {
            return locationList;
        }

        public static void setInstance(EcoSystem system) {
            business = system;
        }

        public Location addNetwork() {
            Location network = new Location();
            locationList.add(network);
            return network;
        }

        @Override
        public HashSet<Role> getSupportedRole() {
            role.add(new SystemAdministratorRole());

            return role;
        }
    
    
    
    
    
    public static boolean checkIfUsernameIsUnique(String username)
    {
        for(Location location : business.getLocationList())
        {
            for(Enterprise enterprize : location.getEnterpriseDirectory().getEnterpriseList())
            {
                for(UserAccount ua : enterprize.getUserAccountDirectory().getUserAccountList())
                {
                    if(ua.getUserName().equals(username))
                    {
                        return false;
                    }
                }
                
                for(Organization o : enterprize.getOrganizationDirectory().getOrganizationList())
                {
                    for(UserAccount ua : o.getUserAccountDirectory().getUserAccountList())
                    {
                        if(ua.getUserName().equals(username))
                        {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
    
    
} 
