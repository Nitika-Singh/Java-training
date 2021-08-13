public class PersonUser {
    public static void main(String[] args) {
        Person p = new Person("Sam", 12, true);
        System.out.println(p.getName());
        System.out.println(p.getAge());
        System.out.println(p.isSingle());

        Car nano = new Car("Nano", 2010);
        System.out.println(nano.getModel());
        System.out.println(nano.getYearOfMake());
    }
}
