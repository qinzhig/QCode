//import java.util.Random; 

public class merge_sort{

  //Define global variable aux
  private static Comparable[] aux;

  public static void main(String[] args){
	  
	  Comparable[] a1 = {5,10,6,7,4,3,2,1,19,8,20};
	  
	  mergeSort_BU(a1);
	  
	  for(int i=0;i<a1.length;i++){
		  System.out.print(a1[i]+" ");
	  }
	  	
  }
  
  public static void mergeSort_BU(Comparable[] a){
	  
	  int N = a.length;
	  aux = new Comparable[N];
	  
	  for(int step=1;step<N;step=step*2){
		  
		  for(int i=0;i<N-step;i=i+step*2){
			  
			  merge(a,i,i+step-1,Math.min(i+step*2-1, N-1));
			
		  }
	  }
	  
	  
  }
  
  public static void merge(Comparable[] a,int low,int mid,int high){
	  //Merge the sub array a[low...mid],a[mid+1...high]
	  
	  int i = low, j = mid+1;
	  
	  //Copy the array for sort
	  for(int k=low;k<=high;k++){
		  aux[k] = a[k];
	  }
	  
	  //merge the sub array to original array
	  
	  for(int k=low;k<=high;k++)
	  {
		  if(i>mid){
			a[k]=aux[j];
			j++;
		  }else if(j>high){
			a[k]=aux[i];
			i++;
		  }else if(less(aux[j],aux[i])){
				a[k]=aux[j];
				j++;  
		  }else{
				a[k]=aux[i];
				i++;
		  }
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

}
