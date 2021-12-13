/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModel.Employee;

/**
 *
 * @author Karan
 */

public class Employee 
{
 
    private String empolyeeName;
    private int id;
    private static int count=1;
    
    public Employee()
    {
        id = count;
        count++;
    }

    public String getEmpolyeeName() 
    {
        return empolyeeName;
    }

    public void setEmpolyeeName(String empolyeeName)
    {
        this.empolyeeName = empolyeeName;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return empolyeeName;
    }
    
}




