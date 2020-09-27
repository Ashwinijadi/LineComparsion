package line;

public class LineComparsion {
	public static void main(String[] args) { 	
    System.out.println("Welcome To Line Comparsion Computation Program");
	double Line1=0;
    double Line2=0;
    int x1=(int)(Math.floor(Math.random() * 10));	
    int x2=(int)(Math.floor(Math.random() * 10));	
    int x3=(int)(Math.floor(Math.random() * 10));	
    int x4=(int)(Math.floor(Math.random() * 10));
    int y1=(int)(Math.floor(Math.random() * 10));
    int y2=(int)(Math.floor(Math.random() * 10));
    int y3=(int)(Math.floor(Math.random() * 10));	
    int y4=(int)(Math.floor(Math.random() * 10));
    
    //computatipon
    Line1=Math.sqrt(((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1)));
    Line2=Math.sqrt(((x4-x3)*(x4-x3)) + ((y4-y3)*(y4-y3)));
    System.out.println("Length of Line1:" +Line1);
    System.out.println("Length of Line2:" +Line2);
    //Comparsion
    Double obj1=new Double(Line1);
    Double obj2=new Double(Line2);
    int compareValue =obj1.compareTo(obj2);
    if(compareValue==1)
    { System.out.println("Line1 is greater than line2");}
    else if(compareValue==-1)
    { System.out.println("Line1 is less than line2");}
    else
    { System.out.println("Line1 is equal to line2");}
    }
    }
