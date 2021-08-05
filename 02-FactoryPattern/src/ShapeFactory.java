public class ShapeFactory {
	public Shape getShape(String shapeType) {
        Shape shapeObj = null;
        if (shapeType != null || shapeType.equals("")) {
            switch (shapeType) {
            case "Circle":
                shapeObj = new Circle();
                break;
            case "Rectangle":
                shapeObj = new Rectangle();
                break;
            case "Square":
                shapeObj = new Square();
                break;
            default:
                System.out.println("Invalid entered Shape type...");
                break;
            }
        }
        return shapeObj;
    }
}
