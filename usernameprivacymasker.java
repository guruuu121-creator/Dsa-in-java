public class usernameprivacymasker {
    public static String usernamemasker(String email){
        String[] parts = email.split("@");

        String username = parts[0];
        String domain = parts[1];
        if(username.length()<=5){
            return email;
        }
        String prefix = username.substring(0,3);
        String suffix = username.substring(username.length()-2);
         
        String star = "";
        for(int i=0;i<username.length()-5;i++){
            star += "*";
        }
        return prefix + star + suffix + "@" + domain;
    }
    public static void main(String[] args) {
        String email = "guruuu121@gmail.com";
        System.out.print(usernamemasker(email));
    }
    
}
