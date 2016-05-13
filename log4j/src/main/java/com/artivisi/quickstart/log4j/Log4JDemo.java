/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artivisi.quickstart.log4j;

import java.util.Scanner;

/**
 *
 * @author SB604-05
 */
public class Log4JDemo {

    public void kali() {
        int a;
        int b;
        Scanner scan = new Scanner(System.in);
        System.out.println("a = ");
        a = scan.nextInt();
        System.out.println("b = ");
        b = scan.nextInt();
        int c = a * b;
    }
}
