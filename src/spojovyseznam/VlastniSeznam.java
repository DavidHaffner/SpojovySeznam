/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spojovyseznam;

import java.util.LinkedList;

/**
 * Třída representuje spojový seznam lodí & metody
 * @author DHA
 */
public class VlastniSeznam {
    // jediný atribut: spojový seznam objektů Ship 
    private LinkedList <Ship> seznam = new LinkedList <Ship> ();
    
    public VlastniSeznam () {
        this.seznam = seznam;
    }
    
    // metoda vloží novou loď na pozici podle vlož. indexu
    public void insertShip (Ship newShip,int index) {
        this.seznam.add(index, newShip);
    }

    /**
     * @return the seznam
     */
    public LinkedList <Ship> getSeznam() {
        return seznam;
    }

    /**
     * @param seznam the seznam to set
     */
    public void setSeznam(LinkedList <Ship> seznam) {
        this.seznam = seznam;
    }
    
    // metoda přidá další loď do spojového seznamu
    public void addShip (Ship ship) {
        this.seznam.add(ship);
    }
    
    // metoda vypíše názvy lodí celého seznamu
    public void printList () {
        int size = this.seznam.size();
        for (int i=0; i< size; i++) {
            System.out.println(this.seznam.get(i).getName());
        }
    }
}
