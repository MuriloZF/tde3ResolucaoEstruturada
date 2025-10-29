class SelectionSort{
	static void selectionSort(int size, int[] list){
		int swap = 0;
		int passes = 0;
		int comparisons = 0;
		long startTime = 0;
		long elapsedTime = 0;
		double finalTime = 0;
		startTime = System.nanoTime();
		for(int i = 0; i < size - 1; i++){
			passes++;
			int minIndex = i;
			for(int j = i + 1; j < size; j++){
				comparisons++;
				if(list[j] < list[minIndex]){
					minIndex = j;
				}
			}
			if(minIndex != i){
					int temp = list[i];
					list[i] = list[minIndex];
					list[minIndex] = temp;
					swap += 2;
				}
		}
		elapsedTime = System.nanoTime() - startTime;
		finalTime = elapsedTime / 1_000_000_000.0;
		System.out.printf("Ordenado (Selection Sort):\n");
		for(int i = 0; i < size; i++){
			System.out.printf("%d, ", list[i]);
		}
		System.out.printf("\nTrocas: %d.\n", swap);
		System.out.printf("Comparações: %d.\n", comparisons);
		System.out.printf("Iterações: %d.\n", passes);
		System.out.printf("Tempo: %fs.\n", finalTime);
	}

}

public class SelectionSortImplementation{
	public static void main(String[]args){
		SelectionSort selectionSort = new SelectionSort();
		CreateList createList = new CreateList();
		int size = 20;
		selectionSort.selectionSort(size, createList.createFirstList());
		selectionSort.selectionSort(size, createList.createSecondList());
		selectionSort.selectionSort(size, createList.createThirdList());
	}
}
