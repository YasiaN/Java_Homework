package Practice_Object;

import java.util.Objects;

public class Pen {
    private String color;
    private double thickness;
    private String host;


    // задаём ДВА конструктора:
    public Pen(String color, double thickness, String host) {
        this.color = color;
        this.thickness = thickness;
        this.host = host;
    }

    public Pen(String host, String color, double thickness) {
        this.color = color;
        this.thickness = thickness;
        this.host = host;
    }
//задаём методы GET и SET от руки:

    public String getColor() {
        return color;
    }

    public double getThickness() {
        return thickness;
    }

    public String getHost() {
        return host;
    }

    public void setColor() {
        this.color = color;
    }

    public void setThickness() {
        this.thickness = thickness;
    }

    public void setHost() {
        this.host = host;
    }

    //ПЕРЕОПРЕДЕЛЯЕМ МЕТОД toString
    @Override
    public String toString() {
        return ("Ручка-перо, цвет: " + color + "Владелец: " + host + "Толщина пера: " + thickness);

    }

/*
    //Переопределяем метод Хэшкод
    @Override


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pen pen = (Pen) o;
        return Double.compare(pen.thickness, thickness) == 0 &&
                Objects.equals(color, pen.color) &&
                Objects.equals(host, pen.host);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, thickness, host);

    }
*/

@Override
public double HashCode () {

    return (1*thickness);}

    @Override
    public boolean equals (Object obj){
        if (this==obj){
            return true;
        }
    if (null==obj) {
    return false;
    }
    //проверяем, что объект - одного класса:

    if (getClass()!=obj.getClass()) {
        return false;
    }
    // obj приводится к типу карандаш (прокастим типом Pen):
        Pen pen=(Pen) obj;
    if (thickness == pen.thickness){
        if ((color.equals (pen.color))| (host.equals (pen.host))) {
            return true;
        }

    }
    return false;

    }
}



/*
    //переопределим метод Хэшкод

   @Override
    public double hashCode[];

    {
        //переопределяем метод
        return 33 * thickness + host.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        //ПРОВЕРЯЕМ Рефлекс-ть, симм-ть, транз-ть, непротивор-ть
        //Рефлексивность и симм-ть: надо обратиться к самому объекту через this
        if (this == obj) {
            return true;
            //проверяем нулевую ссыль, при сравнении с литералом null должен вернуть false
        }
        if (null == obj) {
            return false;
        }

        // Транзит-ть:

        // непротивор-ть: привызове м.equals для одних и тех же обьектов ск-ко угодно раз
        //должны получ такой же рез-т
        }
}

*/