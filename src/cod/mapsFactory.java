/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cod;


import maps.*;

/**
 *
 * @author Admin
 */
public class mapsFactory {
    private Maps mp;
    
    public Maps forcesReturn(int type){
        if(type==1){
            Maps cy = new city();
            this.mp = cy;
        }
        else if(type==2){
            Maps ds = new deserts();
            this.mp = ds;
        }
        else if(type==3){
            Maps mn = new mountainous();
            this.mp = mn;
        }
        return this.mp;
    }
}
