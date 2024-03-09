import java.util.HashMap;

public class IDandPasswords {

    HashMap<String,String> logininfo = new HashMap<String,String>();

    IDandPasswords() {

        logininfo.put("admin", "123");
        logininfo.put("danny", "321");
        logininfo.put("bob", "213");

    }

    protected HashMap getLoginInfo() {
        return logininfo;
    }
}
