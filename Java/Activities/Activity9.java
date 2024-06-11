package Activities;
	
import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {
        ArrayList <String> names=new ArrayList<String>();
        names.add("alia");
        names.add("john");
        names.add("Eric");
        names.add("Hymer");
        names.add("syren");
       for(String s:names){
        System.out.println("Arraylist names " +s);

       }
       System.out.println("3rd element of the the array is " +names.get(3));
       System.out.println("size of the array list " +names.size());
       System.out.println("Is Eric contain in arralist " +names.contains("Eric"));
       System.out.println("remove element from arraist" +names.remove("syren"));
       System.out.println("size of the arraylist after remves an element "+names.size());

    }
    
}
