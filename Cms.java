//Business logic layer


// Presentation Layer
class Cms
{
    public static void displayAll()
    {
        System.out.println("let's display all records!!!");
    }

    public static void updateRecord(String name, int age, long mob){
        System.out.println("let's update the record!!!");
    }

    public static void deleteRecord(String name, int age, long mob){
        System.out.println("let's update the record!!!");
    }

    public static void addRecord(String name, int age, long mob){
        System.out.println("let's update the record!!!");
    }



    public static void main(String[] args)
    {
        System.out.println("Hi Welcome to the CMS...");
        System.out.println("Press option accordingly \n 1 to display all record s\n 2. to add student\n 3. to update the student\n 4. to delete record \n 5. to exit\n");
        displayAll();
    }
}