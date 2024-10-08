/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;
/**
 *
 * @author acer
 */
public class Admin extends User {
    DataRoom droom = new DataRoom();
    DataReservation dres = new DataReservation();
    
    public Admin(DataRoom droom, DataReservation dres,String username,String gender){
        super(droom, dres,username,gender);
        this.dres = dres;
        this.droom = droom;
    }

    @Override
    public void adminAddRoom(String type, double price){
        droom.addRoom(type,price);
    };
    
    @Override
    public void deleteRes(int res_number){
        droom.setRoomAvailable(dres.getRoomNumberFromRes(res_number), true);
        dres.deleteRes(res_number);
    };
}
