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
public class Rectangle extends ColoredShape {
    private Point upperLeft;
    private double width;
    private double height;
    
    public Rectangle(Point upperLeft, double width, double height, char color) {
        super(color);
        this.height = height;
        this.width = width;
        this.upperLeft = upperLeft;
    }
    boolean isInside(Point p) {
        return p.getX() < (upperLeft.getX() + width) &&   
                p.getY() < (upperLeft.getY() + height) &&
                p.getX() > upperLeft.getX() &&   
                p.getY() > upperLeft.getY();
    }
    
    void move(double dx, double dy) {
        upperLeft.move(dx, dy);
    }
    
    
}
