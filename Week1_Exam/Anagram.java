
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="anagram";
		String s2="nagaram";
		System.out.println("1  "+checking(s1,s2));
		System.out.println("2  "+checking("Keep","Peek"));
		System.out.println("3  "+checking("Mother In Law","Hitler Woman"));
		System.out.println("4  "+checking("School Master","The Classroom"));
		System.out.println("5  "+checking("ASTRONOMERS","NO MORE STARS"));
		System.out.println("6  "+checking("Toss","Shot"));
		System.out.println("7  "+checking("joy","enjoy"));
		System.out.println("8  "+checking("Debit Card","Bad Credit"));
		System.out.println("9  "+checking("SiLeNt CAT","LisTen Act"));
		System.out.println("10  "+checking("Dormitory","Dirty Room"));
	}
	public static boolean checking(String s1,String s2) {
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		int a[]=new int[256];
		int b[]=new int[256];
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)!=' ' && s1.charAt(i)!=',') a[s1.charAt(i)]+=1;
		}
		for(int i=0;i<s2.length();i++) {
			if(s2.charAt(i)!=' ' && s2.charAt(i)!=',') b[s2.charAt(i)]+=1;
		}
		/*for(int i=0;i<256;i++) {
			if(a[i] != b[i]) return false;
		}*/
		int l1=s1.length();
		int l2=s2.length();
		int k=l1>l2 ? l1 : l2;
		String s=l1>l2 ? s1:s2;
		for(int i=0;i<k;i++)
			if(s.charAt(i)!=' ' && s.charAt(i)!=',') {
				if(a[s.charAt(i)] !=b[s.charAt(i)]) return false;
			}
		return true;
	}
}
