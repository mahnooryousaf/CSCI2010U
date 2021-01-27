public class Circle extends Shape{

    private float radius;

    public Circle(String color, float radius){
        super(color);
        this.radius = radius;
    }

     public float getArea(){
         return ((3.14f)*(float)(Math.pow(radius,2)));
    }

    public float getPerimeter(){
        return (2*radius*(3.14f));
    }

    public String toString(){
        return super.color + " circle with radius " + radius;
    }
}
