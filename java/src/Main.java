import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Это добавлено в ветке main?");
        calc(Integer.parseInt(scanner.nextLine()), Integer.parseInt(scanner.nextLine()));
    }
    public static int calc(int first, int second){
        return first+second;
    }
}