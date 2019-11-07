/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118078.latihan57.vehicle;

/**
 *
 * @author         
 * Nama     : Steven Danesswaralay
 * Kelas    : IF-2
 * Nim      : 10118078
 * Deskripsi Tugas : Vehicle
 */
public class Bicycle extends Vehicle{
    private int myGearCount;
    
    public Bicycle() {
        System.out.println("Bicycle");
    }

    public int getMyGearCount() {
        return myGearCount;
    }

    public void setMyGearCount(int myGearCount) {
        this.myGearCount = myGearCount;
    }

}
