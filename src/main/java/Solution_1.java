import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Составить алгоритм: если введенное число больше 7, то вывести “Привет”

public class Solution_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer integer = Integer.parseInt(reader.readLine());

        if (integer > 7) {
            System.out.println("Привет");
        }
    }
}
