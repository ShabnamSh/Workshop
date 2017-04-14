/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package profilepic;

import java.util.Scanner;

/**
 *
 * @author sh
 */
public class ProfilePic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       {
     Scanner sc=new Scanner(System.in);
int L=0,N=0;
 System.out.println("Enter length");
L=sc.nextInt();
if(L<=10000 && L>=1)
{
    System.out.println("Enter No of picture");
N=sc.nextInt();
if(N>=1 && N<=1000)
{
for(int i=0;i<N;i++)
{ 
 System.out.println("Enter weigth");
int W=sc.nextInt();
System.out.println("Enter heigth");
int H=sc.nextInt();
if((W>=1 && W<=10000) && (H>=1 && H<=10000))
{
if(W<L || H<L)
System.out.println("UPLOAD ANOTHER");
else if(W>=L && H>=L)
{
if(W==H)
System.out.println("ACCEPTED");
else
System.out.println("CROP IT");
}
}
}
}
}
}
    }
    
}
