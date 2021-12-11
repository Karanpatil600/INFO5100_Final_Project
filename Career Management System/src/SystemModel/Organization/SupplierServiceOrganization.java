/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModel.Organization;
import SystemModel.Role.Role;
import SystemModel.Role.SupplierAdminRole;
import SystemModel.Role.SupplierManagerRole;
import SystemModel.Supplier.SupplierDirectory;
import java.util.HashSet;

/**
 *
 * @author Karan
 */

public class SupplierServiceOrganization extends Organization {
    SupplierDirectory supplierList;

    public SupplierServiceOrganization(String name) {
        super(Organization.Type.Supplier.getValue());
        supplierList = new SupplierDirectory();
    }

    public SupplierDirectory getSupplierList() {
        return supplierList;
    }

    public void setSupplierList(SupplierDirectory supplierList) {
        this.supplierList = supplierList;
    }
    
     @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new SupplierManagerRole());
       return role;
    }
     
}





