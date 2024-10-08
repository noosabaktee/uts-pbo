/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import interfaces.IUser;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author acer
 */
public class User implements IUser{
    private String username;
    private String gender;
    DataReservation dres = new DataReservation(); 
    DataRoom droom = new DataRoom();
    
    public User(DataRoom droom,DataReservation dres, String username,String gender){
        this.username = username;
        this.gender = gender;
        this.dres = dres;
        this.droom = droom;
    }
    
    public String getUsername(){
        return username;
    }
    
    public String getGender(){
        return gender;
    }
    
    public void addRes(int room_number){
        String pattern = "MM/dd/yyyy HH:mm:ss";
        DateFormat df = new SimpleDateFormat(pattern);
        Date today = Calendar.getInstance().getTime();        
        String date = df.format(today);
        dres.addRes(room_number, date);
        droom.setRoomAvailable(room_number, false);
    }
    
    public void checkAvailableRoom(){
       droom.getRoomAvailable();
    }
    
     public void viewRoom(){
        droom.getRoomList();
    }
     
     public void viewReservation(){
        dres.getResList();
    }
     
//  Kedua fungsi ini hanya bisa dilakukan oleh admin
//  Kedua fungsi ini di override di kelas admin
    public void adminAddRoom(String type, double price){
        System.out.println("Hanya admin yang bisa menambah kamar");
    }
    public void deleteRes(int res_number){
        System.out.println("Hanya admin yang bisa menghapus kamar");
    }
}
