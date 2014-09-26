/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Person;
import java.util.ArrayList;

/**
 *
 * @author Mayank
 */
public class UserAccountDirectory {

    ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList<>();
    }

    public UserAccount newUserAccount() {
        UserAccount userAccount = new UserAccount();
        userAccountList.add(userAccount);
        return userAccount;
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }

    public UserAccount authenticateUser(String userName, String password) {
        for (UserAccount ua : userAccountList) {
            if (ua.getUserName().equals(userName) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }

    public boolean isUserExist(UserAccount userAccount) {
        for (UserAccount ua : userAccountList) {
            if (userAccount == ua) {
                return true;
            }
        }
        return false;
    }

    public boolean checkUserNameExists(String userName) {
        for (UserAccount ua : userAccountList) {
            if (ua.getUserName().equals(userName)) {
                return true;
            }
        }
        return false;
    }

    public void deleteUserAccount(Person person) {
        UserAccount ua = null;
        for (UserAccount u : userAccountList) {
            if (u.getEmployee().getPerson() == person) {
                ua = u;
                break;
            }
        }
        if(ua!= null){
        userAccountList.remove(ua);
        }
    }
}
