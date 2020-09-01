/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;
interface Pm
/**
 *
 * @author sksba
 */
public class perimtr
{
    public static void main(string[]args)
}
   circle objc=new circle(4);
   rectangle objr=new rectangle(5,6);
   system.out.println("circle");
   objc.perimeter();
   system.out.println("Rectangle");
   objr.perimeter();

{
   void perimeter();
}
    
class circle implements Pm
{
    int radius;
    circle(int r)
}

{
  radius=r;
}

public void perimeter()

{
   system.out.println("PERIMETER="+(double)2*3.14*radius);
}
}
class rectangle implements pm
{
    int length,breadth;
    rectangle(int l,int b)
            
    {
        length=l;
        breadth=b;
        
    }
    public void perimeter()
            
    {
        system.out.println("perimeter="+(double)2*(length+breadth));
    }
    
}