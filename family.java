import java.util.Scanner;
class ageArrayx
{
    public static void main(String args[])
    {
        // int [] numarray= new int[]
        int[] numarray=new int[5];
        int i;
        Scanner input=new Scanner(System.in);
        System.out.println("enter the age of the elements");
        for(i=0; i< numarray.length; i++){
            numarray[i]=input.nextInt();
        }
        system.out.println("elements are entered in array")
        for(i=0; i<numarray.length; i++){
            System.out.println("the "+ i +"th element: "+numarray[i]);
        }
    }
}
