//public class ArrayMulti {
//
//        public static void main(String[] args) {
//            int[][] matrix1 = {{1, 2}, {3, 4}};
//
//            int[][] matrix2 = {{5, 6}, {7, 8}};
//            int[][] result = new int[2][2];
//
//            for (int i = 0; i < 2; i++) {
//                for (int j = 0; j < 2; j++) {
//                    result[i][j] = 0;
//                    for (int k = 0; k < 2; k++) {
//                        result[i][j] += matrix1[i][k] * matrix2[k][j];
//                    }
//                }
//            }
//            System.out.println("Resulting Matrix:");
//            for (int i = 0; i < 2; i++) {
//                for (int j = 0; j < 2; j++) {
//                    System.out.print(result[i][j] + " ");
//                }
//                System.out.println();
//            }
//        }
//    }
//
//
public class ArrayMulti {
    public static void main(String[] args) {

        int[][] matrix1 = {{10, 20},{30, 40}};

        int[][] matrix2 = {{50, 60}, {70, 80}};


        int[][] result = new int[2][2];


        result[0][0] = matrix1[0][0] * matrix2[0][0] + matrix1[0][1] * matrix2[1][0];
        result[0][1] = matrix1[0][0] * matrix2[0][1] + matrix1[0][1] * matrix2[1][1];
        result[1][0] = matrix1[1][0] * matrix2[0][0] + matrix1[1][1] * matrix2[1][0];
        result[1][1] = matrix1[1][0] * matrix2[0][1] + matrix1[1][1] * matrix2[1][1];

        System.out.println("Resulting Matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
