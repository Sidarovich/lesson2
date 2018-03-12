package epm.com.jdk1;


public class Example1 {

	public static void main(String[] args) {
		int r;
		int s;
		double a,b,c,d,e ;
		a=2; b=3; c= 4;
		r=5;
        s=r*r;
        double p= Math.PI * 2*r;
        System.out.println("lenth  " + p) ;
        System.out.println("square = " + s); 
        e=b*b + 4*a*c;
        d=(Math.sqrt(e) + b)/2*a -  Math.pow(a,3)*c+b;
        System.out.println("expression  " + d) ;
	}

}
