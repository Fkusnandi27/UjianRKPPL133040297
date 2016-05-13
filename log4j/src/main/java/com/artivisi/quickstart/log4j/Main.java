/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artivisi.quickstart.log4j;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import static org.apache.log4j.lf5.viewer.LogTableColumn.LEVEL;

/**
 *
 * @author SB604-05
 */
public class Main {

    private static final Logger logger = Logger.getLogger(Log4JDemo.class);

    public static void main(String[] args) {
        Log4JDemo log = new Log4JDemo();
        logger.log(Level.DEBUG,"Ini adalah debug message");
        logger.info("Ini adalah info message");
        logger.warn("Ini adalah fatal message");
        logger.error("Ini adalah warn message");
        logger.fatal("Ini adalah error message");

    }
}
