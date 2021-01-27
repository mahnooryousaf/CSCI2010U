import java.util.*;

public abstract class Hashtable<T> {
  protected int capacity = 0;
  private List<String> keys = null;
  private List<T> values = null;

  private int probeCount = 0;

  public int getProbeCount() {
    return this.probeCount;
  }

  public void resetProbeCount() {
    this.probeCount = 0;
  }

  public Hashtable(int capacity) {
    this.keys = new ArrayList<String>();
    for (int i = 0; i < capacity; i++) {
      this.keys.add(null);
    }
    this.values = new ArrayList<T>();
    for (int i = 0; i < capacity; i++) {
      this.values.add(null);
    }
    this.capacity = capacity;
  }

  public int hash(String key) {
    int sum = 0;
    for (int i = 0; i < key.length(); i++) {
      sum += (int)key.charAt(i);
    }
    return sum % capacity;
  }

  public abstract int rehash(int previousHash);

  public void insert(String key, T value) {
	  
    // determine the hash
    // TODO
	  int Index = this.hash(key);
    // if the hash is taken, continuously until a free space
    // is found
    // TODO
	  String head = keys.get(Index); 
	  while(head!=null) {
		  	probeCount++;
			Index = rehash(Index);
			head = keys.get(Index); 
		  
	  }
    // insert the value at that position
    // TODO
	  keys.add(Index,key);
	  values.add(Index, value);
  }
}