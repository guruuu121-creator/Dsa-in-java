import java.util.*;
public class GLACollegeEmailGenerator {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String firstname = sc.nextLine();
    String lastname = sc.nextLine();
    String branch = sc.nextLine();
    int year = sc.nextInt();
    System.out.print(firstname + "." + lastname + "_" + branch + year +"@gla.ac.in");
    sc.close();
 }      
}
