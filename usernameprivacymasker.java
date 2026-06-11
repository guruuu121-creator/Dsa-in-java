import java.util.*;
public class usernameprivacymasker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();
        String[] parts = email.split("@");
        String username = parts[0];
        if(username.length()<=5){
            System.out.print(email);
        }else{
            String domain = parts[1];
            String prefix = username.substring(0, 3);
            String suffix = username.substring(username.length()-2);
            String star = "";
            for(int i=0;i<username.length()-5;i++){
                star += "*";
            }
            System.out.print(prefix + "" + star + "" + suffix + "" + "@" + domain);
            sc.close();
        }
    }
}
