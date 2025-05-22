import java.util.Scanner;

public class crop_around {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] array = new int[row][col];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                array[i][j] = sc.nextInt();
            }
        }
        int target_row = sc.nextInt();
        int target_col = sc.nextInt();
        int height = sc.nextInt();
        int width = sc.nextInt();

        if(target_row < 0 || target_col < 0 || target_row >= row || target_col >= col){
            System.out.println("invalid");
        } else {
            int start_row = target_row - (height - 1) / 2;
            int start_col = target_col - (width - 1) / 2;
            int end_row = start_row + height;
            int end_col = start_col + width;
            for (int i = start_row; i < end_row; i++) {
                for (int j = start_col; j < end_col; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
