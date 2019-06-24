public class Dog extends Animal{
    //задаём поля-состояния
    private static String name;
    private double age;
    private String breed;

    //констуктор собаки
    public Dog(String name, double age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }


    public void printDog() {
        System.out.println("Наша собака: " + this.name);
        System.out.println("Порода: "+this.breed);
    }

    public String getName() {
        return name;
    }

    public static void setName(String v) {
        name = v;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age=age ;
    }

    public void GetBreed() {
        return;
    }

    public void setBreed(String breed) {
        this.breed=breed;
    }
}







