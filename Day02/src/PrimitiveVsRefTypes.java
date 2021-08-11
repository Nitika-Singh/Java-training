public class PrimitiveVsRefTypes {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;

        i = j; //i = 20
        i++; //i = 21
        System.out.println(i); //21
        System.out.println(j); //20

        int array1[] = {100};
        int array2[] = {200};

        array1 = array2; //array1 = {200}
        array1[0] = 201; //array1 = {201}

        System.out.println(array1[0]); //201
        System.out.println(array2[0]); //200

    }
}
