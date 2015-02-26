import java.util.ArrayList;
import java.util.Arrays;

public class mergesort{

    public ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b){
	ArrayList<Integer> result = new ArrayList<Integer>();
	while (a.size() > 0 || b.size() > 0){
	    if(b.size()==0){
		result.add(a.remove(0));
	    } else if (a.size() == 0){
	        result.add(b.remove(0));
	    } else if (a.get(0) > b.get(0)){
		result.add(b.remove(0));
	    } else {
		result.add(a.remove(0));
	    }
	}

	return result;
    }

    public int[] merge(int[] a, int[] b){
	int[] result = new int[a.length + b.length];
	int ac = 0;
	int bc = 0;
	int rc = 0;
	while (bc<b.length || ac<a.length){
	    if (ac == a.length){
		result[rc] = b[bc];
		rc++;
		bc++;
	    } else if (bc == b.length){
		result[rc] = a[ac];
		rc++;
		bc++;
	    } else if ((ac < a.length && bc < b.length)&&(a[ac] > b[bc])){
		result[rc] = a[ac];
		rc++;
		ac++;
	    } else if ((ac < a.length && bc < b.length)&&(a[ac] < b[bc])){
		result[rc] = b[bc];
		rc++;
		bc++;
	    }
		
	}
	return result;
    }

    /*
      public ArrayList<Integer> msort(ArrayList<Integer> L){
	int m = L.size()/2;
	ArrayList<Integer> a = new ArrayList<Integer>();
	ArrayList<Integer> b = new ArrayList<Integer>();
	if (L.size() >= 1){
	    a = L.addAll(
	    
	    
    }
    */
    public static void main(String[] args){
	mergesort m = new mergesort();
	/*
	ArrayList<Integer> first = new ArrayList<Integer>();
	ArrayList<Integer> second = new ArrayList<Integer>();

	first.add(1);
	first.add(6);
	first.add(8);
	first.add(10);

	second.add(2);
	second.add(3);
	second.add(7);
	second.add(9);

	System.out.println(first);
	System.out.println(second);
	*/
	int[] firstarray = new int[4];
	int[] secarray = new int[4];
	firstarray[0] = 1;
	firstarray[1] = 6;
	firstarray[2] = 8;
	firstarray[3] = 10;

	secarray[0] = 2;
	secarray[1] = 3;
	secarray[2] = 7;
	secarray[3] = 9;
	
	System.out.println(Arrays.toString(firstarray));
	System.out.println(Arrays.toString(secarray));

	//	System.out.println(m.merge(first,second));
	
	System.out.println(Arrays.toString(m.merge(firstarray,secarray)));
    }
}
