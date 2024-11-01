import java.util.Scanner;
public class DisplayTwo19Modify {
    
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int numInput;
        System.out.println("Input some number: ");
        numInput = input.nextInt();
        
        for(int i = 2; i <= numInput; i += 2) {
            System.out.println("2 multiple: " + i);
        }
    }
}
    

