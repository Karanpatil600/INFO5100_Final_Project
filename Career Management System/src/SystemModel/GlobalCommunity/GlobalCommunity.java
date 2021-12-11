
package SystemModel.GlobalCommunity;
/**
 *
 * @author Karan
 */

public class GlobalCommunity {
 
    private String gcName;
    private String gcid;
    private static int count;

    public GlobalCommunity() {
        
        gcid="ORG"+(++count);
        
    }

    public String getGcName() {
        return gcName;
    }

    public void setGcName(String gcName) {
        this.gcName = gcName;
    }

  
    public String getGcid() {
        return gcid;
    }

    public void setGcid(String gcid) {
        this.gcid = gcid;
    }
    
    @Override
    public String toString(){
        
        return gcName;
    }
    
    
}


