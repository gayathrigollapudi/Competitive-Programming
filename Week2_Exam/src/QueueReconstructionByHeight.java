import java.util.*;

public class QueueReconstructionByHeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
		int b[][]= {{12,0},{6,3},{3,4},{9,2},{11,1},{1,5}};
		int c[][]= {{2,4},{5,1},{3,3},{1,5},{4,2},{6,0}};
		sorting(a);
		sorting(b);
		sorting(c);
	}
	public static void sorting(int a[][]) {
		for (int i = 0; i < a.length; i++) 
        {
            for (int j = i + 1; j < a.length; j++) 
            {
                if (a[i][0] < a[j][0]) 
                {
                     int[] temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
		//System.out.println(Arrays.deepToString(a));
		ArrayList<int[]> al = new ArrayList<int[]>();
		 
	    for(int i=0; i<a.length; i++){
	        int[] p = a[i];
	        al.add(p[1],p);
	    }
	 
	    for(int i=0; i<a.length; i++){
	        a[i]=al.get(i);
	    }
	    System.out.println(Arrays.deepToString(a));
	    
	}

}
