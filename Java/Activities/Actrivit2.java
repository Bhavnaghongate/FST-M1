package Activities;

public class Actrivit2 {
    public static void main(String[] args) {
        int a[]=new int[6];
        a[0]=10;
        a[1]=77;
        a[2]=10;
        a[3]=56;
        a[4]=-11;
        a[5]=10;
        
       for(int i=0;i<a.length;i++)//length is the property of array  
System.out.println(a[i]);  
//Set constants
int searchNum = 10;
int fixedSum = 30;

//Print result
System.out.println("Result: " + result(a ,searchNum, fixedSum));
}
public static boolean result(int[] numbers, int searchNum, int fixedSum) {
    int temp_sum = 0;
    //Loop through array
    for (int number : numbers) {
        //If value is 10
        if (number == searchNum) {
            //Add them
            temp_sum += searchNum;
        }

        //Sum should not be more than 30
        if (temp_sum > fixedSum) {
            break;
        }
    }

    //Return true if condition satisfies
    return temp_sum == fixedSum;
}

     }
    

