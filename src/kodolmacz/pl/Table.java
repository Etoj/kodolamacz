package kodolmacz.pl;

public class Table {
    public static void main (String[] args) {

        int[] result = countAndSumElements(new int[]{1, 2, 3, 4, 5, -3, -2, -1});
        if (result.length == 2) {
            System.out.println("Liczb ujemnych: " + result[0]);
            System.out.println("Suma dodatnich: " + result[1]);
        }
    }

    public static int[] countAndSumElements(int[] input) {

        if (input == null || input.length == 0) return new int[0];

        var sum = 0;
        var count = 0;

        for (var element : input) {
            if (element > 0) sum += element;
            else if (element < 0) count++;
        }

        return new int[]{count, sum};
    }

}