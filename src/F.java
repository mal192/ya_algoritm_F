import java.util.Scanner;

public class F {

public static boolean mas[][];
public static void mas_z(int nn, int mm) {
    if (mas[nn][mm] == true) mas[nn][mm] = false; else mas[nn][mm] = true;
}


    public static void main(String[] args) {
        Scanner input_ = new Scanner(System.in);
        int n = input_.nextInt(); //рядов
        int m = input_.nextInt(); //элементов в ряде
        input_.close();
         mas = new boolean[n][m];
         long timOne = System.currentTimeMillis();
        int count_ = 0;
        for (int nn=0; nn<n; nn++) //ряд
            for (int mm = 0; mm<m; mm++) { // позиция
                boolean bin = false;
                if (mas[nn][mm] == false) {
                    if ((nn < n - 1) && (nn > 0)) {
                        if (mas[nn - 1][mm] == true) bin = true;
                        if (mas[nn + 1][mm] == true) bin = true;
                    } else if (nn == 0) {
                        if (mas[nn + 1][mm] == true) bin = true;
                    } else if (nn == n - 1) if (mas[nn - 1][mm] == true) bin = true;

                    if ((mm < m - 1) && (mm > 0)) {
                        if (mas[nn][mm - 1] == true) bin = true;
                        if (mas[nn][mm + 1] == true) bin = true;
                    } else if (mm == 0) {
                        if (mas[nn][mm + 1] == true) bin = true;
                    } else if (mm == m - 1) if (mas[nn][mm - 1] == true) bin = true;

                    if (bin == false) {
                      //  count_ = count_ + 1;
                        if ((nn < n - 1) && (nn > 0)) mas[nn + 1][mm] = true;
                        else if (mm<m-1) mas[nn][mm + 1] = true; else


                       // if (((nn == 0) || (nn == nn - 1))&&(mm<m-1)) mas[nn][mm + 1] = true;
                        if ((nn == n-1)&&(mm ==m-1)) mas[nn][mm] = true; //последний элемент
                    }
                } //nn = n-1; m=0
            }


        count_=0;
        for (int nn=0; nn<n; nn++) { //ряд
            System.out.println("");
            for (int mm = 0; mm < m; mm++) {
                if (mas[nn][mm] == true){
                   count_++;
                    System.out.print(1); }else System.out.print(0);
                System.out.print(' ');
            }
        }
        System.out.println("");
        System.out.println(count_);

        long timeTo = System.currentTimeMillis() - timOne;
            System.out.println("Time spent " + timeTo+ " ms");


    }
}
