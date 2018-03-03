import java.util.Scanner;

public class MyNewClass {
    public static void main(String[] args) {

        int [] ourJava = {1,5,3,4,5};
        int iteration = 0;
        for (int value : ourJava){
            if (iteration==ourJava.length-2)
            {
                System.out.print(value+". ");
            }
            else{
                System.out.print(value+", ");
            }
            iteration++;
        }


        System.out.println();
    }
}
