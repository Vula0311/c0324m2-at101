public class Square extends Rectangle {
    private double side = 1.0;


    public Square(){
    }
    public Square(double side){
        super(side, side);
    }
    public Square(double side1, double side2, String color, boolean filled){
        super(side1,side2,color,filled);
    }
    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLenght(side);
    }
    @Override
    public void setWidth(double width) {
        setSide(width);
    }
    @Override
    public void setLenght(double lenght){
        setSide(lenght);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

}
