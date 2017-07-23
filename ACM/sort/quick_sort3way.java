import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.lang.Object;

//import java.util.Random; 

public class quick_sort3way{

  //Define global variable aux
  private static Comparable[] aux;

  public static void main(String[] args){
	  
	  Comparable[] a1 = {5,10,6,7,4,3,2,1,19,8,20};
	  
	  quick_sort(a1);
	  System.out.print("After Sort----------- ");
	  for(int i=0;i<a1.length;i++){
		  System.out.print(a1[i]+" ");
	  }
	  	
  }
  
  public static void quick_sort(Comparable[] a){
	  
	  if(a.length <2) return;
	  way3sort(a,0,a.length-1);
  }
  
  public static void way3sort(Comparable[] a,int low,int high){
	  
	  if(high<=low) return;
	  
	  int lt=low,gt=high,i=low+1;
	  
	  Comparable v = a[low];
	  
	  while(i <= gt){
		  
		  if(less(a[i],v)){
			  exch(a,i++,lt++);
		  }else if(less(v,a[i])){
			  exch(a,i,gt--);
		  }else{
			  i++;
		  }
	  }
	  
	  way3sort(a,low,lt-1);
	  way3sort(a,gt+1,high);
	  
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