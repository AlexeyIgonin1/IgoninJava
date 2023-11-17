import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Составить алгоритм: если введенное имя совпадает с Вячеслав,
//        то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени"

public class Solution_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputString = reader.readLine();

        if (inputString.equalsIgnoreCase("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }
}
