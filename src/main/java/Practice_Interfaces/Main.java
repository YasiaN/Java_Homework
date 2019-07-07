package Practice_Interfaces;


import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Купер, Ховстедр,Кутропали");
        Person personSheldon=new Person ("Купер","Шелдон", 50);
        Person personLeo=new Person ("Ховстедер","Леонард", 45);
        Person personRadsh=new Person ("Кутропали","Раджеш", 41);


        System.out.println("SORT ARRAY OF PERSON");
        Person [] PersonArray= new Person [] {personSheldon,personLeo,personRadsh};

        printArray(PersonArray);
        System.out.println("Отсортировали парней:");
        Arrays.sort (PersonArray);
        printArray(PersonArray);
    }

    public static void printArray (Person []personArray){
        System.out.println("Вывод парней из Теории Большого Взрыва ");

        for (int i = 0; i <personArray.length; i++) {
            System.out.println(personArray [i]).getName[]+ ", "+personArray.getAge());
        }
    }
}
