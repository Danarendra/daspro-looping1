import java.util.Scanner;
public class DoWhileLeaveEntitlement19 {
    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int leaveEntitlement, numLeave;
    String confirmation;
    System.out.println("Input the number of Leave Entitlement: ");
    leaveEntitlement = input.nextInt();
    
        do {
            System.out.print("Do you want to take a leave (y/n) ");
            confirmation = input.next();

            if (confirmation.equalsIgnoreCase("y")) {
                System.out.print("How many day(s)? ");
                numLeave = input.nextInt();

                if (numLeave <= leaveEntitlement) {
                    leaveEntitlement -= numLeave;
                    System.out.println("Remaining leave entitlement: "+leaveEntitlement);

                } else {
                    System.out.println("You don't have enough leave entitlement.");
                    break;
                }
            }
        
        }while(leaveEntitlement > 0);
    }
}