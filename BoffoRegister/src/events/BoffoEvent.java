package events;

//Maclean Frazier

import java.util.EventObject;
import java.util.HashMap;

public class BoffoEvent extends EventObject {

    private int eventCode = 0;

    private HashMap<Integer,String> messageTable = new HashMap<Integer, String>();

    public BoffoEvent(Object source, int _eventCode, HashMap<Integer,String> _message) {
        super(source);
        this.eventCode = _eventCode;
        this.messageTable = _message;
    }

    public int getEventCode() {
        return this.eventCode;
    }

    public String getMessageValue(int _key) {
        return this.messageTable.get(_key);
    }

    public void setMessageValue(int _key, String _value) {
        this.messageTable.put(_key, _value);
    }

    public HashMap getMap() {
        return this.messageTable;
    }
}
