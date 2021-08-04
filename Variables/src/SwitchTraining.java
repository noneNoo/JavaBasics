public class SwitchTraining {
    public static void main(String[] args) {
        int num = 13, num2 = 14;

        switch (num2 % 7) {
            case 6 :
                System.out.println("six");
                break;
            case 5 :
                System.out.println("five");
                break;
            case 4:
                System.out.println("four");
                break;
            case 3:
                System.out.println("three");
                break;
            case 2:
                System.out.println("two");
                break;
            case 1:
                System.out.println("one");
                break;
            default:
                System.out.println("zero");
        }
    }
}
