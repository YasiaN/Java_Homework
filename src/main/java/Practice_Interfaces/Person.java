package Practice_Interfaces;

public class Person implements Compareble<Person> {

    private String surname;
    private String name;
    private float age;

    public Person(String surname, String name, float age) {
        this.surname = surname;
        this.name = name;
        this.age = age;

    }

    @Override
    public int compareTo(Person person) {
        // return this.age-Person.age ();

        int result = this.surname.compareTo(person.surname);

        if (result == 0) {
            result = this.name.compareTo(person.name);
        }
        if (result != 0) {
            int result1 = this.surname.compareTo(person.surname);
            if (result1 == 0)
                return result1;
            if (result1 != 0) {
                int result2 = this.age.compareTo(person.age);
            }
            if (result2 == 0) {
                return result2;
            }

            return result;


            public String getSurname () {
                return surname;
            }

            public String getName () {
                return name;
            }
            public float getAge () {
                return age;
            }
        }
    }
}
