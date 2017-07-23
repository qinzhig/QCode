
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.TreeMap;

public class ST<Key extends Comparable<Key>,Value>{

	private TreeMap<Key, Value> st;
	
	public ST(){
		st = new TreeMap<Key,Value>();
		
	}
	
	public int size(){
		return st.size();
	}
	
	public boolean isEmpty(){
		return size() == 0;
	}
	
	public Value get(Key key){
		if(key == null) throw new IllegalArgumentException("argument get() is null");
		return st.get(key);
	}
	
	public void put(Key key,Value val){
		if(key == null) throw new IllegalArgumentException("argument put() is null");
		if(val == null) st.remove(key);
		else st.put(key, val);
	}
	
	public void delete(Key key){
		if (key == null) throw new IllegalArgumentException("argument delete() is null");
		st.remove(key);
	}
	
	public boolean contains(Key key){
		if(key == null) throw new IllegalArgumentException("argument contains() is null");
		return st.containsKey(key);
	}
	
	public Iterable<Key> keys(){
		return st.keySet();
	}
	
	public Key min(){
		if (isEmpty()) throw new NoSuchElementException("Called min with empty symbol table");
		return st.firstKey();
	}
	
	public Key max(){
		if (isEmpty()) throw new NoSuchElementException("Called max with empty symbol table");
		return st.lastKey();
	}
	
	public Key ceiling(Key key){
		if(key == null) throw new IllegalArgumentException("argument ceiling() is null");
		Key k = st.ceilingKey(key);
		
		if(k == null) throw new NoSuchElementException("All keys are less than" + key);
		return k;
	}
	
	public Key floor(Key key){
		if(key == null) throw new IllegalArgumentException("argument floor() is null");
		Key k = st.floorKey(key);
		
		if(k == null) throw new NoSuchElementException("All keys are greater than" + key);
		return k;
	}
	
}