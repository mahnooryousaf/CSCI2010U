public class Rectangle extends Shape{

    private float length;
    private float width;

    public Rectangle(String color, float length,float width){
        super(color);
        this.length = length;
        this.width = width;
    }

    public float getArea(){
        return length * width;
    }

    public float getPerimeter(){
        return (2*length) + (2*width);
    }

    public String toString(){
        return super.color + " rectangle with length " + length + " and width " + width;
    }
}
