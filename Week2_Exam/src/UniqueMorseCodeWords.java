import java.util.*;
public class UniqueMorseCodeWords {
	public static HashMap<Character,String> hm;
	static{
		hm=new HashMap<>();
		hm.put('a',"._");hm.put('b',"_...");hm.put('c',"_._.");hm.put('d',"_..");
		hm.put('e',".");hm.put('f',".._.");hm.put('g',"__.");hm.put('h',"....");
		hm.put('i',"..");hm.put('j',".___");hm.put('k',"_._");hm.put('l',"._..");
		hm.put('m',"__");hm.put('n',"_.");hm.put('o',"___");hm.put('p',".__.");
		hm.put('q',"__._");hm.put('r',"._.");hm.put('s',"...");hm.put('t',"_");hm.put('u',".._");
		hm.put('v',"..._");hm.put('w',".__");hm.put('x',"_.._");hm.put('y',"_.__");hm.put('z',"__..");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[]={"gin","zen","gig","msg"};
		String b[]= {"a","z","g","m"};
		String c[]= {"bhi","vsv","sgh","vbi"};
		String d[]= {"a","b","c","d"};
		String e[]= {"hig","sip","pot"};
		finding(a);
		finding(b);
		finding(c);
		finding(d);
		finding(e);
		
	}
	public static void finding(String[] a) {
		HashMap<String,Integer> result=new HashMap<>();
		for(int i=0;i<a.length;i++) {
			String s="";
			for(int j=0;j<a[i].length();j++) {
				//System.out.println(hm.get(a[i].charAt(j)));
				s+=""+hm.get(a[i].charAt(j));
			}
			//System.out.println(s);
			if(!result.containsKey(s)) result.put(s,1);
		}
		System.out.println(result.size());
	}

}
