/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cod;

import cod.forces.*;

/**
 *
 * @author Admin
 */
public class forcesFactory {
        private armedforces object;
    public armedforces forcesReturn(int type){
        if(type==1){
            armedforces af =new army();
            this.object = af;
        }
        else if(type==2){
            armedforces nv = new navy();
            this.object = nv;
        }
        else if(type==3){
            armedforces aforce = new airforce();
            this.object = aforce;
        }
        return this.object;
    }
}
