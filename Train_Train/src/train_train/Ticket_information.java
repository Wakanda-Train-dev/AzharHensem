/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package train_train;

import java.util.Scanner;

/**
 *
 * @author Aiman
 */
public class Ticket_information {
    Scanner sc = new Scanner(System.in);
    public String name;
    public int TicNo=0;
    public int ICnumber;
    public String Date;
    public String Destination="Johor Bharu";
    public String From="KL";
    public String No;
    public int seat;
    
    Ticket_information(){
        this.name=null;
        this.TicNo=0;
        this.Date=null;
        this.Destination=Destination;
        this.From=From;
        this.No=null;
        this.seat=0;
    }
    
    Ticket_information(String name,int ICnumber){
        this.name=name;
        this.TicNo=createTicNo();
        this.ICnumber=ICnumber;
        this.Date= chooseDate();
        this.Destination=Destination;
        this.From=From;
        this.No=mintakno();
        this.seat= seatAdjust();
        
        
    }
    
    public int createTicNo(){
        TicNo++;
        return TicNo;
    }
    
    public String chooseDate(){
        System.out.print("Enter your Date: ");
        String receive = sc.nextLine();
        //if(1-7)
        return receive;
    }
    
    public String mintakno(){
        System.out.println("Give me your number!!!");
        String number= sc.next();
        return number;
    }
    
    public int seatAdjust(){
        int C = 4;
        return C;
    }
    
    public void display(){
        String A = "name: "+name+"\n";
        A+="Ticket Number: "+TicNo+"\n";
        A+="IC: "+ICnumber+"\n";
        A+="Date "+Date+"\n";
        A+="Destination: "+Destination+"\n";
        A+="From: "+From+"\n";
        A+="NumberPhone "+No+"\n";
        A+="Seat: "+seat+"\n";
        System.out.println(A);
          
    }
    
}
