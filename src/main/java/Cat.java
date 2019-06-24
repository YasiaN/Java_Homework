public class Cat extends Animal {
    //задаем поля (состояния)
    private String name;
    private double weight;
    private int age;
    private String String1;
    private Object String;

    //конструктор кошки. Строим обьект: кошку.

    public Cat(String name, double weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;

    }
//задаём методы (как изменяется кошка, поведение)

    public void printCat() {
        System.out.println("Name: " + name);
    }
//   методы чтобы обратиться к полям или изменить их

    public String getName() {
        return name;
    }
    public void setName() {
        this.name=name;
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(Double name) {
        this.weight=weight;
    }

    public void setAge(double Age) {
        this.age=age;
    }

    public double getAge() {
        return age;
    }
}