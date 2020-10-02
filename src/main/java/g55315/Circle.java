/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g55315;

/**
 *
 * @author g55315
 */
public class Circle extends ColoredShape{
    private Point center;
    
    private double radius;
    
    public Circle(Point center, double radius, char color) {
        //     if ((radius == null) || (center == null)) {
          // throw new IllegalArgumentException("One of the arguments was null");
        //}
        super(color);
        this.center = center;
        this.radius = radius;
    }
    
    boolean isInside(Point p) {
        return Math.sqrt(((center.getX() - p.getX()) * (center.getX() - p.getX())) +
                ((center.getY() - p.getY()) * (center.getY() - p.getY())) ) < radius;
    }
    
    void move(double dx, double dy) {
        center.move(dx, dy);
    }
    
}
