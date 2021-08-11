public class PersonUser {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        Person sam = new Person();
        sam.name = "Sam";
        sam.age = 12;
        sam.status = "Single";
        System.out.println(sam.name + ", " + sam.age + ", " + sam.status);
        sam.eat();
        sam.fightWithSomeone();

        Person dhoni = new Person();
        dhoni.name = "MS Dhoni";
        dhoni.age = 41;
        dhoni.status = "Maried";
        System.out.println(dhoni.name + ", " + dhoni.age + ", " + dhoni.status);
        dhoni.play();


        boolean b = false;
        int i = 10;
        String str = "some value";
        Person p1 = new Person();
    }
}
