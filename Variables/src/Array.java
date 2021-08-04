public class Array {
    public static void main(String[] args) {
        int intArr[] = new int[5];
        int intArr2[] = {9,8,7,6,5,4,3,2,1};
        String[] strArr = new String[5];


        for(int i = 0; i < intArr.length; i++) {
            intArr[i] = i;
            System.out.println(intArr[i]);
        }

        System.out.println("---");


        for(double i : intArr2) {
            System.out.println(i);
        }
    }
}
