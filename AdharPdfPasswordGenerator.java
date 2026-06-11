import java.util.Scanner;
public class AdharPdfPasswordGenerator {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    int year = sc.nextInt();
    char[] ch = name.toCharArray();
    if(name.length()<=3){
        System.out.print(name.toUpperCase());
    }else{
        for(int i=0;i<=3;i++){
            char c = ch[i];
            System.out.print(c);
        }  
    }
   System.out.print(year); 
  sc.close();
  }  
}

