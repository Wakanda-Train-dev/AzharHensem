
package train_train;

import java.util.Scanner;

public class Train_Train {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        Queue_train jan1 =new Queue_train();
        Queue_train jan2 =new Queue_train();
        Queue_train jan3 =new Queue_train();
        Queue_train jan4 =new Queue_train();
        Queue_train jan5 =new Queue_train();
        Queue_train jan6 =new Queue_train();
        Queue_train jan7 =new Queue_train();
        
        System.out.println("HELLO WELCOME");
        System.out.println("PLEASE CHOOSE YOUR DATE");
        
        String a = "1) 1 January 2019\n";
        a+="2) 2 January 2019\n";
        a+="3) 3 January 2019\n";
        a+="4) 4 January 2019\n";
        a+="5) 5 January 2019\n";
        a+="6) 6 January 2019\n";
        a+="7) 7 January 2019\n";
        a+="your selection: ";
        
        System.out.print(a);
        int date=sc.nextInt();
        
        while(date>7){
            System.out.print(a);
            date=sc.nextInt();
        }
            switch(date){
                case 1:jan1.createseat("1 January 2019");
                        break;
                case 2:jan2.createseat("2 January 2019");
                        break;
                case 3:jan3.createseat("3 January 2019");
                        break;
                case 4:jan4.createseat("4 January 2019");
                        break;
                case 5:jan5.createseat("5 January 2019");
                        break;
                case 6:jan6.createseat("6 January 2019");
                        break;
                case 7:jan7.createseat("7 January 2019");
                        break;
            }
            System.out.println("1");
            jan1.display();
            System.out.println("2");
            jan2.display();
            System.out.println("3");
            jan3.display();
            System.out.println("4");
            jan4.display();
            System.out.println("5");
            jan5.display();
            System.out.println("6");
            jan6.display();
            System.out.println("7");
            jan7.display();
            
            
    }
    
}
