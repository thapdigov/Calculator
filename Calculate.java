/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forwhile;

import java.util.Scanner;
import jdk.jshell.execution.Util;

/**
 *
 * @author Behruz Tapdiqov
 */
public class Calculate {

    public static double calculate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("a ededini daxil edin");
        double a = sc.nextDouble();
        System.out.println(" b ededini daxil edin");
        double b = sc.nextDouble();
        System.out.println("operatoru daxil edin: 1.+ 2.- 3.* 4./");
        int oper = sc.nextInt();
        double cavab = 0;
        if (oper == 1) {
            cavab = topla(a, b);
        } else if (oper == 2) {
            cavab = cix(a, b);
        } else if (oper == 3) {
            cavab = vur(a, b);
        } else if (oper == 4) {
            cavab = bol(a, b);
        } else {
            System.out.println("operatoru duzgun secin");
        }
        return cavab;
    }

    public static double topla(double a, double b) {
        return a + b;
    }

    public static double cix(double a, double b) {
        return a - b;
    }

    public static double vur(double a, double b) {
        return a * b;
    }

    public static double bol(double a, double b) {
        return a / b;
    }
}
