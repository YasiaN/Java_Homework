package Practice_string.Count_Square_Triangle;

public class Count_of_Square_of_Triangle {

    //задаём поля-состояния
    private char sideA = 50;
    private static char hightA = 1050;
    private char squareA;

    //конструктор треугольника
    public Count_of_Square_of_Triangle(char sideA, char hightA, char squareA) {
        this.sideA = sideA;
        this.hightA = hightA;
        this.squareA = (char) (0.5 * (sideA + hightA));

    } Count_of_Square_of_Triangle(){}

}

    //методы

