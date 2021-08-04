public class While {
    public static void main(String[] args) {
        int sum = 0, i = 1;

        while (sum < 10000) {
            sum = sum + i;
            i = i + 1;
        }
        System.out.println(sum);
    }
}
