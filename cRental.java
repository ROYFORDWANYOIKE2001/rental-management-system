 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OO_Rental;

/**
 *
 * @author RedHatBoyTheRedRat
 */
public class cRental {
    
    private int Flat;
    private int House;
    private Double cost;
    private String Location;
    private Double NumberOfRooms;

    public int getFlat() {
        return Flat;
    }

    public void setFlat(int Flat) {
        this.Flat = Flat;
    }

    public int getHouse() {
        return House;
    }

    public void setHouse(int House) {
        this.House = House;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }


    public Double getNumberOfRooms() {
        return NumberOfRooms;
    }

    public void setNumberOfRooms(Double NumberOfRooms) {
        this.NumberOfRooms = NumberOfRooms;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }
}
