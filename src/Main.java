public class Main {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Triangle(4, 3);
        shapes[2] = new Square(6);


        double totalArea = getTotalArea(shapes);
        System.out.println("Сумарна площа всіх фігур: " + totalArea);
    }

    public static double getTotalArea(Shape[] shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.getArea();
        }
        return totalArea;
    }
}

