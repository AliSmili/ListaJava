
public class Bubble {

	public static void main(String[] args) {
		
int array [] = {5,7,2,1,9,0,-4};
		
		int arrayOrd[] = BubbleSort(array);
		
		for(int i = 0 ; i < arrayOrd.length ; i++){
			System.out.println(arrayOrd[i] + ",");
		}
		
	}
	
	public static int[] BubbleSort(int[] num) {
		int j;
		boolean flag = true; // set flag to true to begin first pass
		int temp; // holding variable

		while (flag) {
			flag = false; // set flag to false awaiting a possible swap
			for (j = 0; j < num.length - 1; j++) {
				if (num[j] > num[j + 1]) 
				{
					temp = num[j]; // swap elements
					num[j] = num[j + 1];
					num[j + 1] = temp;
					flag = true; // shows a swap occurred
				}
			}
		}
		return num;
	}
}
