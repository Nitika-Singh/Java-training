public class Person {
    private String name;
    private int age;
    private boolean single;

    public Person(String name, int age, boolean isSingle) {
        this.name = name;
        this.age = age;
        this.single = isSingle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSingle() {
        return single;
    }

    public void setSingle(boolean single) {
        this.single = single;
    }
}
