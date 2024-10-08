/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author acer
 */
public class Reservation {
    private int res_number;
    private int room_number;
    private String date;
    
    public Reservation(int res_number, int room_number, String date){
        this.res_number = res_number;
        this.room_number = room_number;
        this.date = date;
    }
    
    public int getResNumber() {
        return res_number;
    }
    
    public int getRoomNumber() {
        return room_number;
    }

    public String getDate() {
        return date;
    }
}
