import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world! with java");
//        Scanner sc=new Scanner(System.in);
//        int s=sc.nextInt();
//        System.out.println("Table:");
//        for(int i=1;i<=10;i++)
//        {
//            System.out.println(s+"X"+i+"="+s*i);
//        }
        Scanner s=new Scanner(System.in);
//        int number= s.nextInt();
//        for(int i=1;number>=i;i++)
//        {
//            for(int j=i;j<=i;j--)
//            {
//                System.out.print(" *");
//            }
//            System.out.println();
//        }
//        for(int i=0;i<=number;i++)
//        {
//            for(int j=number-i;j>0;j--)
//            {
//                System.out.print(" *");
//            }
//            System.out.println();
//        }
//        for(int i=1;i<=number;i++)
//        {
//            for(int j=1;j<=(number-i);j++)
//            {
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        for(int i=number;i>=1;i--)
//        {
//            for(int j=number;j>=(number-i);j--)
//            {
//                System.out.print(" ");
//            }
//            for(int j=number;j>=i;j--)
//            {
//                System.out.print(" *");
//            }
//            System.out.println();
//        }



//





        int s1=s.nextInt();
        int sort[]=new int[s1];
        for(int i=0;i<s1;i++)
        {
            sort[i]=s.nextInt();
        }
        for(int i=0;i<s1;i++)
        {
            for(int j=i+1;j<s1;j++)
            {
                if(sort[i]>sort[j])
                {
                    int d=sort[i];
                    sort[i]=sort[j];
                    sort[j]=d;
                }
            }
        }
        for(int i=0;i<s1;i++)
        {
            System.out.print(sort[i]+" ");
        }
    }
}