package swiggy;

import model.User;

public class SwiggyService {
    public boolean loginstatus(String username,String password){
        User user = new User();
        user.userName = "Sri";
        user.passWord = "Sri123";
        if(username.equals(user.userName) && password.equals(user.passWord)){
            System.out.println("login successful");
        }
        else
        {
            System.out.println("login unsuccessful");
        }
        return false;
        

    }

}
