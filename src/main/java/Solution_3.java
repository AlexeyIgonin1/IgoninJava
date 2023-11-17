
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3

public class Solution_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer[] array = new Integer[10];
        for (int i = 0; i < 10; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        Arrays.stream(array).forEach(x -> {
            if (x % 3 == 0) {
                System.out.println(x);
            }
        });
    }
}
