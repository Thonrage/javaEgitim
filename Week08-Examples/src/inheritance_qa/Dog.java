package inheritance_qa;

public class Dog extends MainDog {
    private String name;
    private String type;
    private int age;
    private int birthdayYear;


    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println(name + age);
    }

    public Dog(int age, int birthdayYear) {
        this.age = age;
        this.birthdayYear = birthdayYear;
    }


}
