import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = 9;
        numNum(a, b);


    }
    public static void numNum (int a, int b){
        int c = (a * 45) / 60 + 9;
        int d = (((a * 45) % 60) + (a/2)*5 + ((a+1)/2-1)*15) % 60;
        int num = (((a * 45) % 60) + (a/2)*5 + ((a+1)/2-1)*15) / 60;
        c += num;
        System.out.println(c + " " + d);
    }
}