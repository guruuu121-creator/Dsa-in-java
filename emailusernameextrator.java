import java.util.*;
public class emailusernameextrator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();
        char[] ch = email.toCharArray();
        int dot = 0;
        int rate = 0;
        int n = email.length();
        for(int i=0;i<email.length();i++){
            if(ch[i] == '.'){
                dot ++;

            }if(ch[i] == '@'){
                rate++;
            }
        }
        if(dot==0 || rate==0 || n<=2){
            System.out.print("Invlid formate of email:");
        }
        for(int i=0;i<n;i++){
            if(ch[i] == '@'){
                break;
            }else{
                System.out.print(ch[i]);
                sc.close();
            }
        }
        }
        
    }
