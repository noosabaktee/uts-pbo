/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author acer
 */
public class Room {
    private int number;
    private String type;
    private double price;
    private boolean available;
    
    public Room(int number,String type, double price, boolean available){
        this.number = number;
        this.type = type;
        this.price = price;
        this.available = available;
    } 
    
    public int getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }
    
    public double getPrice() {
        return price;
    }
    
    public boolean getAvailable() {
        return available;
    }
    
    public void setAvailable(boolean available) {
        this.available = available;
    }
}
