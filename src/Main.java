import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Integer[] arr = {1,11,2,3,8,5,-33,10};
        Integer sumEven = Arrays.asList(arr).stream().filter(n -> n % 2 == 0).reduce((x, y) -> x + y).get();
        System.out.println("Сумма четных: " + sumEven);

    }
}