public class stringpasswordgenerator {
    public static String Passwordgenerate(String name, int year) {
        if (name.length() >= 4) {
            return name.substring(0, 4).toUpperCase() + year;
        }
        return name.toUpperCase() + year;
    }
    public static void main(String[] args) {
        String name = "Abhiyank mishra";
        int year = 2007;
        String password = Passwordgenerate(name, year);
        System.out.println(password);
    }
}