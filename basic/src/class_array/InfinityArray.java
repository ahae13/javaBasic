package class_array;

public class InfinityArray {

	private int[] arr = new int[5];
	private int currentIdx;
	//private int length;
	
	public void add(int num) {
		if(currentIdx == 5) {
			int[] temp = new int[arr.length + 10];
			
			for(int i = 0; i < arr.length; i++) {
				temp[i] = arr[i];
			}
			arr = temp;
		}
		
		arr[currentIdx++] = num;
	}
	
	public int get(int index) {
		return arr[index];
	}
	
	public int length() {
		return currentIdx;
	}
	
	public int remove(int idx) {
		for(int i = idx+1; i < arr.length; i++) {
			arr[i-1] = arr[i];
		}
		currentIdx--;
		
		return get(idx);
	}
}
