package events;

//Maclean Frazier

import java.util.EventObject;

public class BoffoEvent extends EventObject {

    private int eventCode = 0;
    
    private BoffoMessenger message;

    public BoffoEvent(Object source, int _eventCode, BoffoMessenger _message) {
        super(source);
        this.eventCode = _eventCode;
        this.message = _message;
    }
    
    public int getEventCode() {
        return this.eventCode;
    }

    public BoffoMessenger getMessage() {
        return this.message;
    }

}
