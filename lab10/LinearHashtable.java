public class LinearHashtable<T> extends Hashtable<T>{

	public LinearHashtable(int capacity) {
		super(capacity);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int rehash(int previousHash) {
		previousHash = previousHash +1;
		return previousHash % capacity;
	}

}