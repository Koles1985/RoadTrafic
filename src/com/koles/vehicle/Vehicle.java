/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.koles.vehicle;

/**
 *
 * @author User
 */
public interface Vehicle {
    default void start(){
        System.out.println("Начинаю движение.");
    }
    void move();
    
    default void stop(){
        System.out.println("Останавливаюсь.");
    }
    
}
