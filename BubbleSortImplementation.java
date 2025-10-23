import java.util.Random;
class BubbleSort{
	static void bubblesort(int size, int [] list){
		int temp = 0;
		int swaps = 0;
		int iteration = 0;
		boolean flag;
		for(int i  = 0; i < size; i++){
			flag = false;
			for(int j = 1; j < size - i; j++){
				iteration++;
				if(list[j-1] > list[j]){
					temp = list[j-1];
					list[j-1] = list[j];
					list[j] = temp;
					swaps++;
					flag = true;
				}
			}
			if(!flag){
				break;
			}
		}
		System.out.printf("Sorted list:\n");
		for(int i = 0; i < size; i++){
			System.out.printf("%d, ", list[i]);
		}
		System.out.printf("\nSwaps: %d.\n", swaps);
		System.out.printf("Iterations: %d.\n", iteration);
	}
}

public class BubbleSortImplementation{
	public static void main(String[]args){
		BubbleSort bubbleSort = new BubbleSort();
		CreateList createList = new CreateList();
		int size = 20;
		bubbleSort.bubblesort(size, createList.createFirstList());
		bubbleSort.bubblesort(size, createList.createSecondList());
		bubbleSort.bubblesort(size, createList.createThirdList());
	}
}
