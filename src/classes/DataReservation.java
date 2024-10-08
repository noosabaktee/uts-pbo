/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author acer
 */
public class DataReservation {
    private int length = 0;
    private Reservation reservations[] = new Reservation[3];
    
    public void addRes(int room_number, String date){
        for(int i=0;i<reservations.length;i++){
            if(reservations[i] != null && reservations[i].getRoomNumber() == room_number){
                System.out.println("Kamar sudah terisi");
                return;
            }  
        }
        if(room_number > 3){
            System.out.println("Kamar dengan nomor ini tidak ada");
            return;
        }
        if(length < 3){
            reservations[length] = new Reservation(length+1, room_number, date); 
            System.out.println("Kamar no "+ room_number + " berhasil dipesan");
            length++;
        }else{
            System.out.println("Pesanan tidak dapat ditambah lagi");
        }
    } 
    
    public void getResList(){
        System.out.println("List Reservation ");
        for(int i=0;i<reservations.length;i++){
            if(reservations[i] != null){
                System.out.println("Res Number : " + reservations[i].getResNumber());
                System.out.println("Room Number : " + reservations[i].getRoomNumber());
                System.out.println("Date : " + reservations[i].getDate());
                System.out.println("----------------------------------");
            }  
        }
    }
    
    public void deleteRes(int res_number){
        boolean deleted = false;
        for(int i=0;i<length;i++){
            if(reservations[i].getResNumber() == res_number){
                reservations[i] = null;
                System.out.println("Pesanan no "+ res_number + " berhasil dipesan");
                deleted = true;
            }
        }
        if(deleted == false){
            System.out.println("Gagal menghapus reservasi");
        }
        length--;
    }
    
    public int getRoomNumberFromRes(int res_number){
        int room_number = 0;
        for(int i=0;i<length;i++){
            if(reservations[i].getResNumber() == res_number){
                room_number = reservations[i].getRoomNumber();
            }
        }
        return room_number;
    }
    
    public int getLength(){
        return length;
    }
}
