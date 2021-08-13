public class StringsExample {
    public static void main(String[] args) {
        //Strings are reference data types
        //They are stored on the heap

        //Strings are Immutable
        //If you try to change the value of a string, a NEW string is created on the pool
        // and a NEW object is created on the heap
        String lang1 = "Java"; //Look like a primitive data type, but it's not
        String lang2 = new String("Python");

        String lang3 = "Java";
        String lang4 = new String("Java");

        lang1 = lang1 + " is a cool language";
        System.out.println(lang1);
        lang3 = lang3 + " is a boring language";
        System.out.println(lang3);
        System.out.println(lang4);

        //If you want to manipulate your strings DO NOT USE String class
        String output = "";
        for (int i = 0; i < 100; i++) {
            output += i + ", ";
        }
        System.out.println(output);

        //This is faster and consumes very less memory
        //StringBuffer is used if you want to write string-related manipulations
        StringBuffer sb = new StringBuffer("");
        for (int i = 0; i < 100; i++) {
            sb.append(i);
            sb.append(", ");
        }
        System.out.println(sb.toString());

    }
}
