import java.util.Scanner;

public class Nokia3310Menu {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int mainOption;

        do {
            System.out.println("\n===== NOKIA 3310 MAIN MENU =====");
            System.out.println("1. Phonebook");
            System.out.println("2. Messages");
            System.out.println("3. Chat");
            System.out.println("4. Call Register");
            System.out.println("5. Tones");
            System.out.println("6. Settings");
            System.out.println("7. Call Divert");
            System.out.println("8. Games");
            System.out.println("9. Calculator");
            System.out.println("10. Reminders");
            System.out.println("11. Clock");
            System.out.println("12. Profiles");
            System.out.println("13. SIM Services");
            System.out.println("0. Exit");

            System.out.print("\nEnter your choice: ");
            mainOption = input.nextInt();

            switch (mainOption) {

                case 1 -> phonebookMenu(input);
                case 2 -> messagesMenu(input);
                case 3 -> System.out.println("Chat selected.");
                case 4 -> callRegisterMenu(input);
                case 5 -> tonesMenu();
                case 6 -> settingsMenu(input);
                case 7 -> System.out.println("Call Divert selected.");
                case 8 -> System.out.println("Games selected.");
                case 9 -> System.out.println("Calculator selected.");
                case 10 -> System.out.println("Reminders selected.");
                case 11 -> clockMenu();
                case 12 -> System.out.println("Profiles selected.");
                case 13 -> System.out.println("SIM Services selected.");
                case 0 -> System.out.println("Exiting program. Goodbye!");
                default -> System.out.println("Invalid option! Try again.");
            }

        } while (mainOption != 0);

