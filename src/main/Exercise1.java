public class Exercise1 {
    public boolean login (String username, String password) {
        if (username.isEmpty() || password.isEmpty())
            System.out.println("You should fill all fields");
        else {
            if (username.length() >= 30 || password.length() >= 30)
                System.out.println("Your username or password can not be more than 30 characters");
            else
                return checkLogininDB(username, password);
        }
        return false;
    }

    public boolean checkLogininDB (String username, String password){
        if (username == "user" && password == "pass")
            return true;
        else
            return false;
    }
}