/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;
/**
 *
 * @author acer
 */
public class DataRoom {
    private int length = 0;
    private Room rooms[] = new Room[3];
    
    public void addRoom(String type, double price){
        if(length < 3){
            rooms[length] = new Room(length+1,type,price,true);
            System.out.println("Kamar no "+ (length+1) +" berhasil ditambahkan");
            length++;
        }else{
            System.out.println("Kamar tidak dapat ditambah lagi. Maksimal 3!");
        }
    } 
    
    public void getRoomList(){
        System.out.println("List Room ");
        for(int i=0;i<length;i++){
            System.out.println("Number : " + rooms[i].getNumber());
            System.out.println("Type : " + rooms[i].getType());
            System.out.println("Harga : " + rooms[i].getPrice());
            System.out.println("----------------------------------");
        }
    }
    
    public void setRoomAvailable(int number, boolean available){
        for(int i=0;i<length;i++){
            if(number == rooms[i].getNumber()){
                rooms[i].setAvailable(available);
            }
        }
    }
    
    public void getRoomAvailable(){
        System.out.println("List Available Room ");
        for(int i=0;i<length;i++){
            if(rooms[i].getAvailable() == true){
                System.out.println("Number : " + rooms[i].getNumber());
                System.out.println("Type : " + rooms[i].getType());
                System.out.println("Harga : " + rooms[i].getPrice());
                System.out.println("----------------------------------");
            }      
        }
        System.out.println();
    }
    
    public int getLength(){
        return length;
    }
}
