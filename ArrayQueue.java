public class ArrayQueue implements Queue{
	Object[] arr = new Object[10];
	int head = 0;
	int tail = 0;

	public void enqueue(Object obj){
		try{
			Assert.not_false(tail + 1 != head);
		}catch(Exception e){
			growArray();
		}
		arr[tail++] = obj;
		if(tail == arr.length){
			tail = 0;
		}		
	}

	public Object dequeue(){
		Assert.not_false(head == tail);
		return arr[head++];
	}

	public boolean empty(){
		if(head == tail){
			return true;
		}
		return false;
	}

	public void growArray(){
		Object[] temp = new Object[arr.length*2];
		tail = 0;
		for(int i = this.head; i < arr.length + head; i++){
			temp[tail++] = arr[i%arr.length];
		}
		head = 0;
		arr = temp;
	}
}