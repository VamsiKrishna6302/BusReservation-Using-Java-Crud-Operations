import java.util.*;

public class Bus
{
    static TreeSet<Integer> Seat=new TreeSet<Integer>();
    static ArrayList<PersonalDetails> Details=new ArrayList<PersonalDetails>();
    public static void main(String[] args) {
        //boolean vamsi=true;
        for(int i=0;i<=60;i++){
            Seat.add(i);
        }
        Details.add(new PersonalDetails(61,"Krishna","Podalakur",834526100));
        Details.add(new PersonalDetails(62,"Reddy","Thatiparthi",992346100));
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("=========================================================================================");
            System.out.println("1.Reserve the Ticket");
            System.out.println("2.Cancel the Ticket");
            System.out.println("3.Check the Ticket is Booked or Not using seat_number");
            System.out.println("4.Available Tickets");
            System.out.println("5.Update the Ticket");
            System.out.println("6.Booked Tickets");
            System.out.println("7.Exit");
            System.out.print("Enter the choice : ");
            Integer choice =sc.nextInt();
            Collections.sort(Details);
            switch(choice){
                case 1:
                    System.out.print("Enter the ticket which you want to book : ");
                    int seat=sc.nextInt();
                    boolean vamsi=false;
                    for(Integer i:Seat){
                        if(i==seat){
                            vamsi=true;
                        }
                    }
                    if(vamsi){
                        System.out.println("Seat is Available !!");
                        Seat.remove(seat);
                        System.out.print("Enter the name : ");
                        String name=sc.next();
                        System.out.print("Enter the address : ");
                        String address=sc.next();
                        sc.nextLine();
                        System.out.print("Enter the phno : ");
                        Long phno=sc.nextLong();
                        Details.add(new PersonalDetails(seat,name,address,phno));
                        System.out.println("Booked Successfully !!");
                    }else{
                        System.out.println("Please check the number that uou had entered !!!");
                    }
                    System.out.println("=========================================================================================");
                    break;
                case 2:
                    System.out.print("Enter the ticket that you want to Cancel: ");
                    int st=sc.nextInt();
                    boolean found =false;
                    for(PersonalDetails i:Details){
                        if(i.seat_no==st){
                            found=true;
                        }
                    }
                    if(found){
                        Iterator<PersonalDetails> it= Details.iterator();
                        while(it.hasNext()){
                            PersonalDetails pd=it.next();
                            if(pd.getSeat_no()==st){
                                it.remove();
                                Seat.add(st);
                                System.out.println("Ticket Cancelled Successfully !!");
                            }
                        }
                    }else{
                        System.out.println("Please check The Ticket what you had entered !!");
                    }
                    System.out.println("=========================================================================================");
                    break;
                case 3:
                    System.out.print("Enter the ticket to check the status : ");
                    int a=sc.nextInt();
                    boolean j=false;
                    for(Integer i:Seat){
                        if(a==i){
                            j=true;
                        }
                    }
                    if(j){
                        System.out.println("Ticket is not Booked !!");
                    }else if(a<=60){
                        System.out.println("Ticket Booked");
                    }
                    System.out.println("=========================================================================================");
                    break;
                case 4:
                    for(Integer i:Seat){
                        System.out.println(i+" Seat Found");
                    }
                    System.out.println("=========================================================================================");
                    break;
                case 5:
                    System.out.print("Enter the Ticket that you want to update : ");
                    int b=sc.nextInt();
                    boolean k=true;
                    for(Integer i:Seat){
                        if(i==b){
                            k=false;
                        }
                    }
                    if(k){
                        for(PersonalDetails p:Details){
                            if(b==p.getSeat_no()){
                                System.out.print("Enter the seat that you want to take :");
                                int s=sc.nextInt();
                                Seat.add(b);
                                Seat.remove(s);
                                p.setSeat_no(s);
                                System.out.println("Updated Successfully !!! ");
                            }
                        }
                    }
                    else{
                        System.out.println("Ticket Not Booked !!");
                    }
                    System.out.println("=========================================================================================");
                    break;
                case 6:
                    for(PersonalDetails q:Details){
                        System.out.println(q);
                    }
                    System.out.println("=========================================================================================");
                    break;
                case 7:
                    System.out.println("Thanks for Visiting !!");
                    System.out.println("=========================================================================================");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please check the choice that you had entered");
                    System.out.println("Thanks for Visiting !!");
                    System.out.println("=========================================================================================");
                    System.exit(0);
                    break;
            }
        }
    }
}
