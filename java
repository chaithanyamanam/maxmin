import java.util.*;

class Maxmin
{

public static void main(String args[])

{

int n,i,max,min;

Scanner sc=new Scanner(System.in);

System.out.println("enter array size:");

n=sc.nextInt();

int ar[]=new int[n];

System.out.print("enter array elements:");

for(i=0;i<n;i++)

{

ar[i]=sc.nextInt();

}

max=ar[0];

for(i=0;i<n;i++)

{

if(ar[i]>max)

max=ar[i];
}

System.out.println("Maximum:"+max);

min=ar[0];

for(i=0;i<n;i++)

{

if(ar[i]<min)

min=ar[i];
}

System.out.println("Maximum:"+min);

}

}
