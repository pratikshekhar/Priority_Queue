package queue;
import java.util.ArrayList;

public class Queue {
	ArrayList<Node> list = new ArrayList<>();

	public Node Extract_Max(ArrayList<Node> list) {

		if(list.isEmpty()){
			return null;
		}

		Node max = list.get(0);
		list.set(0, list.get(list.size()-1));
		list.set(list.size()-1, max);
		list.remove(list.size()-1);
		build_max_heap(list);

		if(!list.isEmpty()){

			System.out.println("\nThe new array after removing the highest priority key:");
			System.out.println("\nKey-Value");
			for(int m=0;m<list.size();m++){
				System.out.print("\n"+list.get(m).getKey()+" ");
				System.out.print(list.get(m).getValue()+" ");
			}
		}
		return max;
	}

	public int Maximum(ArrayList<Node> list) {
		int max=0;
		for(int i=0;i<list.size();i++){
			max=list.get(0).getValue();
		}
		return max;
	}

	public void Insert(ArrayList<Node> list, int key, int value) {
		Node n = new Node(key, value);
		list.add(n);
		for(int j=0;j<list.size();j++){
			System.out.print(" Key: "+list.get(j).getKey()+"  Value: "+list.get(j).getValue()+"   ");
		}
		System.out.println("");
		build_max_heap(list);
	}
	

	public static void build_max_heap(ArrayList<Node> list){

		for(int i=(list.size()/2);i>=0;i--){
			max_heapify(list,i);
		}	
	}

	private static void max_heapify(ArrayList<Node> list, int i) {

		int leftchild = (2*i)+1;
		int rightchild = (2*i)+2;
		Integer largest =i;

		if(leftchild<=(list.size()-1) && list.get(leftchild).getKey() > list.get(i).getKey())
			largest=leftchild;

		if(rightchild<=(list.size()-1) && list.get(rightchild).getKey()>list.get(largest).getKey())
			largest=rightchild;

		if (largest!=i){
			Node temp = list.get(i);
			list.set(i, list.get(largest));
			list.set(largest, temp);
			max_heapify(list,largest);
		}

	}

}
