
public class KeysAndRooms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1},{0,2},{3}};
		boolean b[]=new boolean[a.length];
		boolean row[]=new boolean[a.length];
		checkingValues(a,b,0);
		for(int i=0;i<b.length;i++) {
			if(!b[i]) {
				System.out.println(false);
				return;
			}
		}
		System.out.println(true);
	}
	public static void checkingValues(int a[][], boolean b[],int i) {
		if(b[i]) return;
		else {
			//row[i]=true;
			for(int p=0;p<a[i].length;p++) {
				if(a[i][p]<a.length) {
				b[a[i][p]]=true;
				checkingValues(a,b,a[i][p]);
				}
			}
			
		}
		
	}
}
