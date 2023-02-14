public class ShapeFactory {
    public Shape getShape(int shapeCode) {
        switch (shapeCode){
            case 0:
                return new Square();
            default:
                return new Circle();
        }
    }
}
