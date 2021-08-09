public class ArraysBasics {
    public static void main(String[] args) {
        //fixed size collection of data
        //Array is a reference data type which is stored on the heap
        int[] numbers = {10, 20, 30, 40, 50};
        String cities[] = { "Chennai", "Pune", "Bangalore" };
        System.out.println(cities[0]);
        System.out.println(cities[1]);
        System.out.println(cities[2]);

        for (int i = 0; i < cities.length; i++) {
            System.out.println(cities[i]);
        }

        int[] someNumbers = new int[10];
        for (int i = 0; i < someNumbers.length; i++) {
            System.out.println(someNumbers[i]);
        }

        boolean[] someBoolean = new boolean[10];
        for (int i = 0; i < someBoolean.length; i++) {
            System.out.println(someBoolean[i]);
        }

    }
}
