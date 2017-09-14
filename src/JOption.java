/**
 * Author: Shea Salloum
 * Date: 09/14/17
 * License:GNU
 * Purpose: Display a dialogue box
 */

import java.util.Scanner;
import javax.swing.*;
public class JOption {
    public static void main(String []args){
        Scanner keyboard = new Scanner(System.in);// sets a value for scanner
        System.out.println("Enter boolean value");
        boolean Boo = keyboard.nextBoolean();// allows for input of a boolean value


        System.out.println("Enter a character");
        char Ch = keyboard.next().charAt(0);

        System.out.println("Enter a byte value");
        byte by = keyboard.nextByte();

        System.out.println("Enter a short value");
        short sh =keyboard.nextShort();

        System.out.println("Enter a Int value");
        int I = keyboard.nextInt();

        System.out.println("Enter a long value");
        long L = keyboard.nextLong();

        System.out.println("Enter a float value");
        float F = keyboard.nextFloat();

        System.out.println("Enter a double value");
        double D = keyboard.nextDouble();

        JOptionPane.showMessageDialog(null, "your boolean value is " + Boo + "\n" + "Your charchater is " +
                Ch + "\n" + "your byte value is " + by + "\n"+ "your short value is " + sh + "\n" + "your int value is " + I + "\n" +
                "your long value is "+ L +"\n"+ "your float value is " + F + "\n" +  "your double value is " + D);// creates the
        //dialogue box and displays all values on separate lines


    }
}




