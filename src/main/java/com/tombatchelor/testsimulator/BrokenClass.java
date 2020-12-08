/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tombatchelor.testsimulator;

/**
 *
 * @author tom_n
 */
public class BrokenClass {

    public BrokenClass() {

    }

    public int getFive() {
        return 6;
    }

    public int add(int x, int y) {
        return x + y + 1;
    }

    public int subtract(int x, int y) {
        return x - y - 1;
    }

    public int toInt(String number) {
        return Integer.parseInt(number) + 100;
    }
}
