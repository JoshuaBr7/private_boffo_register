package bofforegister;

/*
 * Last Updated: 04/09/2017
 *
 * This class is the controller for the BoffoRegister.
 * The controller 'controls' the BoffoRegisters actions.
 * Very little logic should be implemented within.  The
 * other modules and classes have their logic and this
 * controller class is meant to utilize the methods
 * and pass along events from other modules in order to
 * maintain proper functioning of the BoffoRegister.
 *
 * @author Joshua Brown & Josh Milligan
 */

import administration.Administration;
import events.BoffoEvent;
import events.BoffoFireObject;
import gui.BoffoRegisterGUI;
import javafx.stage.Stage;
import events.BoffoListenerInterface;
import inventory.Inventory;
import printer.Printer;
import transaction.Transaction;
import user.User;
import events.*;

public class BoffoController extends BoffoFireObject implements BoffoListenerInterface {

    public static User CURRENT_USER = null;

    protected Transaction transaction = null;
    protected Inventory inventory = null;
    protected Administration admin = null;
    protected Printer printer = null;
    protected BoffoRegisterGUI gui = null;

    BoffoController(Stage _primaryStage) {
        this.gui = new BoffoRegisterGUI(_primaryStage);
        this.gui.addListener(this);
        // create user object
    }

    /**
     * Changes the active module, changes the GUI panel, and calls out to
     * registerPanelListener change the current listener.
     * @param _event
     */
     @Override
    public void messageReceived(BoffoEvent _event) {

        /**
        * Also using cascading if else statements to catch events
        * within a given range.
        * Using literal ints until the event system is nailed down.
        */
        if(_event.getEventCode() == EventCodes.LOGIN_REQUEST) {
           //if(User.loginUser(_event)) {
                CURRENT_USER = new User(/*
                _event.getMessageValue(MessageCodes.USER_NAME),
                _event.getMessageValue(MessageCodes.USER_PASS)*/);
                // this.addListener(CURRENT_USER);
                this.gui.loadMainPanel();
            //}
        }
        else if (_event.getEventCode() == EventCodes.LOGOUT_REQUEST) {
            // TODO Call a static logout class?
            this.fireEvent(new BoffoEvent(this, EventCodes.LOGOUT_REQUEST, null));
            this.removeAllListeners();

            // TODO Null out all modules?
            CURRENT_USER = null;
            this.gui.loadLoginPanel();
        }
        else if (_event.getEventCode() == EventCodes.PRINT_RECEIPT) {
            printReceipt();
        }
        else {
            this.changePanel(_event);
        }
        // If the messageString does not fall within range, ignore it.
    }

    private void changePanel(BoffoEvent _event) {
        //Think I want to change the parameter to changePanel(BoffoBaseModule module)
        switch(_event.getEventCode()) {

            case EventCodes.MAIN_PANEL:
                // Change to the main GUI panel.
                this.gui.loadMainPanel();
                break;

            case EventCodes.ADMIN_PANEL:
                // If there is no Administration object, create it.
                if(admin == null) {
                    admin = new Administration();
                }
                // Change to the admin GUI panel.
                this.gui.loadAdminPanel();
                this.admin.addListener(this);
                this.addListener(this.admin);
                break;

            case EventCodes.INVENTORY_PANEL:
                // If there is no Inventory object, create one.
                if(inventory == null) {
                    inventory = new Inventory();
                }
                // Change to the Inventory GUI panel.
                this.gui.loadInventoryPanel();
                this.addListener(this.inventory);
                this.inventory.addListener(this);
                break;

            case EventCodes.TRANSACTION_PANEL:
                // Change to the Transaction GUI panel.
                if(transaction == null) {
                    transaction = new Transaction();
                }
                // Change to the Transaction GUI panel.
                this.gui.loadTransactionPanel();
                this.addListener(this.transaction);
                this.transaction.addListener(this);
                break;

            default:
                // If we have reached this point then the message is not for us.
                this.fireEvent(_event);
                break;
        }
    }

    private void printReceipt() {
        // Pass in all relevent objects into the printer and let it sort them out.
    }
}