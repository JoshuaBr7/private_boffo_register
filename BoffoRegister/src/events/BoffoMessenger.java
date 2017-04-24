package events;

//Maclean Frazier

import java.util.HashMap;

public class BoffoMessenger {

    public static final int USER_NAME = 0;
    public static final int USER_PASS = 1;
    public static final int ACCEPTED = 2;

    private final HashMap<Integer,String> messageTable = new HashMap<Integer, String>();

    public BoffoMessenger(String _messageText) {
        // Some code here to parse an incoming string.
    }

    public BoffoMessenger(HashMap _mapIn) {
        // Some code here to set the map.
    }

    public String getValue(int _key) {
        return this.messageTable.get(_key);
    }

    public void setValue(int _key, String _value) {
        this.messageTable.put(_key, _value);
    }

    public HashMap getMap() {
        return this.messageTable;
    }
}