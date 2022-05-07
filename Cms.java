//Business logic layer
class Methods{
    public static void kk(){
        System.out.println("Hi this is another method for business logic layer@@@\n");
    }

    public static void displayAll()
    {
        System.out.println("let's display all records!!!");
    }

    public static void updateRecord(String name, int age, String mob){
        System.out.println("let's update the record!!!");
    }

    public static void deleteRecord(String name, int age, String mob){
        System.out.println("let's delete the record!!!");
    }

    public static void addRecord(long id, String name, int age, String mob){
        System.out.println("let's add the record!!!");
    }


}

// Presentation Layer
class Cms
{
    

    public static void main(String[] args)
    {
        System.out.println("Hi Welcome to the CMS...");
        System.out.println("Press option accordingly \n 1 to display all record s\n 2. to add student\n 3. to update the student\n 4. to delete record \n 5. to exit\n");
        Methods m= new Methods();
        m.kk();
        m.displayAll();
        m.updateRecord("KK",23,"9991307072");
        m.deleteRecord("KK",23,"9991307072");
        m.addRecord(1234,"KK",23,"9991307072");
    }
}