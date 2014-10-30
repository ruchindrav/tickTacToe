/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticktaktoe;

import java.awt.image.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Ruchi
 */
public class imageHandling {
    
    private String captain = "/ticktaktoe/captain.png";
    private String superman = "/ticktaktoe/superman.png";
    
    
    

    /**
     * @return the img
     */
    public String getCaptain() {
        return captain;
    }

    /**
     * @return the superman
     */
    public String getSuperman() {
        return superman;
    }

    /**
     * @param captain the captain to set
     */
    public void setCaptain(String captain) {
        this.captain = captain;
    }

    /**
     * @param superman the superman to set
     */
    public void setSuperman(String superman) {
        this.superman = superman;
    }
    
}
