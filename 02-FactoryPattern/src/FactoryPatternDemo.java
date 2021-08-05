
public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("Square");
        shape.draw();
        Shape shape2 = shapeFactory.getShape("Circle");
        shape2.draw();
        // Output:
        // Square draw() calling
        // Circle draw() calling
    }
}
