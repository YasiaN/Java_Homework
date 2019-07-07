package Practice_string.Wrapper_class;

public class Wrapper_classes_examples {
    //создаём объекты разных классов, приичём могут принимать на вход и String тоже (Кроме character)):

    public static void main(String[] args) {
        Integer i = new Integer(666);
        Integer i1=new Integer("777");
        Double d = new Double(5.11);
        Double d1=new Double("5.11");
        Boolean b = new Boolean(false);
        Boolean b1=new Boolean ("falseString");
        Short c = new Short((short) -30000);
        Short c1=new Short("-30000");

        //Методы. Преобразуем число в строку и проверим, что это реально строка:
        System.out.println("1.наше число:" + i);
        String s = i.toString();
        System.out.println("1.1.преобразованное в строку число:" + s);
        System.out.println("1.2.проверим, что это строка: прибавим 11 к нашему числу.Должно получиться 66611. Получаем:" + s + 11);
        if (s == "66611") {
            System.out.println("1.3.ура!всё верно");
            if (s != "66611") {
                System.out.println("1.3.что-то пошло не так.извиняй и проверяй.");

            }
        }
        System.out.println("");
                // теперь наоборот: превращаем строку в число:
                String l="111";
                System.out.println("2.наша строка:"+l);
                Integer k= Integer.parseInt(l);
                System.out.println("2.1. Преобразованное в строку число:" +k);
                System.out.println("2.2. Проверим, что это число: прибавим 00 к нашему числу. Должны получить 111. Получаем:" + k + 00);




    }
}

