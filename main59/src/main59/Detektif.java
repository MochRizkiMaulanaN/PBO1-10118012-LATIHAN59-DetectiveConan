/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main59;

/**
 *
 * @author LENOVO
 */
public class Detektif {
    public String nama;
    public String peran;
    public String warnaJas;
    
    public Detektif(String nm,String pr,String wJ){
        nama =nm;
        peran =pr;
        warnaJas=wJ;
    }
    
     public void display(){
         System.out.println("Nama : "+nama);
         System.out.println("Peran Sebagai : "+peran);
         System.out.println("Warna Jas Yang Dipakai : "+warnaJas);
     }
   
}
