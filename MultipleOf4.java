public class MultipleOf4 {


    public static void main(String[] args) {


        for (int count = 100; count <= 200; count++) {

            
                if (count % 4 == 0 && count % 6 == 0) {

                System.out.println("\"Hello World\"");

            } else if (count % 4 == 0) {
                
               System.out.println("\"Hello\"");

            } else if (count % 6 == 0) {
                
                System.out.println("\"World\"");
                }
                else {
                    System.out.println(count);

     }
       

 }
  

  }
}

