
public class Heap {
	
	public Heap(){
	}
	
	//The start node is 0;
	//If the the start node is 1,we just need to modify 3 sections:
	//#1.the i=(n-1)/2   to i=n/2 <This is how to caculate the parent node id
	//#2.the i_child_left = 2*index+1 to i_child_left= 2*index || the samiliar with right node
	//#3.the exch and Adjust Heap size from n-1 to n;>
	public void Sort(Comparable[] a){
		int n = a.length;
		
		for(int i= (n-1)/2; i>=0; i--){
			maxHeapify(a,i,n-1);
		}
		
		while(n>0){
			exch(a,0,n-1);
			n--;
			maxHeapify(a,0,n-1);
		}
	}

	protected void maxHeapify(Comparable[] a,int index,int heapSize){
		
		int i_child_left;
		int i_child_right;
		int i_max = index;
		
		while( index *2 +2 <= heapSize){
			
			i_child_left=index*2+1;
			i_child_right=index*2+2;
			
			if(less(a[i_child_left],a[i_child_right])){
				i_max=i_child_right;
			}else{
				i_max=i_child_left;
			}
			
			if(less(a[i_max],a[index])){
				break;
			}else{
				exch(a,i_max,index);
			}
			
			index=i_max;
		}
		
	}
	
	public static boolean less(Comparable comparable, Comparable comparable2) {
		// TODO Auto-generated method stub
		
		//order the object by asc
		if(comparable.compareTo(comparable2) <=0)
		{
			return true;
		}else
		{
			return false;
		}
	}
		  
    public static void exch(Comparable[] a,int i,int j){
		Comparable v;
			  
		v=a[i];
		a[i]=a[j];
	    a[j]=v;
			  
   }
}
