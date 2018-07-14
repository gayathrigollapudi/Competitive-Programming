public class HammingDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=25;
		int b=30;
		hamming(a,b);
		a=1;
		b=4;
		hamming(a,b);
		a=25;
		b=30;
		hamming(a,b);
		a=100;
		b=250;
		hamming(a,b);
		a=1;
		b=30;
		hamming(a,b);
		a=0;
		b=255;
		hamming(a,b);
		
	}
	public static void hamming(int a,int b) {
		String x=binary(a);
		String y=binary(b);
		//System.out.println(x+"   "+y);
		int count=0;
		//String s="";
		if(x.length()>y.length()) {
			while (x.length()!=y.length()) y+=""+"0";
		}
		else if (y.length()>x.length()) {
			while(x.length()!=y.length()) x+=""+"0";
		}
		//System.out.println(x+"   "+y);
		for(int i=0,j=0;i<x.length();i++,j++) {
			if(x.charAt(i)!=y.charAt(j))count++;			
		}
		System.out.println(count);
	}
	public static String binary(int p) {
		String s="";
		while(p>0) {
			s+=""+(p%2);
			p=p/2;
		}
		return s;
		
	}

}
