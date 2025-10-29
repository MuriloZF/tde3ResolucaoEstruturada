class BubbleSort{
	static void bubblesort(int size, int [] list){
		int temp = 0;
		int swaps = 0;
		int passes = 0;
		int comparisons = 0;
		long startTime = 0;
		long elapsedTime = 0;
		double finalTime = 0;
		boolean flag;
		startTime = System.nanoTime();
		for(int i  = 0; i < size; i++){
			flag = false;
			passes++;
			for(int j = 1; j < size - i; j++){
				comparisons++;
				if(list[j-1] > list[j]){
					temp = list[j-1];
					list[j-1] = list[j];
					list[j] = temp;
					swaps += 2;
					flag = true;
				}
			}
			if(!flag){
				break;
			}
		}
		elapsedTime = System.nanoTime() - startTime;
		finalTime = elapsedTime / 1_000_000_000.0;
		System.out.printf("Ordenado (Bubble Sort):\n");
		for(int i = 0; i < size; i++){
			System.out.printf("%d, ", list[i]);
		}
		System.out.printf("\nTrocas: %d.\n", swaps);
		System.out.printf("Comparações: %d.\n", comparisons);
		System.out.printf("Iterações: %d.\n", passes);
		System.out.printf("Tempo: %fs.\n", finalTime);
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
