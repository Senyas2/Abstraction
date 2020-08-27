package Abstract;
abstract class  Shape{
abstract void draw ();
}
class Circle extends Shape{
    @Override
    void draw() {
        System.out.println("Круг");
        System.out.println("-------------");
    }
}
class Rectangle extends  Shape{
    @Override
    void draw() {
        System.out.println("Прямоугольник");
        System.out.println("-------------");
    }
}