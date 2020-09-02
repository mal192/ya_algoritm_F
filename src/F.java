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
         for (int nn=0; nn<n; nn++)
             for (int mm = 0; mm<m; mm++){
               if ((nn!=0)&&(mm!=0)&&(nn<n-1)&&(mm<m-1)) {
                   mas_z(nn-1,mm);
                   mas_z(nn+1,mm);
                   mas_z(nn,mm-1);
                   mas_z(nn,mm+1);
               }
                   if ((nn==0)&&(mm!=0)&&(mm<m-1)) {
                       mas_z(nn+1,mm);
                       mas_z(nn,mm-1);
                       mas_z(nn,mm+1);
                   }
                   if ((nn!=0)&&(mm==0)&&(nn<n-1)) {
                       mas_z(nn-1,mm);
                       mas_z(nn+1,mm);
                       mas_z(nn,mm+1);
                   }
                   if ((nn==0)&&(mm==0)) {
                       mas_z(nn + 1, mm);
                       mas_z(nn, mm + 1);
                   }
                   if ((nn==n-1)&&(mm==mm-1)) {
                       mas_z(nn - 1, mm);
                       mas_z(nn, mm - 1);
                   }

                   //-
                 if ((nn==n-1)&&(mm!=0)&&(mm<m-1)) {
                     mas_z(nn-1,mm);
                     mas_z(nn,mm-1);
                     mas_z(nn,mm+1);
                 }
                 if ((nn!=0)&&(mm==m-1)&&(nn<n-1)) {
                     mas_z(nn-1,mm);
                     mas_z(nn+1,mm);
                     mas_z(nn,mm-1);
                 }
                 if ((nn==0)&&(mm==mm-1)) {
                     mas_z(nn, mm-1);
                     mas_z(nn+1, mm);
                 }
                 if ((nn==n-1)&&(mm==0)) {
                     mas_z(nn - 1, mm);
                     mas_z(nn-1, mm + 1);
                 }


                 //mas(nn,mm);
         }
         int count_ = 0;
        for (int nn=0; nn<n; nn++)
            for (int mm = 0; mm<m; mm++)
                if (mas[nn][mm]==true) count_++;
         System.out.println(count_);







    }
}
