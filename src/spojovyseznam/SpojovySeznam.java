/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spojovyseznam;

/**
 * jednoduchý prográmek na vyzkoušení spojového seznamu a vkládání do něj
 * @author DHA
 */
public class SpojovySeznam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* nadefinování pár objektů typu Ship
           pro uryhlení nezadáváme z konzole */
        Ship shipOne = new Ship ("Independence",1,1,1);
        Ship shipTwo = new Ship ("Enterprice",1,1,1);
        Ship shipThree = new Ship ("Prince of Wales",1,1,1);
        Ship shipFour = new Ship ("Bismarck",1,1,1);
        Ship shipFive = new Ship ("Graff Zeppelin",1,1,1);
        
        // vložení do spojového seznamu
        VlastniSeznam flotila = new VlastniSeznam ();
        flotila.addShip(shipOne);
        flotila.addShip(shipTwo);
        flotila.addShip(shipThree);
        flotila.addShip(shipFour);
        flotila.addShip(shipFive);
        
        /* a teď vložíme loď na libov. místo flotily
           opět pro jednoduchost:
           index = 3
           loď Indianapolis */
        flotila.insertShip(new Ship ("Indianapolis",1,1,1), 3);
        
        // ... a finální ověření
        flotila.printList();
        
    }
    
}
