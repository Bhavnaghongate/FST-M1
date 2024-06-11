package Activities;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<String>();
        hs.add("897535");
        hs.add("897536");
        hs.add("897537");
        hs.add("897538");
        hs.add("897539");
        hs.add("897540");
        System.out.println("size of the Hashset=" +hs.size());
        System.out.println("Element removed from Hashset ->"+hs.remove("897540"));
        if(hs.remove("897541")) {
        	System.out.println("897541 removed from the HashSet");
        } else {
        	System.out.println("897541 is not present in the HashSet");
        }
        System.out.println("Hasshet contain 90134 value ->" +hs.contains("90134"));
        
        System.out.println("updated Elements in the Hashset->" +hs);


    }
    
}
