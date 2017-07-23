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
	 //Check whether a is Empty
	 if(a.length == 0) return;)	  
	 //shuffle the data to random to make sure the data sequence factor affect the sort performance
	  List<Comparable> list_a = Arrays.asList(a);
	  Collections.shuffle(list_a);
	  
	  //Convert the List<Comparable> to back to Array Comparable[] a
	  sort(list_a.toArray(a),0,a.length - 1);

//	  sort(a,0,a.length-1);
  }
  
  public static void sort(Comparable[] a,int low,int high){
	
	  //one element array no need to sort,also check whether the low bigger than high		  
	  if(low >= high) return;
	  
	  //Partation the Array to get the Mid element position
	  int v_position = partation(a,low,high);

	  //Recursively sort the sub-array of left and right
	  sort(a,low,v_position-1);
	  sort(a,v_position+1,high);
	  
  }
  
  public static int partation(Comparable[] sub_a,int low,int high){
	 		  
	  int i=low,j=high;
	  
	  Comparable v = sub_a[low];
	  
	  while(i<j)
	  {
		  //Check pointer i always point to the bigger element	in left  
		  while((i<high) && less(sub_a[i],v)){
			  i++;
		  }
		  //Check pointer j always point to the smaller element in right
		  while((j>low) && less(v,sub_a[j])){
			  j--;
		  }
		  //Check whether the pointer has meet with each other
		  if(i>=j) {break;}
		  //Exchange the element to make sure left small and right big
		  exch(sub_a,i,j); 
		 		  
	  }
	  //As j always point to the smaller element in the end,so exchange the V with j to move the smaller element to left head
	  exch(sub_a,low,j);
	  //Return the V position 		  
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
	  
  }}

}
