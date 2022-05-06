class Calc
{
    private double sal;
    void setData(int double)
    {
        sal=salary;
    }
    // 2.5 - 5= 5% , >5 = 20%, >7 = 30%
    double taxCalculate(double salary)
    {
        double tax;
        if(salary>=250000 && salary<=500000){
            tax=salary*0.05
        }
        else if(salary>500000 && salary<=700000){
            tax=salary*0.2
        }
        else{
            tax=salry*0.3
        }
        return tax;
    }
}
class Taxcalc
{
    public static void main()
    {
        double salary;
        Calc c=new Calc();
        System.out.println("enter the salary");
        Scanner input=new Scanner(System.in);
        salary=input.nextInt();
        c.setData(salary);
        double tax=c.taxCalculate(salary)
        System.out.println("tax calculated is : "+tax)
}
