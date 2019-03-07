import java.util.Scanner;
public class Exercise9 {
    public static void main (String [] args) {
        Scanner s = new Scanner(System.in);
        int[][] Mat = new int[3][3];
        for (int j = 0; j<3; j++) {
            System.out.println("Введите "+ (j+1) + " строку матрицы (3 столбца): ");
            for (int i = 0; i<3; i++) {
                Mat[j][i]= s.nextInt();
            }
        }
        System.out.print("Элементы первой строки, умноженные на 3: ");
        for (int I=0; I<3;I++) {
            System.out.print(Mat[0][I]*3+" ");
        }
    }
}
