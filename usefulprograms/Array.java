import java.util.Arrays;

public class Array{
	private int len;
	private int[] array = new int[400];
	public Array(int ...arr) {
		len = arr.length;
		for (int x = 0; x < len; x++){
			array[x] = arr[x];
		}
	}
	public String toString(){
		String stringToReturn = "[";
		for (int x = 0; x < len; x++){
			stringToReturn = stringToReturn + Integer.toString(array[x]);
			if (x < len-1){
				stringToReturn = stringToReturn + ",";
			}
		}
		stringToReturn = stringToReturn + "]";
		return stringToReturn;
	}
	public int size(){
		return len;
	}
	public int get(int x){
		if (x < len){
			return array[x];
		}else {
			return -1;
		}
	}
	public boolean equals(int[] anotherArr){
		return Arrays.equals(array, anotherArr);
	}
	public void append(int arg){
		array[len] = arg;
		len++;
	}
	public void remove(int arg){
		int foundIndex = 0;
		for (int x = 0; x < len; x++){
			if (array[foundIndex] == arg){
				break;
			}
			foundIndex++;
		}
		int removedElement = array[foundIndex];
		for (int x = foundIndex; x < len; x++){
			array[x] = array[x+1];
		}
		len--;
	}
	public void removeIndex(int index){
		remove(array[index]);
	}
	public void sort(){
		int lastElem = array[len-1];
		int currentElem;
		for (int x = 0; x < len; x++){
			currentElem = array[x];
			if (currentElem > array[x+1]){
				array[x+1] = currentElem;
				array[x] = array[x+1];
			}
		}
	}
}
