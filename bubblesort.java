import java.util.Scanner;

 class Bubblesort {
    static void main(String args[])
    {
        int x;
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int a[]=new int [n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            int y=0;
            for(int j=0;j<n-1-i;j++)
            {
                if(a[j]>a[j+1])
                {
                 x=a[j];
                 a[j]=a[j+1];
                 a[j+1]=x;
                }
                y=1;

            }
            if(y==0)
                break;
        }
        for(int i=0;i<a.length;i++)
        System.out.println(a[i]);
    }
}