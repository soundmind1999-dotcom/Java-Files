






public class TaskSeven {
    public static void main(String[] args) {
        int sumOf4 = 0;
        int sumOf8 = 0;

        for (int count = 1; count <= 5; count++) {
            sumOf4 += Math.pow(4, count);
            sumOf8 += Math.pow(8, count);
        }

        System.out.println(sumOf4);
        System.out.println(sumOf8);
    }
}

