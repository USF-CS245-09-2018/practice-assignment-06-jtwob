public class ArrayStack implements Stack{
	Object[] arr = new Object[10];
	int top = -1;

	public Object pop(){
		Assert.not_false(!empty());
		return arr[top--];
	}

	public void push(Object obj){
		try{
			Assert.not_false(top + 1 != arr.length);
		}catch(Exception e){
			growArray();
		}
		arr[++top] = obj;
		
	}

	public boolean empty(){
		if(top == -1){
			return true;
		}
		return false;
	}

	public void growArray(){
		Object[] temp = new Object[arr.length*2];
		for(int i = top; i < arr.length -1; i++){
			temp[i] = arr[i];
		}
		arr = temp;
	}

	public Object peek(){
		Object temp = pop();
		push(temp);
		return temp;
	}

}