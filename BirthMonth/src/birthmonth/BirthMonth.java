/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package birthmonth;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class BirthMonth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //declaring the variable
        int birthMonth;
        //assking for input
        System.out.println("What is your birth month number?");
        birthMonth = in.nextInt();
        if ((birthMonth) <= 12)
        {
            if ((birthMonth) >= 1)
            {    
                System.out.println("You said your birth month was " + birthMonth);
            }    
            else
            {
                System.out.println("You enetered an invalid month value: " + birthMonth);
            }    
        }
        else
        {
            System.out.println("You enetered an invalid month value: " + birthMonth);
        }
    }
    
}
