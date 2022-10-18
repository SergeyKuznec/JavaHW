import java.util.Scanner;
public class hw1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("N = ");
        String name = scan.nextLine();
        System.out.printf(name);
        scan.close();
        int n = Integer.parseInt(name);
        int sum = (1/2)*n*(n+1);
        System.out.println(sum);
    }
}
