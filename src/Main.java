import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ciąg znaków: ");
        String znaki = scanner.nextLine();

        String koniec = "";
        if(znaki.length() >= 3){
            koniec = znaki.substring(znaki.length()-2);
            znaki = znaki.substring(0,znaki.length()-2);
            System.out.println(koniec + znaki);
        }
        else{
            System.out.println("Ciąg znaków musi składać się z minimum 3 znaków.");
        }
    }
}