package events;

// Maclean Frazier

import database.BoffoDbObject;
import java.util.ArrayList;
import java.util.List;

public class BoffoFireObject extends BoffoDbObject {
    //Lists the liseners an event firing class will have
    private final List listeners = new ArrayList();

    public BoffoFireObject() {
    }
    //Generic add and remove
    public synchronized void addListener(BoffoListenerInterface _listener) {
        if(this.listeners.contains(_listener))
        this.listeners.add(_listener);
    }

    public synchronized void removeListener(BoffoListenerInterface _listener) {
        this.listeners.remove(_listener);
    }
    
    public synchronized void removeAllListeners() {
        listeners.clear();
    }
    
    protected synchronized void fireEvent(BoffoEvent _event) {
        // Clone the active listeners.
        Object[] tempList = this.listeners.toArray();
        //Cycle through listeners and fire events
        for (Object tempList1 : tempList) {
            BoffoListenerInterface tempObj = (BoffoListenerInterface) tempList1;
            tempObj.messageReceived(_event);
        }
    }
}