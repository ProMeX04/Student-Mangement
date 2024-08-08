import java.util.Scanner;
import java.lang.Math;

public class Main {

    private Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        var main = new Main();
        main.run();
    }

    public void run() {
        var a = sc.nextInt();
        System.out.print(Math.abs(-a));
    }

}