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
public abstract class ColoredShape {
    char color;
    
    public ColoredShape(char color) {
       this.color = color;        
    }

    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }
    
    
}
