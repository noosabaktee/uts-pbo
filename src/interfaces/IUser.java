/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

/**
 *
 * @author acer
 */
public interface IUser {
    public String getUsername();
    public String getGender();
    public void addRes(int room_number);
    public void checkAvailableRoom();
    public void viewRoom();
    public void viewReservation();
}
