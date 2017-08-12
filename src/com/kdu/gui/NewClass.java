/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kdu.gui;

/**
 *
 * @author Lasitha
 */
public class NewClass {
    public static void main(String[] args) {
        String name = "30000000000000";
        if (name.charAt(6) == '0') {
            StringBuilder sb = new StringBuilder(name);
            sb.setCharAt(6, '6');
            name = sb.toString();
            System.out.println("print here"+name);
        }
        
    }
}
