import java.util.Scanner;

public class Slide81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m ;

        do{
            System.out.print("Nhap so dong cua ma tran: ");
            n = sc.nextInt();
        }while(n <= 0);
        
        do{
            System.out.print("Nhap so cot cua ma tran: ");
            m = sc.nextInt();
        }while(m <= 0);

        int arrA[][] = new int [n][m];
        int max = arrA[0][0];
        int d = 0;
        int c = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.printf("Nhap vao phan tu A[%d][%d]= ", i, j);
                arrA[i][j] = sc.nextInt();
                if(arrA[i][j] > max){
                    max = arrA[i][j];
                    d = i;
                    c = j;
                }
            }
        }
        System.out.printf("Phan tu co gia tri lon nhat trong ma tran la A[%d][%d] = %d", d, c, max);
        sc.close();
    }
}