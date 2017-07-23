import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.lang.Object;

//import java.util.Random; 

public class quick_sort{

  //Define global variable aux
  private static Comparable[] aux;

  public static void main(String[] args){
	  
	  Comparable[] a1 = {5,10,6,7,4,3,2,1,19,8,20};
	  
	  quick_sort(a1);
	  
	  for(int i=0;i<a1.length;i++){
		  System.out.print(a1[i]+" ");
	  }
	  	
  }
  

  public static void quick_sort(Comparable[] a){
	  
	  //List list_a = Arrays.asList(a);
	  //Collections.shuffle(list_a);
	  //sort((Comparable[]) list_a.toArray(),0,a.length - 1);
	  sort(a,0,a.length-1);
  }
  
  public static void sort(Comparable[] a,int low,int high){
	  
	  if(low >= high) return;
	  
	  int v_position = partation(a,low,high);
	  
	  sort(a,low,v_position-1);
	  sort(a,v_position+1,high);
	  
  }
  
  public static int partation(Comparable[] sub_a,int low,int high){
	  
	  int i=low,j=high;
	  
	  Comparable v = sub_a[low];
	  
	  while(i<j)
	  {
		  
		  while((i<high) && less(sub_a[i],v)){
			  i++;
		  }
		  
		  while((j>low) && less(v,sub_a[j])){
			  j--;
		  }
		  
		  if(i>=j) {break;}
		  
		  exch(sub_a,i,j); 
		 		  
	  }
	  
	  exch(sub_a,low,j);
	  
	  return j;
	  
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
