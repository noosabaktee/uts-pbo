/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import classes.*;
import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DataReservation dres = new DataReservation();
        DataRoom droom = new DataRoom();
        
        User admin1 = new Admin(droom, dres,"Ahmad","Laki-Laki");
        User customer1 = new Customer(droom, dres,"Indri","Perempuan");
        
//      menambah kamar secara manual
        admin1.adminAddRoom("Standard",1000000.0);
        admin1.adminAddRoom("Mewah",3000000.0);
        customer1.adminAddRoom("Istimewa",5000000.0);
        
        do{
            Scanner input = new Scanner(System.in);
            System.out.println("1. Admin \n2. Customer");
            System.out.print("Masuk sebagai: ");
            int mode = input.nextInt();
            boolean login = false;
            switch(mode){
                case 1:
                    login = true;
                    do{
                        Scanner admin_input = new Scanner(System.in);
                    System.out.println("\n1. Detail Kamar \n2. Cek Kamar Kosong \n3. Tambah Kamar \n4. Tambah Pesanan \n5. Cek Pesanan \n6. Hapus Pesanan \n7. Logout");
                    System.out.print("Pilih Aksi: ");
                    int admin_action = admin_input.nextInt();
                    System.out.println();
                    switch(admin_action){
                        case 1:
                            admin1.viewRoom();
                            break;
                        case 2:
                            admin1.checkAvailableRoom();
                            break;
                        case 3:
                            Scanner add_room_input = new Scanner(System.in);
                            System.out.print("Masukkan Type : ");
                            String room_type = add_room_input.nextLine();
                            System.out.print("Masukkan Harga : ");
                            double room_price = add_room_input.nextDouble();
                            admin1.adminAddRoom(room_type,room_price);
                            break;
                        case 4:
                            Scanner add_res_input = new Scanner(System.in);
                            System.out.print("Masukkan Nomor Kamar : ");
                            int room_number = add_res_input.nextInt();
                            admin1.addRes(room_number);
                            break;
                        case 5:
                            admin1.viewReservation();
                            break;
                        case 6:
                            Scanner del_res_input = new Scanner(System.in);
                            System.out.print("Masukkan Nomor Pesanan : ");
                            int res_number = del_res_input.nextInt();
                            admin1.deleteRes(res_number);
                            break;
                        case 7:
                            login = false;
                            break;
                        default:
                            System.out.println("Masukkan tidak valid");
                        }
                    }while(login);
                    break;
                case 2:
                    login = true;
                    do{
                        Scanner customer_input = new Scanner(System.in);
                        System.out.println("\n1. Detail Kamar \n2. Cek Kamar Kosong \n3. Tambah Pesanan \n4. Cek Pesanan \n5. Logout");
                        System.out.print("Pilih Aksi: ");
                        int customer_action  = customer_input.nextInt();
                        System.out.println();
                        switch(customer_action){
                            case 1:
                                customer1.viewRoom();
                                break;
                            case 2:
                                customer1.checkAvailableRoom();
                                break;
                            case 3:
                                Scanner add_res_input = new Scanner(System.in);
                                System.out.print("Masukkan Nomor Kamar : ");
                                int room_number = add_res_input.nextInt();
                                customer1.addRes(room_number);
                                break;
                            case 4:
                                customer1.viewReservation();
                                break;
                            case 5:
                                login = false;
                                break;
                            default:
                                System.out.println("Masukkan tidak valid");
                        }  
                    }while(login);
                    break;
                default:
                    System.out.println("Masukkan tidak valid");

            }
        }while(true);
        
    }
    
}
