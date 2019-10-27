/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10118032.latihan59.detectiveconan;

/**
 *
 * @author Guntur Maulana Ibrahim
 * NAMA  : Guntur Maulana Ibrahim
 * KELAS : IF 1
 * NIM   : 10118032
 */
public class MainCharacter extends Character{
    
    private final String speciality;
    private final String goal;

    public MainCharacter(String speciality, String goal, String name, String from, boolean eyeglasses) {
        super(name, from, eyeglasses);
        this.speciality = speciality;
        this.goal = goal;
    }

    public String getSpeciality() {
        return speciality;
    }

    public String getGoal() {
        return goal;
    }
    
    public void displayCharacter() {
        System.out.println("-----");
        System.out.println("Nama : " + name);
        System.out.println("-----");
        System.out.println("Dari : " + from);
        if(eyeglasses) {
            System.out.println("Kecamata : Iya");
        } else {
            System.out.println("Kecamata : Tidak");
        }
        System.out.println("Specialis : " + speciality);
        System.out.println("Tujuan : " + goal);
        System.out.println();
    }
    
}
