/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;
/**
 *
 * @author sksba
 */
public class abstdemo {
    public static void main(String[] args){
        A obja;
        B objb;
        obja=new A(100,99,88);
        objb=new B(100,99,98,97);
        system.out.println("Student A");
        obja.getPercentage();
        system.out.println("Student B");
        objb.getPercentage();
    }
}
abstact class marks
{
    abstract void getPercentange();
}
class A extends marks
{
    int mark1,mark2,mark3;
    A(int m1,int m2,int m3)
}

{
mark1=m1;
mark2=m2;
mark=m3;
}
void getPercentage()
{
   int tot=mark1+mark2+mark3;
   double Percent=(double)(tot/3);
   system.out.println("Percentage."+percent);
}
}
class B extends marks
{
    int mark1,mark2,mark3,mark4;
    B(int m1,int m2,int m3,int m4)
    {
        mark1=m1;
        mark2=m2;
        mark3=m3;
        mark4=m4;


}

void getPercentage()
        
{
    int tot=mark1+mark2+mark3+mark4;
    double percent=(double)(tot/4);
    system.out.println("Percentage:"+percent);
}


}