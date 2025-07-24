import java.util.Scanner;


public class HotelManagement{
    //room booking method--


     public static void roomBook(int[][] rooms,int floor, int room){
            if (rooms[floor][room] == 1) {
        System.out.println("\nRoom is already booked on floor " + floor + ", room number " + room + ".");
    }     
    
        else {
           rooms[floor][room] = 1; 
           System.out.println("\nRoom booked successfully on floor " + floor + ", room number " + room + ".");
    }
    
        }
       
    //Check availability
    public static void availability(int[][] rooms, int floor, int room){
        if(rooms[floor][room]==0){
            System.out.println("\nRoom available.");
        }
        else{
            System.out.println("\nRoom not available.");
        }
    }


    //Checkout Method
    public static int checkout(int[][] rooms, int floor, int room){
        if(rooms[floor][room]==1){
            System.out.println("\nCheckout successful. ");
            rooms[floor][room]=0;
        }
        else{
            System.out.println("\nRoom wasn't occupied. ");
            return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        System.out.println("\nWelcome to the Hotel Management System\n\nWe serve our customer using this simple app\n\nWe have 3 Floors with floor number[0-1-2] and a total of 12 rooms with room number [0-1-2-3]\nThanks for using our services.\n");


        Scanner sc = new Scanner(System.in);


        //2-D array for floor and rooms
        //Creating an initially empty array using a for loop.


        int[][] rooms = new int[3][4];
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                rooms[i][j] = 0;
            }
        }
        int option = 0;
       
        do{
            //Asking inputs from user for room-booking
        System.out.println("\nChoose an option:\n1. Room Booking\n2. Check availability\n3. Checkout\n4. Payments\n5. Quit\n");
       
        option = sc.nextInt();
       
       
        switch (option) {
            case 1:
                  System.out.print("Please Enter the floor number for room Booking [0-1-2]: ");
                  int floor = sc.nextInt();
                  System.out.print("Please Enter the room number for room Booking [0-1-2-3]: ");
                  int roomNumber = sc.nextInt();
                  roomBook(rooms, floor, roomNumber);
                break;
               
            case 2:
                  System.out.print("Please Enter the floor number for checking the availability: ");
                  floor = sc.nextInt();
                  System.out.print("Please Enter the room number for checking the availability: ");
                  roomNumber = sc.nextInt();
                  availability(rooms, floor, roomNumber);
                break;
            case 3:
                  System.out.println("Please Enter the floor number for checkout: ");
                  floor = sc.nextInt();
                  System.out.println("Please Enter the room number for checkout: ");
                  roomNumber = sc.nextInt();
                  checkout(rooms, floor, roomNumber);
                  break;


            case 4:
                  System.out.println("Please Choose the payment method:\n1. UPI\n2. Cash\n3. Debit Card\n");
                  int payment = sc.nextInt();
                  switch (payment) {
                    case 1:
                       
                        System.out.println("ROOM RENT - 8000$\nGST + UPI CHARGES - 352$\nYour Total bill = " + (8000+352));
                        System.out.println("Thanks for staying...");


                        option = 5;
                        break;


                    case 2:
                        System.out.println("ROOM RENT - 8000$\nGST - 122$\nYour Total bill = " + (8000+122));
                        System.out.println("Thanks for staying...");
                        option = 5;
                        break;


                    case 3:
                        System.out.println("ROOM RENT - 8000$\nGST + Card Charges - 252$\nYour Total bill = " + (8000+252));
                        System.out.println("Thanks for staying...");
                        option = 5;




                        break;


                 
                    default:
                        break;
                  }
                  break;
                case 5:
                  System.out.println("Sorry to see you go...");
       
            default:
                break;
        }
        }while(option!=5);
       


    }}
