//public class Practice{
//public static void main (String [] args){
//    System.out.println("\"Welcome To Java Programming\"");
//
//
//}
//
//}

//import java.util.Scanner;
//public class Practice{
//    public static void main (String [] args){
//
//    Scanner input = new Scanner (System.in);
//    System.out.println("Enter first integer: ");
//
//    int number1 = input.nextInt();
//
//    System.out.println("Enter second integer: ");
//    int number2 = input.nextInt();
//
//    int sum = number1 + number2;
//
//    System.out.printf("Sum is %d%n", sum);
//
//}
//
//}

//import java. util.Scanner;
//public class Practice{
//public static void main (String [] args){
//    Scanner input = new Scanner (System.in);
//    
//    int total = 0;
//    for (int gradeCounter = 1; gradeCounter <= 10; gradeCounter++){   
//    System.out.print("Enter grade: ");
//    int grade = input.nextInt();
//    total = total + grade;
//   
//}
//    int average = total / 10;
//
//    System.out.printf("Total is %d%n", total);
//    System.out.printf("Average is %d%n", total / 10);

//import java.util.Scanner;
//public class Practice{
//    public static void main (String [] args){
//
//    Scanner input = new Scanner (System.in);
//   
//    int total = 0;
//    int gradeCounter = 1;
//    System.out.print("Enter grade or -1 to stop: ");
//    int grade = input.nextInt();
//
//    while (grade != -1){  
//    System.out.print("Enter grade or -1 to stop: ");
//    grade = input.nextInt(); 
//    gradeCounter++;
//    total = total + grade;
//    }
//
//    if (gradeCounter != 0){
//  
//    double average = (double)total / gradeCounter;
//    
//    System.out.printf("Total is %d%n", total);
//    System.out.printf("Average is %.2f%n", average);      
//}
//    else {
//    System.out.println("No grades were entered");
//}   
//}
//
//}
    



//
//import java.util.Scanner;
//public class Practice {
//    public static void main (String [] args){
//    
//    Scanner input = new Scanner (System.in);
//    int studentCounter = 1;
//    int numberOfPass = 0;
//    int numberOfFail = 0;   
// 
//    while (studentCounter <= 10){
//    System.out.println("Enter student result (1 = pass, 2 = fail) ");
//    int studentResult = input.nextInt();
//    studentCounter++;
//
//    if (studentResult == 1){
//    numberOfPass++;
//}
//    else{
//    numberOfFail++;
//}
//}
//    System.out.printf("Student Passed: %d%nStudent Failed: %d%n", numberOfPass, numberOfFail);
//    
//    if (numberOfPass > 8){
//    System.out.println("Bonus To Instructor");
//}
//
//
//}
//


public class Practice{
    public static void main (String [] args){
    
 
    double principal = 1000;
    double interestRate = 0.05;
   
    System.out.printf("%s%20s%n", "Number Of Years", "Amount on deposit");
    for (int year = 1; year <=10; year++){
    double amount = principal * Math.pow(1 + interestRate, year);
    System.out.printf("%4d%,20.2f%n", year, amount);
}

}
    


}
























//}
