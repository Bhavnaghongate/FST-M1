package Activities;
public class Activity3 {
    public static void main(String[] args)
    {
        Earth E=new Earth();
        E.calculateyearsAllplanet();
       
    }   
}
class Earth{
    public void calculateyearsAllplanet(){
        double seconds=1000000000;
        double EarthSeconds = 31557600;
double MercurySeconds = 0.2408467;
double VenusSeconds = 0.61519726;
double MarsSeconds = 1.8808158;
double JupiterSeconds = 11.862615;
double SaturnSeconds = 29.447498;
double UranusSeconds = 84.016846;
double NeptuneSeconds = 164.79132;

      
System.out.println("Earth age"  +seconds/EarthSeconds
);    
System.out.println("Mercury age "  +seconds/MercurySeconds
                    );
System.out.println("Venus age" +seconds/VenusSeconds
                    );
System.out.println("mars age" +seconds/MarsSeconds
                    );

 System.out.println("jupitor age" +seconds/JupiterSeconds
                    );
 System.out.println("saturn age" +seconds/SaturnSeconds
                    );
System.out.println("uranus age" +seconds/UranusSeconds);

System.out.println("neptune age" +seconds/NeptuneSeconds
                    
                    );            
                    
            

    }
}
