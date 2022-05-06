import java.util.Scanner;
class Arrayclass
{
    public static void main(String args[])
    {
        // int [] numarray= new int[]

        int i,index;
        int selement, element;
        Scanner input=new Scanner(System.in);
        System.out.println("enter the length of array")
        n=input.nextInt();
        int[] numarray=new int[n];
        System.out.println("enter array elements");
        for(i=0; i< numarray.length; i++){
            numarray[i]=input.nextInt();
        }
        System.out.println("elements are entered in array");
        // for(i=0; i<numarray.length; i++){
        //     System.out.println("the "+ i +"th element: "+numarray[i]);
        // }
        //search
        System.out.println("------------------------------------------\n");
        System.out.println("Enter the element you want to search\n");
        selement=input.nextInt();
        for(i=0; i<numarray.length; i++){
            if(numarray[i]==selement){
                System.out.println("the "+ numarray[i] +" element is on "+i+"th index\n");
            }
        }

        //insert
        System.out.println("------------------------------------------");
        System.out.println("enter the position on which u want to insert element\n");
        index=input.nextInt();
        System.out.println("enter the element\n");
        element=input.nextInt();
        numarray.length+=1;
        // for (int i=n; i>=index-1; i--){
        //     numarray[i]=numarray[i-1];
        // }
        // numarray[index-1]=element;
        // for (i=0; i<numarray.length; i++){
        //     System.out.println(numarray[i]+"\t");
        // }
        System.out.println("element is inserted\n");
        //delete
        System.out.println("------------------------------------------");
        System.out.println("enter the position on which u want to delete element\n");
        index=input.nextInt();
        for (i=index; i<numarray.length-1; i++){
            numarray[i]=numarray[i+1];
        }
        System.out.println("element is deleted\n");
        System.out.println("new array is : \n");
        for(i=0; i<numarray.length-1; i++){
            System.out.println(numarray[i]+"\t");
        }
    }
}
