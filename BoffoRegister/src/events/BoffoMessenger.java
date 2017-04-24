package events;

//Maclean Frazier

import java.util.HashMap;

public class BoffoMessenger {
    
    private HashMap<String,String> messageTable = new HashMap<String, String>();
    
    public BoffoMessenger(String _messageText) {
        // Some code here to parse an incoming string.
    }
    
    public BoffoMessenger(HashMap _mapIn) {
        // Some code here to set the map.
    }
    
    public String getValue(String _key) {
        return this.messageTable.get(_key);
    }
    
    public void setValue(String _key, String _value) {
        this.messageTable.put(_key, _value);
    }

    public HashMap getMap() {
        return this.messageTable;
    }
}