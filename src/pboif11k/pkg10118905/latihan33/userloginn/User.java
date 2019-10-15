/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif11k.pkg10118905.latihan33.userloginn;

/**
 *
* @author Fitri
 * Nama     : Anindira Dina Fitriani
 * Kelas    : IF11-K
 * Nim      : 10118905
 * Deskripsi: Program User login
 */
public class User{
    private String username;
    private String password;
    private boolean statusAkun;
    
    private boolean cekAkun(String parUsername, String parPassword){
        if((parUsername.equals("RizkiAdam"))&&(parPassword.equals("terbaikselalu"))){
            statusAkun = true;
            return true;
            
        }
        else {
             statusAkun = false;
             return false;
        }
    }
    private void hasilLogin(boolean status,String parUsername){
        if(status == true){
            System.out.println("*****Hallo "+parUsername.toUpperCase()+"*****");
            System.out.println("Selamat Datang di aplikasi ini");
        } else
            System.out.println("Ooops, User Name atau Password anda salah");
    }
    public void pengecekanLogin(String parUsername, String parPassword){
        username = parUsername;
        password = parPassword;
        cekAkun(username,password);
        hasilLogin(statusAkun,username);
    }
}
