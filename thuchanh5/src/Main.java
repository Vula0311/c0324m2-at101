public  class Main {
    public static void main(String[] args) {
        Shape shape =new Shape();
        System.out.println(shape);
        shape = new Shape("blue", false);
        System.out.println(shape);

        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(5.4);
        System.out.println(circle);
        circle = new Circle(5.4,"pink",false);
        System.out.println(circle);

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(5.4,3);
        System.out.println(rectangle);
        rectangle = new Rectangle(5,4,"yellow",true);
        System.out.println(rectangle);

        Square square = new Square();
        System.out.println(square);
        square = new Square(5);
        System.out.println(square);
        square = new Square(3,3,"Grey",true);
        System.out.println(square);
    }
}