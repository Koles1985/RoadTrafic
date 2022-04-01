/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.koles;

import com.koles.vehicle.Bus;
import com.koles.vehicle.Car;

/**
 *
 * @author User
 */
public class RoadTrafic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Car lada = new Car();
       lada.start();
       lada.move();
       lada.stop();
       
       Bus liaz = new Bus();
       liaz.start();
       liaz.move();
       liaz.stop();
        
    }
    
}
