package Persistence;

abstract class Persistence {
        abstract void draw();
        {

        }
    }
    class Line extends Persistence
    {
        public void draw()
        {
            System.out.println("draw Line");
        }

    }
    class Rectangle extends Persistence
    {
        public void draw()
        {
            System.out.println("draw rectangle");
        }
    }
    class  Circle extends Persistence
    {
        public void draw()
        {
            System.out.println("draw circle");
        }

    }

    class  Cube extends Persistence
    {
        public void draw()
        {
            System.out.println("draw cube");
        }

    }
    class Mainclass{
        public static void main(String[] args) {
           Persistence  obj=new Line();
            obj.draw();
            Persistence obj1=new Rectangle();
            obj1.draw();
            Persistence obj2=new Circle();
            obj2.draw();
            Persistence obj3=new Cube();
            obj3.draw();
        }

    }


