package g55315;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author g55315
 */
public class Drawing {
    private List<Shape> shapes;
    
    int height;
    
    int width;
    
    public Drawing() {
        this.height = 100;
        this.width = 100;
        shapes = new ArrayList<>();
    }
    
    public Drawing(int width, int height) {
        this.height = width;
        this.width = height;
        shapes = new ArrayList<>();
    }
    
    public void addShape(Shape shape) {
        shapes.add(shape);
    }
    
    public Shape getShapeAt(Point p) {
        Shape shape;
        for (int shapeNb = 0; shapeNb < shapes.size(); shapeNb++) {
            if (shapes.get(shapeNb)
        }
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
    
    
    
    
}
