/*Program to calculate bill on the basis of units entered by user
/*Author: Kamaljeet Kaur Date: March 16,2022*/

import java.util.Scanner;
class ComputeBill 
{

    static void Bill(){ 
        long units;
	    Scanner sc=new Scanner(System.in);
        System.out.println("------------------------------------\n");
	    System.out.println("enter number of units");	   
        units=sc.nextLong(); 
        double bill=0; 
        //if units is less than 100
        if(units<=100){
            bill=units*1.20;
        }
        //units less than 300 and more than 100
    	else if(units<=300){
            bill=100*1.20+(units-100)*2;
        }	
        //greater than 300 units
        else if(units>300){
            bill=100*1.20+200 *2+(units-300)*3;
        }		
        else{
            System.out.println("Please enter valid units");
        }
        System.out.println("payable bill is : " + bill); 
    }
        //program driver
        public static void main(String args[]) {   
            while(1){
                Scanner sc=new Scanner(System.in);
                int choice;
                Bill();
                System.out.println("press 1 to continue");
                choice=sc.nextChar(); 
                if(choice==1){
                    Bill();
                }
                else break;
            }

        } 
}