mport java.util.*;
class linear
{
 public static void main(String[] args)
 {  Scanner sc =new Scanner (System.in);
     int n = sc.nextInt();
     int a[]=new int[n];
     for(int i=0;i<n;i++)
     {
       a[i]=sc.nextInt();
     }
     int x=sc.nextInt();
     int j;
     int temp=0;
     for(j = 0; j < n; j++) 
    { 
        if(a[j] == x) 
          { 
            temp=1;
        break;}
    } 
    if(temp==1)
    System.out.print("found at"+" "+j);
    else
    System.out.print("not found");
 }
}
