package com.company;
/* մուտք անել հեռախոսահամար և ստուգել, որ իսկապես կարող է հեռախոսահամար լինել
(օրինակ, +37411333333 - այո, +374234543 - ոչ) */

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        //որպեսզի շատ երկար չլինի, կոդերի մի մասը չներառեցի
        String[] codes = {"37410", "37460", "37499", "37494", "37455", "37497"};
        System.out.print("Մուտքագրեք հեռախոսահամարը հետևյալ ձևաչափով՝ +374XXXXXXXX \n--> ");

        Scanner kboard = new Scanner(System.in);
        String str = kboard.next();

        boolean finish = true;
        String substring;
        String value1;

        for (String value : codes){
            value1 = value.intern();
            substring = str.substring(1, 6).intern();
            if (value1 == substring && str.length() == 12) {
                System.out.println("Այո");
                finish = false;
                break;
            }
        }
        if (finish==true) {
            System.out.println("Ոչ");
        }
    }

}


