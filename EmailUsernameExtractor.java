public class EmailUsernameExtractor {
    public static String emailextract(String email){
        int at = email.indexOf("@");
        return email.substring(0,at);
    }
    public static void main(String[] args) {
        String email="nishank2007@gmail.com";
        String username = emailextract(email);
        System.out.println(username);
    }
}
