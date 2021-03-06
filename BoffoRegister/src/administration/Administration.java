package administration;

/*@author jonathanholley jessicadenney
 Updated: 04/18/17
 System settings for BoffoRegister. Allows user to set values for store name,
 store hours, tax rate, phone number, and a meassage for the receipt. Also allows
 other classes to find required information.
 */

import events.BoffoFireObject;
import events.BoffoEvent;
import events.BoffoListenerInterface;

public class Administration extends BoffoFireObject implements BoffoListenerInterface {
//Create variables required for Administration class.

    protected String userName = "74Dn6Xzf";
    protected String passWord = "57FB5x8BG7Njs3NH";
    protected String keys = "Simon";
    protected double store_hours = 0.0;
    protected double tax_rate = 0.0;
    protected int store_id = 0;
    protected int phone_num = 0;
    protected String receipt_msg = "";
    protected String store_name = "";

    public Administration() {

    }

//Sets variable values to themselves.
    public Administration(String store_name, String receipt_msg, double store_hours,
            int phone_num, float tax_rate, String passWord, String userName,
            String keys) {

        this.userName = userName;
        this.passWord = passWord;
        this.keys = keys;
        this.store_name = store_name;
        this.receipt_msg = receipt_msg;
        this.store_hours = store_hours;
        this.phone_num = phone_num;
        this.tax_rate = tax_rate;
    }

//Placeholder to pull admin file from database or to pull form a table.
    public Administration getAdministration() {
        return null;
    }

    //Return key value.
    public String getKeys() {
        return this.keys;
    }

    //Return pass word.
    public String getPassWord() {
        return this.passWord;
    }

    //Return phone number.
    public int getPhoneNumber() {
        return this.phone_num;
    }

    //Return receipt message.
    public String getReceiptMessage() {
        return this.receipt_msg;
    }

    //Return store hours.
    public double getStoreHours() {
        return this.store_hours;
    }

    //Return store name.
    public String getStoreName() {
        return this.store_name;
    }

    //Return tax rate.
    public double getTaxRate() {
        return this.tax_rate;
    }

    //Return user name.
    public String getUserName() {
        return this.userName;
    }

    //Command to set key value.
    public void setKeys(String _k) {
        this.keys = _k;
    }

    public void setPassWord(String _p) {
        this.passWord = _p;
    }

    //Command to set phone number.
    public void setPhoneNumber(int _pN) {
        this.phone_num = _pN;
    }

    //Command to set receipt message.
    public void setReceiptMessage(String _rM) {
        this.receipt_msg = _rM;
    }

    //Command to set store hours.
    public void setStoreHours(double _sH) {
        this.store_hours = _sH;
    }

    //Command to set store name.
    public void setStoreName(String _sN) {
        this.store_name = _sN;
    }

    //Command to set tax rate.
    public void setTaxRate(double _tR) {
        this.tax_rate = _tR;
    }

    //Command to set user name.
    public void setUserName(String _uN) {
        this.userName = _uN;
    }

    @Override
    public void addBRegisterListener(BoffoListenerInterface _event) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeBRegisterListener(BoffoListenerInterface _event) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void fireEvent(BoffoEvent _event) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void messageReceived(BoffoEvent event) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}


