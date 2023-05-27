import java.util.Scanner;
public class LinearQueueExample {


	  int queue[],front,rear,MaxSize,count;
	  void createQueue(int size)
	  {
	      MaxSize=size;
	      front=0;
	      rear=-1;
	      queue=new int[MaxSize];
	      count = 0;
	  }
	  void enqueue(int e)
	  {
	      rear = (rear+1)%MaxSize;
	      queue[rear]=e;
	      count++;
	  }
	  boolean isfull()
	  {
	      if(count==MaxSize)
	          return true;
	      else
	          return false;
	  }
	  int dequeue()
	  {
	      int t=queue[front];
	      front=(front+1)%MaxSize;
	      count--;
	      return(t);
	      
	  }
	   boolean isempty()
	  {
	      if(count==0)
	          return true;
	      else
	          return false;
	  }
	   
	   void printqueue()
	   {
	       int i = front;
	       int c = 0 ;
	       System.out.println("count is "+count);
	      
	       while(c<count)
	       {
	    	   System.out.print(queue[i]+"-");
	    	   i = (i+1) %MaxSize;
	    	   c++;
	       }
	   }
	   
	   public static void main(String args[])
	 {
	     int size,e,ch;
	     LinearQueueExample obj=new LinearQueueExample();
	     Scanner in=new Scanner(System.in);
	     System.out.println("Enter size of Queue:");
	     size=in.nextInt();
	     obj.createQueue(size);
	     do
	     {
	         System.out.println("\n1.Enqueue\n2.Dequeue\n3.Print\n0.Exit\n:");
	         ch=in.nextInt();
	         switch(ch)
	         {
	             case 1:
	                 if(obj.isfull()==false)//not full
	                 {
	                     System.out.println("Enter a number:");
	                     e=in.nextInt();
	                     obj.enqueue(e);
	                 }
	                 else
	                     System.out.println("Queue is Full");
	                 break;
	             case 2:
	                    if(obj.isempty()==false)//not empty
	                    {
	                        System.out.println("Dequeued:"+obj.dequeue());
	                        
	                    }
	                    else
	                        System.out.println("Queue is Empty");
	                    break;
	             case 3:
	                 if(obj.isempty()==false)//not empty
	                 {
	                     System.out.println("Queue has:");
	                     obj.printqueue();
	                     
	                     
	                 }
	                 else
	                     System.out.println("Queue is Empty");
	                 break;  
	                
	             case 0:
	                     System.out.println("Exiting code.");
	                     break;
	             default:
	                 System.out.println("Wrong Input");
	                 break;
	            }
	         }while(ch!=0);
	   }
}
