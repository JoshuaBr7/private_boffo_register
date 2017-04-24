package events;

/**
 *
 * @author Joshua Milligan & Joshua Brown
 */
public class EventCodes {
    // High level event codes.
    public static final int LOGIN_REQUEST = 0;
    public static final int LOGIN_ACCEPTED = 1;
    public static final int LOGOUT_REQUEST = 2;
    public static final int PRINT_RECEIPT = 4;
    // Panel Change Event Codes.
    public static final int EXIT_PANEL = 5;
    public static final int LOGIN_PANEL = 6;
    public static final int MAIN_PANEL = 7;
    public static final int TRANSACTION_PANEL = 8;
    public static final int INVENTORY_PANEL = 9;
    public static final int USER_PANEL = 10;
    public static final int ADMIN_PANEL = 11;
    // All other events
    public static final int ADD_TRANSACTION = 4;
}
