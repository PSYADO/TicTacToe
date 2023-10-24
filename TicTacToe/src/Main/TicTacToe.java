
package Main;
import org.jetbrains.annotations.NotNull;

import java.util.Scanner;
public class TicTacToe
{

    public static void main(String args[])
    {
        TicTacToe ob =new TicTacToe();
        int k=1,g=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("\n\n\n\n\n\t\t\t\tEnter Player 1 name");
        String p1=sc.nextLine();
        System.out.println('\u000c');
        System.out.println("\n\n\n\n\n\t\t\t\tEnter Player 2 name");
        String p2=sc.nextLine();
        System.out.println('\u000c');
        int cc=0;
        String score[]=new String[6];
        for(int i=0;i<6;i++)
            score[i]=" ";
        try{
            while(k==1)
            {
                ++g;

                char ar[]={'1','2','3','4','5','6','7','8','9'};
                int co=0,in=0,a=1,c=0;
                do{

                    System.out.println('\u000c');
                    if(g%2!=0)
                    {
                        if(c%2==0)
                            System.out.println("\n\n\t\t\t\t"+p1+"(x)");
                        else
                            System.out.println("\n\n\t\t\t\t"+p2+"(o)");
                    }

                    else
                    {

                        if(c%2==0)
                            System.out.println("\n\n\t\t\t\t"+p2+"(x)");
                        else
                            System.out.println("\n\n\t\t\t\t"+p1+"(o)");
                    }
                    System.out.println("\n\n\t\t\t \t \t \t\t"+p1+"\t"+p2);
                    System.out.println("\n\n\t\t\t"+ar[0]+"\t"+ar[1]+"\t"+ar[2]+"\t\t"+score[0]+"\t"+score[1]);
                    System.out.println("\n\t\t\t"+ar[3]+"\t"+ar[4]+"\t"+ar[5]+"\t\t"+score[2]+"\t"+score[3]);
                    System.out.println("\n\t\t\t"+ar[6]+"\t"+ar[7]+"\t"+ar[8]+"\t\t"+score[4]+"\t"+score[5]);
                    if(g%2!=0)
                    {
                        if(a==0)
                        {
                            score[cc]="1";
                            ++cc;
                            score[cc]="0";
                            ++cc;
                            System.out.println('\u000c');
                            System.out.println("\n\n\t\t\t \t \t \t\t"+p1+"\t"+p2);
                            System.out.println("\n\n\t\t\t"+ar[0]+"\t"+ar[1]+"\t"+ar[2]+"\t\t"+score[0]+"\t"+score[1]);
                            System.out.println("\n\t\t\t"+ar[3]+"\t"+ar[4]+"\t"+ar[5]+"\t\t"+score[2]+"\t"+score[3]);
                            System.out.println("\n\t\t\t"+ar[6]+"\t"+ar[7]+"\t"+ar[8]+"\t\t"+score[4]+"\t"+score[5]);
                            boolean ad=ob.print(p1+" wins");
                            break;
                        }
                        if(a==2)
                        {
                            score[cc]="0";
                            ++cc;
                            score[cc]="1";
                            ++cc;
                            System.out.println('\u000c');
                            System.out.println("\n\n\t\t\t \t \t \t\t"+p1+"\t"+p2);
                            System.out.println("\n\n\t\t\t"+ar[0]+"\t"+ar[1]+"\t"+ar[2]+"\t\t"+score[0]+"\t"+score[1]);
                            System.out.println("\n\t\t\t"+ar[3]+"\t"+ar[4]+"\t"+ar[5]+"\t\t"+score[2]+"\t"+score[3]);
                            System.out.println("\n\t\t\t"+ar[6]+"\t"+ar[7]+"\t"+ar[8]+"\t\t"+score[4]+"\t"+score[5]);
                            boolean ad=ob.print(p2+" wins");
                            break;
                        }
                    }
                    else
                    {

                        if(a==0)
                        {
                            score[cc]="0";
                            ++cc;
                            score[cc]="1";
                            ++cc;
                            System.out.println('\u000c');
                            System.out.println("\n\n\t\t\t \t \t \t\t"+p1+"\t"+p2);
                            System.out.println("\n\n\t\t\t"+ar[0]+"\t"+ar[1]+"\t"+ar[2]+"\t\t"+score[0]+"\t"+score[1]);
                            System.out.println("\n\t\t\t"+ar[3]+"\t"+ar[4]+"\t"+ar[5]+"\t\t"+score[2]+"\t"+score[3]);
                            System.out.println("\n\t\t\t"+ar[6]+"\t"+ar[7]+"\t"+ar[8]+"\t\t"+score[4]+"\t"+score[5]);
                            boolean ad=ob.print(p2+" wins");
                            break;
                        }
                        if(a==2)
                        {
                            score[cc]="1";
                            ++cc;
                            score[cc]="0";
                            ++cc;
                            System.out.println('\u000c');
                            System.out.println("\n\n\t\t\t \t \t \t\t"+p1+"\t"+p2);
                            System.out.println("\n\n\t\t\t"+ar[0]+"\t"+ar[1]+"\t"+ar[2]+"\t\t"+score[0]+"\t"+score[1]);
                            System.out.println("\n\t\t\t"+ar[3]+"\t"+ar[4]+"\t"+ar[5]+"\t\t"+score[2]+"\t"+score[3]);
                            System.out.println("\n\t\t\t"+ar[6]+"\t"+ar[7]+"\t"+ar[8]+"\t\t"+score[4]+"\t"+score[5]);
                            boolean ad=ob.print(p1+" wins");
                            break;
                        }
                    }
                    if(c==9)
                    {
                        boolean ad=ob.print("DrAw");
                        break;
                    }
                    in=sc.nextInt();
                    c=c+1;

                    if(co%2==0)
                        ar[in-1]='X';
                    else
                        ar[in-1]='O';
                    ++co;
                    }