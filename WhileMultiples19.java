import java.util.Scanner;
public class WhileMultiples19 {

    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int multiple, sum, counter, i;
        counter = 0;
        sum = 0;
        i = 1;

        System.out.println("Input the multiple: ");
        multiple = input.nextInt();

        while (i <= 50) {
            if (i % multiple == 0) {
                sum += i;
                counter++;
            }
            i++;
        }

        System.out.printf("There are %d numbers that are multiples of %d in the range 1 to 50.\n", counter, multiple);
        System.out.printf("The sum of all multiples of %d in the range 1 to 50 is %d.\n", multiple, sum);

        input.close();
    }
}
    
