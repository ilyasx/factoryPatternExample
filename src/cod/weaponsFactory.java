/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cod;

import weapons.*;

/**
 *
 * @author Admin
 */
public class weaponsFactory {
    private weapons object;
    public weapons weponsReturn(int type){
        switch (type) {
            case 1:
                weapons li = new light();
                this.object=li;
                break;
            case 2:
                weapons hv = new heavy();
                this.object=hv;
                break;
            case 3:
                weapons md = new medium();
                this.object=md;
                break;
            default:
                break;
        }

        return this.object;
    }
}
