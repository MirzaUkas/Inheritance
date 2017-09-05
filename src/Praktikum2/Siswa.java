/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum2;

/**
 *
 * @author MirzaUY
 */
public class Siswa {
    int abs;
    String nama,kelas;
    //Constructor
    public Siswa(String nama,int abs){
    this.nama = nama;
    this.abs = abs;
    }
    //Method
    public void data(){
    System.out.println("Nama: "+this.nama);
    System.out.println("No.Absen: "+this.abs);
    }
}
