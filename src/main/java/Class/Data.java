
package Class;

/**
 *
 * @author Juliano
 */
public class Data {
    public boolean validateUser(String user, String password) {
        if(user.equals("admin")&& password.equals("123")) {
        return true;
        } else {
            return false;
        }
    }  
    
}
