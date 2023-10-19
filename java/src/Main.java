import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++){
            System.out.print("Это добавлено в ветке main и dev!");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println(calc(Integer.parseInt(scanner.nextLine()), Integer.parseInt(scanner.nextLine())));
    }
    public static int calc(int first, int second){
        return first+second;
}