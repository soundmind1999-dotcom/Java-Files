//import java.util.Scanner;
//
//public class PizzaWahala {
//
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//
//       
//        System.out.print("Enter number of people: ");
//        int people = input.nextInt();
//        input.nextLine(); 
//
//      
//        System.out.print("Enter pizza type (Sapa Size, Small Money, Big Boys, Odogwu): ");
//        String pizzaType = input.nextLine().toLowerCase();
//
//        int slicesPerBox = 0;
//        int pricePerBox = 0;
//
//        
//        switch (pizzaType) {
//            case "sapa size":
//                slicesPerBox = 4;
//                pricePerBox = 2000;
//                break;
//
//            case "small money":
//                slicesPerBox = 6;
//                pricePerBox = 2400;
//                break;
//
//            case "big boys":
//                slicesPerBox = 8;
//                pricePerBox = 3000;
//                break;
//
//            case "odogwu":
//                slicesPerBox = 12;
//                pricePerBox = 4200;
//                break;
//
//            default:
//                System.out.println("Invalid pizza type!");
//                return;
//        }
//
//    
//        int boxes = (int) Math.ceil((double) people / slicesPerBox);
//        int totalSlices = boxes * slicesPerBox;
//        int leftover = totalSlices - people;
//        int totalPrice = boxes * pricePerBox;
//
//       
//        System.out.println("\nNumber of boxes of pizza to buy = " + boxes);
//        System.out.println("Number of leftover slices = " + leftover);
//        System.out.println("Total price = ₦" + totalPrice);
//
//        
//    }
//}
//




import java.util.Scanner;

public class PizzaWahala {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of people: ");
        int people = input.nextInt();
        input.nextLine();

        System.out.print("Enter pizza type (Sapa Size, Small Money, Big Boys, Odogwu): ");
        String pizzaType = input.nextLine().toLowerCase();

        int slicesPerBox = 0;
        int pricePerBox = 0;

        if (pizzaType.equals("sapa size")) {
            slicesPerBox = 4;
            pricePerBox = 2000;

        } else if (pizzaType.equals("small money")) {
            slicesPerBox = 6;
            pricePerBox = 2400;

        } else if (pizzaType.equals("big boys")) {
            slicesPerBox = 8;
            pricePerBox = 3000;

        } else if (pizzaType.equals("odogwu")) {
            slicesPerBox = 12;
            pricePerBox = 4200;

        } else {
            System.out.println("Invalid pizza type!");
            return;
        }

        int boxes = (int) Math.ceil((double) people / slicesPerBox);
        int totalSlices = boxes * slicesPerBox;
        int leftover = totalSlices - people;
        int totalPrice = boxes * pricePerBox;

        System.out.println("\nNumber of boxes of pizza to buy = " + boxes);
        System.out.println("Number of leftover slices = " + leftover);
















import java.util.Scanner;

public class PizzaWahala {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of people: ");
        int people = input.nextInt();
        input.nextLine();

        System.out.print("Enter pizza type (Sapa Size, Small Money, Big Boys, Odogwu): ");
        String pizzaType = input.nextLine();

        int slicesPerBox = 0;
        int pricePerBox = 0;

        if (pizzaType.equals("Sapa Size")) {
            slicesPerBox = 4;
            pricePerBox = 2000;

        } else if (pizzaType.equals("Small Money")) {
            slicesPerBox = 6;
            pricePerBox = 2400;

        } else if (pizzaType.equals("Big Boys")) {
            slicesPerBox = 8;
            pricePerBox = 3000;

        } else if (pizzaType.equals("Odogwu")) {
            slicesPerBox = 12;
            pricePerBox = 4200;

        } else {
            System.out.println("Invalid pizza type!");
            return;
        }

        int boxes = people / slicesPerBox;

        if (people % slicesPerBox != 0) {
            boxes = boxes + 1;
        }

        int totalSlices = boxes * slicesPerBox;
        int leftover = totalSlices - people;
        int totalPrice = boxes * pricePerBox;

        System.out.println("Number of boxes of pizza to buy = " + boxes);
        System.out.println("Number of leftover slices = " + leftover);
        System.out.println("Total price = ₦" + totalPrice);
    }
}
        System.out.println("Total price = ₦" + totalPrice);
    }
}
