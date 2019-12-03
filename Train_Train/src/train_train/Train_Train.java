
package train_train;

import java.util.Scanner;

public class Train_Train {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Ticket_information p1 = new Ticket_information(sc.nextLine(),sc.nextInt());
        p1.display();
    }
    
}
