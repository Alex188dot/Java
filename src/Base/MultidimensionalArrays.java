package Base;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        // Multidimensional arrays
        String[][] classes = {
                {"John", "Jane"},
                {"Alex", "Harry"},
        };

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("I: " + i + ", J: " + j);
                System.out.println(classes[i][j]);
            }
        }
    }
}
