/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cod;

import cod.forces.*;
import java.util.Scanner;
import maps.Maps;
import weapons.weapons;

/**
 *
 * @author Admin
 */
public class COD {
    
    /**
     * 
     * @param args the command line arguments
     */
      
    public static void main(String[] args) {
        // TODO code application logic here
        
        armedforces af;
        Maps mp;
        weapons wp;
        
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Select froces from the following list\n Army,Navy,Airforce(1,2,3)");
        int force = scan.nextInt();
        System.out.println("Select Maps from the following list\n city,Deserts,mountainous(1,2,3)");
        int map = scan.nextInt();
        System.out.println("Select weapons from the following list\n light,heavy,medium(1,2,3)");
        int weapons= scan.nextInt();
        forcesFactory ff =new forcesFactory();
        af = ff.forcesReturn(force);
        weaponsFactory wf =new weaponsFactory();
        wp =  wf.weponsReturn(weapons);
        mapsFactory mf = new mapsFactory();
        mp = mf.forcesReturn(map);
        
    }
    
}
