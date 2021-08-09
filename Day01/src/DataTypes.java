public class DataTypes {
    public static void main(String[] args) {
        //Statically typed language
        //int, long, double, char, boolean => primitive data types
        //Local variables
        int numberOfMonthsInAnYear = 12;
        int number_of_months_in_an_year = 12; //Python or Ruby way
        int i = 10;
        boolean isMarried = true; //CamelCase notation
        boolean is_married = true; //NOT A CONVENTION IN JAVA
        char startingLetter = 'A';
        double pi = 3.14;
        long salary = 238476;
        String name = "Sam"; //STORAGE IS A BIT DIFFERENT

        System.out.println(name);
        System.out.println(i);
        System.out.println(isMarried);
        System.out.println(startingLetter + ", " + pi);

        int age; //YOU have to Initialize before using it
        //System.out.println(age); //ERROR

        /*
        * let i = 10;
        * let isMarried = true;
        * */
    }
}
