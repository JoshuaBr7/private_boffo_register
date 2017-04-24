package events;

/**
 *
 * @author Joshua Milligan & Joshua Brown
 */
public class EventCodes {
    // High level event codes.
    public static final int LOGIN_REQUEST = 0;
    public static final int LOGOUT_REQUEST = 1;
    public static final int PRINT_RECEIPT = 2;
    // Panel Change Event Codes.
    public static final int LOGIN_PANEL = 3;
    public static final int MAIN_PANEL = 4;
    public static final int TRANSACTION_PANEL = 5;
    public static final int INVENTORY_PANEL = 6;
    public static final int USER_PANEL = 7;
    public static final int ADMIN_PANEL = 8;
    // All other events
    public static final int ADD_TRANSACTION = 9;
}
