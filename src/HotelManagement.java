import java.util.Scanner;

public class HotelManagement {
    static final int ROOMS = 5;
    static final int FLOOR = 5;


    //Creating rooms
    static boolean[][] rooms = new boolean[FLOOR][ROOMS];

    //Checking availability
    static void checkAvailability() {
        System.out.println("A-Available rooms\nX-Unavailable rooms");
        for (int floor = 0; floor < FLOOR; floor++) {
            for (int room = 0; room < ROOMS; room++) {
                if (rooms[floor][room]) {
                    System.out.print("X ");
                } else {
                    System.out.print("A ");
                }
            }
            System.out.println();
        }

    }

    //Booking a room
    static void BookRoom(Scanner sc) {

        System.out.println("Enter Floor number: ");
        int floor = sc.nextInt();

        System.out.println("Enter Room number: ");
        int room = sc.nextInt();
        if (floor > FLOOR - 1 || room > ROOMS - 1) {
            System.out.println("Please enter valid numbers");
        } else if (!rooms[floor][room]) {
            rooms[floor][room] = true;
            System.out.println("Room booked on the floor " + floor + " and the room number is " + room);
        } else {
            System.out.println("Room isn't available");
        }
        sc.nextLine();

    }
    //Implementing checkout function--

    static void Checkout(Scanner sc) {
        System.out.println("Enter Floor number: ");
        int floor = sc.nextInt();

        System.out.println("Enter Room number: ");
        int room = sc.nextInt();

        if (floor > FLOOR - 1 || room > ROOMS - 1) {
            System.out.println("Please enter valid numbers");
        } else if (rooms[floor][room]) {
            rooms[floor][room] = false;
            System.out.println("Checkout Successful");
        } else {
            System.out.print("Room wasn't booked on the floor " + floor + " with room number " + room);

        }
        sc.nextLine();

    }

    //Check-in method
    static void Checkin(Scanner sc) {
        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Your ID number: ");
        String ID = sc.nextLine();

        System.out.println("Enter Floor number: ");
        int floor = sc.nextInt();
        sc.nextLine();


        System.out.println("Enter Room number: ");
        int room = sc.nextInt();
        sc.nextLine();

        if (floor > FLOOR - 1 || room > ROOMS - 1) {
            System.out.println("Please enter valid numbers");
        } else if (rooms[floor][room]) {
            System.out.println("Welcome " + name + ", check-in successful at Floor " + floor + ", Room " + room);
        } else {
            System.out.println("Room not booked yet. Please book a room first.");
        }


    }

    static void ShowMenu() {
        System.out.println("\n==== Hotel booking Menu==== \n");
        System.out.println("1. Check availability");
        System.out.println("2. Book Room");

        System.out.println("3. Checkin Room");
        System.out.println("4. Checkout Room");

        System.out.println("5. Payments");
        System.out.println("6. Exit\n");
        System.out.print("Enter Choice: ");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int option;

        do {
            ShowMenu();
            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    checkAvailability();
                    break;

                case 2:
                    BookRoom(sc);
                    break;

                case 3:
                    Checkin(sc);
                    break;

                case 4:
                    Checkout(sc);
                    break;

                case 5:
                    System.out.println("Please Choose the payment method:\n1. UPI\n2. Cash\n3. Debit Card\n");
                    int payment = sc.nextInt();
                    sc.nextLine();
                    switch (payment) {
                        case 1:

                            System.out.println("ROOM RENT - 8000$\nGST + UPI CHARGES - 124$\nYour Total bill = " + (8000 + 124) + "$");
                            System.out.println("Thanks for staying...");


                            break;

                        case 2:
                            System.out.println("ROOM RENT - 8000$\nGST - 122$\nYour Total bill = " + (8000 + 122) + "$");
                            System.out.println("Thanks for staying...");

                            break;


                        case 3:
                            System.out.println("ROOM RENT - 8000$\nGST + Card Charges - 252$\nYour Total bill = " + (8000 + 252) + "$");
                            System.out.println("Thanks for staying...");


                            break;


                        default:
                            System.out.println("Invalid choice");
                            break;

                    }
                    break;

                case 6:
                    break;
                default:
                    System.out.println("Invalid choice");
            }

        } while (option != 6);
        sc.close();

    }
}

