public class PassByRef {
    public static void main(String[] args) {
        char[] lettersInYourName = new char[10];
        initializeLetters(lettersInYourName);
        for (int i=0; i < lettersInYourName.length; i++) {
                System.out.println(lettersInYourName[i]);
        }
        //Name gets initialize by calling a database
        //Name has to be initialized by calling an external Web service
    }

    static void initializeLetters(char[] alphabets) {
        alphabets[0] = 'K';
        alphabets[1] = 'i';
        alphabets[2] = 's';
        alphabets[3] = 'h';
        alphabets[4] = 'o';
        alphabets[5] = 'r';
        alphabets[6] = 'e';
    }
}
