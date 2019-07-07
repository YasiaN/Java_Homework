package Practice_Object;

public class Main {
    public static void main(String[] args) {
        Object object=new Object ();
        System.out.println(object.toString());

        Pen pero = new Pen("black",0.3,"Pushkin");
        Pen sharikovaja = new Pen ("blue",0.6,"Sidorov");

        System.out.println("Ручки Перо и Шариковая - равны?"+pero.equals (sharikovaja));

        Pen pero2=new Pen ("black",0.3,"Pushkin");
        Pen pero15vek=new Pen ("black",0.6,"Pushkin");
        System.out.println("Ручки Перо и Перо2 равны?"+pero.equals (pero2));
        System.out.println("Ручки Перо2 и Перо15век равны?"+pero2.equals(pero15vek));
        System.out.println("Ручки Перо2 и Перо2 равны?"+pero2.equals(pero2));
        System.out.println();


        System.out.println("Метод toString");
        System.out.println(pero2);
        System.out.println(pero.toString());
        System.out.println();
    }
}
