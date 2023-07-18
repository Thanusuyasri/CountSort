import java.util.Scanner;

public class SortCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] a = new int[size];
        for(int i=0;i<size;i++)
        {
            a[i]= scanner.nextInt();
        }
        int count[] ={0,0,0,0,0,0,0,0,0,0};
        for(int i= 0;i<size;i++)
        {
            count[a[i]]++;
        }
        for(int i=0;i<a.length;i++)
        {
            a[i]=0+i;
            for(int j=0;j<count[i];j++)
            {
                System.out.println(a[i]);
            }
        }
    }
}
