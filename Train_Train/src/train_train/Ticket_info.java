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
public class Ticket_info {
    Scanner sc = new Scanner(System.in);
    public String name;
    public int ticketNum;
    public int ICnumber;
    public String date;
    public String Destination="Johor Bharu";
    public String From="KL";
    public String Num;
    public int seat;
    Ticket_info next;
    
    Ticket_info(){
        this.name=null;
        this.ticketNum=0;
        this.Destination=Destination;
        this.From=From;
        this.Num=null;
        this.seat=0;
    }
    
    Ticket_info(String in_date){
        System.out.println("INPUT NAME");
        this.name=sc.nextLine();
        this.ticketNum=createticketNum();
        System.out.println("INPUT IC NUMBER");
        this.ICnumber=sc.nextInt();
        this.date=date;
        this.Destination=Destination;
        this.From=From;
        this.Num=sc.nextLine();
        this.seat=seat;   
    }

    public String getName() {
        return name;
    }

    public int getICnumber() {
        return ICnumber;
    }

    public String getNo() {
        return Num;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setICnumber(int ICnumber) {
        this.ICnumber = ICnumber;
    }

    public void setNo(String No) {
        this.Num = No;
    }
    
    
    
    public int createticketNum(){
        ticketNum++;
        return ticketNum;
    }
             
    public void display(){
        String A = "name: "+name+"\n";
        A+="Ticket Number: "+ticketNum+"\n";
        A+="IC: "+ICnumber+"\n";
        A+="Date "+date+"\n";
        A+="Destination: "+Destination+"\n";
        A+="From: "+From+"\n";
        A+="NumberPhone "+Num+"\n";
        A+="Seat: "+seat+"\n";
        System.out.println(A);
          
    }
    
}
