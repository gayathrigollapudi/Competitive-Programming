import java.util.*;
public class ParenthesesCombinations {
	public static ArrayList<String> al;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		al=new ArrayList<>();
		combinations("",2,0,0);
		System.out.println(al+"-->"+al.size());
		al=new ArrayList<>();
		combinations("",3,0,0);
		System.out.println(al+"-->"+al.size());
		al=new ArrayList<>();
		combinations("",5,0,0);
		System.out.println(al+"-->"+al.size());
		al=new ArrayList<>();
		combinations("",4,0,0);
		System.out.println(al+"-->"+al.size());
		al=new ArrayList<>();
		combinations("",1,0,0);
		System.out.println(al+"-->"+al.size());
		al=new ArrayList<>();
		combinations("",6,0,0);
		System.out.println(al+"-->"+al.size());
	}
	public static void combinations(String s,int n,int op,int cl) {
		//if(op>cl) return;
		if(cl==n) {
			al.add(s);
			return;
		}
		else {			
			if(op>cl) combinations(s+")",n,op,cl+1);
			if(op<n) combinations(s+"(",n,op+1,cl);
		}
		
	}
	

}
