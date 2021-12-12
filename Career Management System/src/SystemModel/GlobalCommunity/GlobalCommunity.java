
package SystemModel.GlobalCommunity;
/**
 *
 * @author Karan
 */

public class GlobalCommunity {
 
    private String gcName;
    private String gcId;
    private static int count;

    public GlobalCommunity() {
        
        gcId="ORG"+(++count);
        
    }

    public String getGcName() {
        return gcName;
    }

    public void setGcName(String gcName) {
        this.gcName = gcName;
    }

  
    public String getGcId() {
        return gcId;
    }

    public void setGcId(String gcId) {
        this.gcId = gcId;
    }
    
    @Override
    public String toString(){
        
        return gcName;
    }
    
    
}


