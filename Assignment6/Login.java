public class Login {
    public static String loginUser(String user, String pass) {
        String Userid = user;
        String Password = pass;

        System.out.println("Enter username");
        System.out.println("Enter Password");

        if (Userid.equals("Ajay") && Password.equals("password")) {
            System.out.println("successfull");
        } else {
            System.out.println("unsuccessfull");
            return null;
        }
        
		return Password;
		
		
    }
}
    
   