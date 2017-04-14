/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author sh
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws InputMismatchException {

        boolean bError = true;
        int cases = 0;
        Scanner sc = new Scanner(System.in);
         
        try {

            System.out.println("Enter a no of person");
          
            cases = sc.nextInt();
            bError = false;
        } catch (InputMismatchException e) {
            System.out.print("Invalid number of person in number format. ");
            sc.next();
        }

        int seatNo = 0;
        int mod = 0;

        int num;
          
        for (int i = 0; i < cases; i++) {
             try {
                    
                     System.out.println("Enter a seat no");
             seatNo = sc.nextInt();

                    bError = false;

                } catch (InputMismatchException e) {

                    System.out.print("Invalid number of seat no in number format. ");
                    sc.next();
                }
          
            if(seatNo>1 && seatNo<=108){
                 
               
            
            
            
    
            mod = seatNo % 12;

            switch (mod) {
                case 1:
                    num = (mod == 1 && seatNo != 1) ? (seatNo + 11) : 12;
                    System.out.println(num + " " + "WS");
                    break;
                case 6:
                    num = (mod == 6 && seatNo != 6) ? (seatNo + 1) : 7;
                    System.out.println(num + " " + "WS");
                    break;
                case 7:
                    num = (mod == 7 && seatNo != 7) ? (seatNo - 1) : 6;
                    System.out.println(num + " " + "WS");
                    break;
                case 0:
                    num = (mod == 0 && seatNo != 12) ? (seatNo - 11) : 1;
                    System.out.println(num + " " + "WS");
                    break;
                case 2:
                    num = (mod == 2 && seatNo != 2) ? (seatNo + 9) : 11;
                    System.out.println(num + " " + "MS");
                    break;
                case 5:
                    num = (mod == 5 && seatNo != 5) ? (seatNo + 3) : 8;
                    System.out.println(num + " " + "MS");
                    break;
                case 8:
                    num = (mod == 8 && seatNo != 8) ? (seatNo - 3) : 5;
                    System.out.println(num + " " + "MS");
                    break;
                case 11:
                    num = (mod == 11 && seatNo != 11) ? (seatNo - 9) : 2;
                    System.out.println(num + " " + "MS");
                    break;
                case 3:
                    num = (mod == 3 && seatNo != 3) ? (seatNo + 7) : 10;
                    System.out.println(num + " " + "AS");
                    break;
                case 4:
                    num = (mod == 4 && seatNo != 4) ? (seatNo + 5) : 9;
                    System.out.println(num + " " + "AS");
                    break;
                case 9:
                    num = (mod == 9 && seatNo != 9) ? (seatNo - 5) : 4;
                    System.out.println(num + " " + "AS");
                    break;
                case 10:
                    num = (mod == 10 && seatNo != 10) ? (seatNo - 7) : 3;
                    System.out.println(num + " " + "AS");
                    break;
                default:
                    System.out.println("oops!! again enter");
                    break;
            }
            }else{
                System.out.println("not in range:seats are available upto 108");
            }
        }
}

}  
