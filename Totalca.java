import java.util.Scanner;
class CA
{
    CA(int marks){
        this.marks=marks;
    }
};
class Totalca
{
    public static void main()
    {
        Scanner input=new Scanner(System.in);
        int ca1_marks,ca2_marks,ca3_marks;
        int total;
        System.out.println("enter marks of Ca1\n");
        ca1_marks=input.nextInt();
        System.out.println("enter marks of Ca2\n");
        ca2_marks=input.nextInt();
        System.out.println("enter marks of Ca3\n");
        ca3_marks=input.nextInt();
        CA ca1 = new CA(ca1_marks,ca2_marks,ca3_marks);
        System.out.println(ca1,ca2,ca3);
    }
}
