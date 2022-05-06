import java.util.*;
public class Map{
    public static void main(String[] args){
        Map map=new HashMap();
        //adding elements to map
        map.put(1,"Kamal");
        map.put(3,"Param");
        map.put(4,"Aman");
        //Traversing
        Set set=map.entrySet(); //converting the set
        Iterator itr=set.iterator();
        while(itr.hasNext()){
            //converting map.entry so that we can get key and value
            Map.Entry entry=(Map.Entry)itr.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}