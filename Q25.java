import java.util.*;
class node
{
    static Scanner sc = new Scanner(System.in);
    int data;
    node link;
    node()
    {
        data=0;
        link=null;
    }

    void create()
    {
        node start = this;
        node ptr = this;
        System.out.println("enter the number of node");
        int n = sc.nextInt();
        int count = 1;
        while(count<n)
        {
            node temp = new node();
            System.out.println("enter the data ");
            temp.data = sc.nextInt();
            temp.link=null;
            ptr.link = temp;
            ptr = ptr.link;
            count = count+1;
            temp=null;
        }
        ptr = null;
    }

    void insert_at_begining(int n)
    {
        node ptr=this;
        node temp = new node();
        temp.link = null;
        temp.data = n;
        temp.link = ptr.link;
        ptr.link = temp;       
    }

     void delete_at_begining()
    {
        node ptr=this;
        if(ptr.link!=null)
        {node target = ptr .link;
            ptr.link = target.link;
            System.out.println("The element deleted is "+target.data);
        }
    }

    void insert_at_index(int n, int d)
    {
        node ptr=this;
        int count =0;
        while(count<n-1)
        {
            ptr = ptr.link;
            count++;
        }
        node temp = new node();
        temp.link = null;
        temp.data = d;
        temp.link = ptr.link;
        ptr.link = temp;
    }

    void delete_at_key(int n)
    {
        node ptr = this;
        boolean flag = false;
        while(ptr.link != null)
        {

            if((ptr.link).data == n)
            {
                node target = ptr.link;
                ptr.link = target.link;                
                target.link=null;
                flag = true;
                break;
            }
            else 

                ptr = ptr.link;

        }
        if(flag == true)

            System.out.println("the node was deleted");
        else
            System.out.println("a node with the data "+n+" was not found");
    }

    void reverse()
    {
        node ptr = this;
        ptr=ptr.link;
        node prev = null;
        node temp = new node();
        while(ptr.link != null)
        {
            temp = ptr.link;
            ptr.link = prev;
            prev = ptr;
            ptr = temp;
        }
        ptr.link = prev;
        this.link =ptr;
    }

    void display()
    {
        node ptr= this;
        ptr = ptr.link;
        while(ptr != null)
        {
            System.out.print(ptr.data+" --> ");
            ptr=ptr.link;
        }
        System.out.println();
    }

    public static void main()
    {
        node head = new node(); 
        head.create();
        while (true)
        {
            System.out.println(" Enter 1 to insert at the begining of the list \n Enter 2 to delete from the begining of the list \n Enter 3 to insertion based on index");
            System.out.println(" Enter 4 to delete based on key \n Enter 5 to reverse \n enter 6 to display the list \n Enter 7 to exit the program");        
            int c = sc.nextInt();
            switch(c)
            {
                case 1:
                    System.out.println("Enter the data to be inserted at the begining");
                    int d1 = sc.nextInt();
                    head.insert_at_begining(d1);
                    break;
                case 2:
                    head.delete_at_begining();
                    break;
                case 3:
                    System.out.println("Enter the index which at which data is to be inserted");
                    int i1=sc.nextInt();
                    System.out.println("Enter the data to be inserted at the begining");
                    int d2 = sc.nextInt();
                    head.insert_at_index(i1,d2);
                    break;
                case 4:

                    System.out.println("Enter the data at which node is to be deleted");
                    int i2=sc.nextInt();    
                    head.delete_at_key(i2);
                    break;

                case 5:
                    head.reverse();
                    break;

                case 6:
                    head.display();
                    break;
                case 7:
                    System.out.println("You have exited the System");
                    System.exit(0);
            }
        }
    }

}
