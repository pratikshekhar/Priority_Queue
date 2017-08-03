//package queue;
//
//import java.util.ArrayList;
//
//public class Main {
//	public static void main(String args[]){
//		Queue pq = new Queue();
//		ArrayList<Node> list = new ArrayList<>();
//		ArrayList<Integer> returnsMaximum = new ArrayList<>();
//		ArrayList<Node> returnsAndRemovesMaximum = new ArrayList<>();
//
//		Integer[] key=new Integer[]{11,12,13,14,15,16,17,18,19,20};
//		Integer[] value=new Integer[]{16,14,10,8,7,9,3,2,4,1};
//		System.out.println("\nPrinting the priority queue with key value created:\n");
//		for(int j=0;j<key.length;j++){
//			pq.Insert(list,key[j], value[j]); //(list, key, value)
//		}
//
//		System.out.println("\nThe new array arranged according to the highest priority of the queue:");
//		System.out.println("\nKey-Value");
//		for(int k=0;k<list.size();k++){
//			System.out.print("\n"+list.get(k).getKey()+" ");
//			System.out.print(list.get(k).getValue()+" ");
//		}
//
//
//		System.out.println("");
//		while(!list.isEmpty()){
//
//			Node y=pq.Extract_Max(list);
//			int z=pq.Maximum(list);
//			returnsMaximum.add(z);
//			returnsAndRemovesMaximum.add(y);
//			if(!returnsAndRemovesMaximum.isEmpty()){
//				System.out.println("\nRemoved and returns the element of list associated with previous largest key: "+y.toString());
//			}
//			if(!returnsMaximum.isEmpty() && z!=0)
//				System.out.println("Returns the element of list with the latgest key: "+z);
//			else{
//				System.out.println("List empty - There is no element with the largest key ");
//				System.out.println("\nList empty - CAN NOT REMOVE ANYMORE ");
//			}
//
//		}
//	}
//}
