/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModel.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author Karan
 */


public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;
    
    public EnterpriseDirectory()
    {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    
    
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
        if(type == Enterprise.EnterpriseType.CareerService){
           enterprise = new CareerServiceEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if(type == Enterprise.EnterpriseType.SupplierService){
            enterprise= new SupplierServiceEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if(type == Enterprise.EnterpriseType.VentureCapital){
          enterprise= new VentureCapitalEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if(type == Enterprise.EnterpriseType.GlobalCommunityEnterprise){
            enterprise= new GlobalCommunityEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
         
        return enterprise;
        
    }
   
    
}






