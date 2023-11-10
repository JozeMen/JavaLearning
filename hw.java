import java.util.Scanner;

class hw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        boolean x = sc.next() instanceof String;
        sc.close();
        System.out.println(x);
    }
}