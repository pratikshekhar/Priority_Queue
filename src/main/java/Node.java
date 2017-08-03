package queue;

public class Node {

	private int key;
	private int value;


	Node(int key, int value) {
		setKey(key);
		setValue(value);
	}


	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Node [key=" + key + ", value=" + value + "]";
	}
}
