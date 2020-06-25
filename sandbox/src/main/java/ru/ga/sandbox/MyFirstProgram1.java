package ru.ga.sandbox;

public class MyFirstProgram1 {

    public static void main (String[] args){
        hello("world");
        hello("user");
        hello("Igor");

        Sguare s = new Sguare(5);
        System.out.println("Площадь квадрата со стороной " + s.l + "=" +s.area() );

        Rectangle r = new Rectangle(4,6);
        System.out.println("Площадь прямоугоьника со сторонами " + r.a + " и " + r.b + " = " +r.area() );
    }

    public static void hello (String somebody) {

        System.out.println("Hello " + somebody + " !");
    }
}
