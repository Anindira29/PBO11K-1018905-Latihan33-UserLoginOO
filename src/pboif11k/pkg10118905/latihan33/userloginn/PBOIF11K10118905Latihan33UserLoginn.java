/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif11k.pkg10118905.latihan33.userloginn;

import java.util.*;
/**
 *
 * @author Fitri
 * Nama     : Anindira Dina Fitriani
 * Kelas    : IF11-K
 * Nim      : 10118905
 * Deskripsi: Program User Login
 */

public class PBOIF11K10118905Latihan33UserLoginn {
    public static Scanner input = new Scanner(System.in);
    public static User user = new User();
    private static String userName;
    private static String password;
    public static void main(String args []){
        System.out.println("Masukkan User Name\t:");
        userName = input.nextLine();
        System.out.println("Masukkan Password\t:");
        password = input.nextLine();
        System.out.println("");
        user.pengecekanLogin(userName, password);
        
    }
    
}
