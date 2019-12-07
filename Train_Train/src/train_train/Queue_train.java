
package train_train;


public class Queue_train {
    private int maxsize;
    private int size;
    private Ticket_info head;
    private Ticket_info tail;
    
    Queue_train(){
        this.maxsize=10;
        this.size=0;
        this.head=null;
        this.tail=null;
    }
    
    public void createseat (String date){
        Ticket_info seat = new Ticket_info(date);
        Ticket_info current=head;
        
        if(head==null){
            head=seat;
        }
        else{
            while(current.next!=null){
                current=current.next;
            }
            current.next=seat;
        }
    }
    
    public void display(){
        Ticket_info temp=head;
        
        while(head!=null){
            head.display();
            head=head.next;
        } 
        head=temp;
    }
    
}
