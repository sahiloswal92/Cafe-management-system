import java.util.*;

class Cafe {

    Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){
        Cafe cafe = new Cafe();

        int ch=1;

        while(ch!=5){
            System.out.println(" \n WELECOME TO OUR CAFE");
            System.out.println("***** MENU *****");
            System.out.println("1. Pizza");
            System.out.println("2. Burger");
            System.out.println("3. French Fries");
            System.out.println("4. Coffee");
            System.out.println("5. Cold Drink");
            System.out.println("ENTER WHAT YOU WOULD LIKE TO HAVE::");

            ch = cafe.scanner.nextInt();

            switch(ch)
            {
                case 1:
                    System.out.println("Which Pizza???\n");
                    System.out.println("a. Paneer Pizza\n b. Chiken Pizza\n c. Mashroom Pizza\n");
                    switch(ch)
                    {
                        case 1:
                        System.out.println("a. Paneer Pizza\n ");
                        break;
                        case 2:
                        System.out.println(" Chiken pizza");
                        break;
                        case 3:
                        System.out.println("mashroom pizza");
                        break;
                        default:
                        System.out.println(" u have entered invalid optio");
                    }
                    break;

                case 2:
                    System.out.println("a. Jumbo Burger\n b. Mini Burger\n c. Veggie Burger\n");
                    break;

                case 3:
                    System.out.println("a. Simple salted Fries\n b. periperi fries\n");

                case 4:
                    System.out.println("a. Cold Coffee\n b. Hot Coffee\n");
                    break;

                case 5:
                    System.out.println("a. Pepsi\n b. Maza\n c. Coke\n");
                    break;

                default :  // ayan nallah
                    System.out.println("ENTERED CHOICE IS INVALID");
                    break;
            }
        }
    }
}