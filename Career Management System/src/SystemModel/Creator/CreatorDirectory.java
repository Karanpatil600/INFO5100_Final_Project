/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModel.Creator;
import java.util.ArrayList;

/**
 *
 * @author sudar
 */
public class CreatorDirectory {
    private ArrayList<Creator> creatorList;

    public CreatorDirectory()
    {
        creatorList= new ArrayList<>();
        
    }

    public ArrayList<Creator> getCreatorrList() 
    {
        return creatorList;
    }

    public void setCreatorrList(ArrayList<Creator> creatorList) 
    {
        this.creatorList = creatorList;
    }
    
    public Creator addCreator()
    {
    
        Creator cre = new Creator();
        creatorList.add(cre);
        return cre;
    }
    
    public void removeCreator(Creator cre){
        creatorList.remove(cre);
    }
}
