class Student
{
int fee=20000;

    synchronized void admit(int fee)
    {
        System.out.println("Amount paid by you is");
        System.out.println(fee);
        if(this.fee>fee){
            System.out.println("You are not eligible to take the course");
            try{wait();}catch(Exception e){}
        }
        // this.fee-=fee;
        System.out.println("you are eligible for this course");
    }

    synchronized void deposit(int fee)
    {
        System.out.println("Please enter the fee amount you have deposited");
        this.fee=fee;
        System.out.println("deposit completed... ");
        notify();
    }
}

class Admit{
public static void main(String args[])
    {
        final Student s=new Student();
        new Thread(){
        public void run(){s.deposit(10000);}
        }.start();
        new Thread(){
        public void run(){s.admit(1000);}
        }.start();
        

    }
}