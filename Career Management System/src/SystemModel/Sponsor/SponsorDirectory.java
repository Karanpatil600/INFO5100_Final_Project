/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModel.Sponsor;


import java.util.ArrayList;

/**
 *
 * @author Karan
 */

public class SponsorDirectory 
{
    private ArrayList<Sponsor> sponsorList;

    public SponsorDirectory()
    {
        sponsorList = new ArrayList<>();
        
    }

    public ArrayList<Sponsor> getSponsorList() 
    {
        return sponsorList;
    }

    public void setSponsorList(ArrayList<Sponsor> sponsorList) 
    {
        this.sponsorList = sponsorList;
    }
    
    public Sponsor addSponsor()
    {
    
        Sponsor spon = new Sponsor();
        sponsorList.add(spon);
        return spon;
    }
    
    public void removeSponsor(Sponsor spon){
        sponsorList.remove(spon);
    }
}





