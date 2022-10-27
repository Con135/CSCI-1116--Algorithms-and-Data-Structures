public class Exercise24_5 {
	public static void main(String[] args) {
		GenericQueue<String> queue = new GenericQueue<String>();
		queue.enqueue("A");
		queue.enqueue("B");
		queue.enqueue("C");
		
		for(int count = 0; count < queue.getSize(); count++) {
			System.out.println(queue.get(count));
		}
		
		System.out.println("");
		
		queue.dequeue();
		
		for(int count = 0; count < queue.getSize(); count++) {
			System.out.println(queue.get(count));
		}
	}
}
	class GenericQueue <E> extends java.util.LinkedList<E> {
	public void enqueue(E e) {
		this.addLast(e);
	}
	
	public E dequeue() {
		return removeFirst();
	}
	
	public int getSize() {
		return size();
	}
	
	@Override
	public String toString() {
		return "Queue: " + toString();
	}
}