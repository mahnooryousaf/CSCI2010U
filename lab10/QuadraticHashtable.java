public class QuadraticHashtable<T> extends Hashtable<T>{

	public QuadraticHashtable(int capacity) {
		super(capacity);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int rehash(int previousHash) {
		previousHash = previousHash * previousHash;
		return previousHash % capacity;
	}

}