public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Marfa", 47.5, 1);
        cat.setName();
        cat.printCat();

        Dog dog = new Dog ("Жучка",4.3, "золотистый ретривер");
        Dog.setName("Тотошка");
        dog.printDog();

    }
}
