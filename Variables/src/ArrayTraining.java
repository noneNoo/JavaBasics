public class ArrayTraining {
    public static void main(String[] args) {
        int intArray[] = new int[30];
        String[] reaminders = {"zero", "one","two","three"};

        for(int i = 0; i < intArray.length; i++) {
            intArray[i] = 1001 + i;
        }

        for (int index:intArray) {
            System.out.println(reaminders[index % 4]);
        }
        }
    }
