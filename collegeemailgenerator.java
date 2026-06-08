public class collegeemailgenerator {
    public static String collegeemail(String firstname ,String lastname , 
        String branch, int year){
   return (firstname + "." + lastname + "_" + branch +year+("@gla.ac.in")).toLowerCase();
    }
    public static void main(String[] args) {
       String  firstname="Abhiyank";
       String  lastname="Mishra";
        String  branch="cs";
        int year = 25;
        String email = collegeemail(firstname,lastname, branch,year);
        System.out.print(email);
    }
    
}
