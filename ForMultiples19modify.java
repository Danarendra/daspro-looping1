import java.util.Scanner;
public class ForMultiples19modify {
    
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int multiple, sum, counter;
        counter=0;
        sum=0;
        System.out.println("Input the multiple: ");
        multiple = input.nextInt();
        for(int i=2; i <= 100; i++){
            if (i % multiple == 0) {
               sum = sum + i;
               counter++; 
            }
        }System.out.printf("There are %d number that are multiple of %d in range 2 to 100.\n", counter, multiple);
        System.err.printf("The sum of all multiples of %d in range 2 to 100 is %d.\n", multiple, sum);
        
    }
}

