package JavaOOPHuman;

public class Human {
    private String name;
    private int age;
    private int heightInInches;
    private String eyeColor;

    public Human() {

    }

    public Human(String name, int age, int heightInInches, String eyeColor) {
        this.name = name;
        this.age = age;
        this.heightInInches = heightInInches;
        this.eyeColor = eyeColor;
    }

    public void speak() {
        System.out.printf("Name is %s \n", name);
        System.out.printf("Age is %s \n", age);
        System.out.printf("Height is %s \n", heightInInches);
        System.out.printf("The eye color is %s \n", eyeColor);

    }

    public void eat() {
        System.out.println("Eat ");

    }

    public void walk() {
        System.out.println("Walk ");

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeightInInches(int heightInInches) {
        this.heightInInches = heightInInches;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }
}



