        input.close();
    }

    // ==================== PHONEBOOK MENU ====================
    public static void phonebookMenu(Scanner input) {
        int option = -1;
        do {
            System.out.println("\n--- PHONEBOOK ---");
            System.out.println("1. Search");
            System.out.println("2. Service Nos.");
            System.out.println("3. Add Name");
            System.out.println("4. Erase");
            System.out.println("5. Edit");
            System.out.println("6. Assign Tone");
            System.out.println("7. Send b’card");
            System.out.println("8. Options");
            System.out.println("9. Speed Dials");
            System.out.println("10. Voice Tags");
            System.out.println("0. Back to Main Menu");

            System.out.print("Select an option: ");
            option = input.nextInt();

            switch (option) {
                case 1 -> System.out.println("Search selected.");
                case 2 -> System.out.println("Service Nos. selected.");
                case 3 -> System.out.println("Add Name selected.");
                case 4 -> System.out.println("Erase selected.");
                case 5 -> System.out.println("Edit selected.");
                case 6 -> System.out.println("Assign Tone selected.");
                case 7 -> System.out.println("Send b’card selected.");
                case 8 -> phonebookOptionsSubMenu(input);
                case 9 -> System.out.println("Speed Dials selected.");
                case 10 -> System.out.println("Voice Tags selected.");
                case 0 -> System.out.println("Returning to Main Menu...");
                default -> System.out.println("Invalid option!");
            }

        } while (option != 0);
    }

    // Submenu for Phonebook Options
    public static void phonebookOptionsSubMenu(Scanner input) {
        int subOption = -1;
        do {
            System.out.println("\n--- PHONEBOOK OPTIONS ---");
            System.out.println("1. Type of View");
            System.out.println("2. Memory Status");
            System.out.println("0. Back");

            System.out.print("Choose an option: ");
            subOption = input.nextInt();

            switch (subOption) {
                case 1 -> System.out.println("Type of View selected.");
                case 2 -> System.out.println("Memory Status selected.");
                case 0 -> System.out.println("Returning to Phonebook menu...");
                default -> System.out.println("Invalid option!");
            }

        } while (subOption != 0);
    }

    // ==================== MESSAGES MENU ====================
    public static void messagesMenu(Scanner input) {
        int option = -1;
        do {
            System.out.println("\n--- MESSAGES ---");
            System.out.println("1. Write Messages");
            System.out.println("2. Inbox");
            System.out.println("3. Outbox");
            System.out.println("4. Picture Messages");
            System.out.println("5. Templates");
            System.out.println("6. Smileys");
            System.out.println("7. Message Settings");
            System.out.println("0. Back to Main Menu");

            System.out.print("Select an option: ");
            option = input.nextInt();

            switch (option) {
                case 1 -> System.out.println("Write Messages selected.");
                case 2 -> System.out.println("Inbox selected.");
                case 3 -> System.out.println("Outbox selected.");
                case 4 -> System.out.println("Picture Messages selected.");
                case 5 -> System.out.println("Templates selected.");
                case 6 -> System.out.println("Smileys selected.");
                case 7 -> messageSettingsSubMenu(input);
                case 0 -> System.out.println("Returning to Main Menu...");
                default -> System.out.println("Invalid option!");
            }

        } while (option != 0);
    }

    // Submenu for Message Settings
    public static void messageSettingsSubMenu(Scanner input) {
        int subOption = -1;
        do {
            System.out.println("\n--- MESSAGE SETTINGS ---");
            System.out.println("1. Set");
            System.out.println("2. Common");
            System.out.println("0. Back");

            System.out.print("Choose an option: ");
            subOption = input.nextInt();

            switch (subOption) {
                case 1 -> {
                    System.out.println("\nSet Menu:");
                    System.out.println("1. Message Centre Number");
                    System.out.println("2. Messages Sent As");
                    System.out.println("3. Message Validity");
                }
                case 2 -> {
                    System.out.println("\nCommon Menu:");
                    System.out.println("1. Delivery Reports");
                    System.out.println("2. Reply via Same Centre");
                    System.out.println("3. Character Support");
                }
                case 0 -> System.out.println("Returning to Messages menu...");
                default -> System.out.println("Invalid option!");
            }

        } while (subOption != 0);
    }

    // ==================== CALL REGISTER MENU ====================
    public static void callRegisterMenu(Scanner input) {
        int option = -1;
        do {
            System.out.println("\n--- CALL REGISTER ---");
            System.out.println("1. Missed Calls");
            System.out.println("2. Received Calls");
            System.out.println("3. Dialled Calls");
            System.out.println("4. Erase Recent Call Lists");
            System.out.println("5. Show Call Duration");
            System.out.println("6. Show Call Costs");
            System.out.println("7. Call Cost Settings");
            System.out.println("8. Prepaid Credit");
            System.out.println("0. Back to Main Menu");

            System.out.print("Select an option: ");
            option = input.nextInt();

            switch (option) {
                case 1 -> System.out.println("Missed Calls selected.");
                case 2 -> System.out.println("Received Calls selected.");
                case 3 -> System.out.println("Dialled Calls selected.");
                case 4 -> System.out.println("Erase Recent Call Lists selected.");
                case 5 -> System.out.println("Show Call Duration selected.");
                case 6 -> System.out.println("Show Call Costs selected.");
                case 7 -> System.out.println("Call Cost Settings selected.");
                case 8 -> System.out.println("Prepaid Credit selected.");
                case 0 -> System.out.println("Returning to Main Menu...");
                default -> System.out.println("Invalid option!");
            }

        } while (option != 0);
    }

    // ==================== TONES MENU ====================
    public static void tonesMenu() {
        System.out.println("\n--- TONES ---");
        System.out.println("1. Ringing Tone");
        System.out.println("2. Ringing Volume");
        System.out.println("3. Incoming Call Alert");
        System.out.println("4. Composer");
        System.out.println("5. Message Alert Tone");
        System.out.println("6. Keypad Tones");
        System.out.println("7. Warning and Game Tones");
        System.out.println("8. Vibrating Alert");
        System.out.println("9. Screen Saver");
    }

    // ==================== SETTINGS MENU ====================
    public static void settingsMenu(Scanner input) {
        int option = -1;
        do {
            System.out.println("\n--- SETTINGS ---");
            System.out.println("1. Call Settings");
            System.out.println("2. Phone Settings");
            System.out.println("3. Security Settings");
            System.out.println("4. Restore Factory Settings");
            System.out.println("0. Back to Main Menu");

            System.out.print("Choose a settings option: ");
            option = input.nextInt();

            switch (option) {
                case 1 -> System.out.println("Call Settings selected.");
                case 2 -> System.out.println("Phone Settings selected.");
                case 3 -> System.out.println("Security Settings selected.");
                case 4 -> System.out.println("Restore Factory Settings selected.");
                case 0 -> System.out.println("Returning to Main Menu...");
                default -> System.out.println("Invalid option!");
            }

        } while (option != 0);
    }

    // ==================== CLOCK MENU ====================
    public static void clockMenu() {
        System.out.println("\n--- CLOCK ---");
        System.out.println("1. Alarm Clock");
        System.out.println("2. Clock Settings");
        System.out.println("3. Date Setting");
        System.out.println("4. Stopwatch");
        System.out.println("5. Countdown Timer");
        System.out.println("6. Auto Update of Date and Time");
    }
}


