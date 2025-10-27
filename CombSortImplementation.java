class CombSort{
	static void combsort(int size, int [] list){
		int temp = 0;
		int swaps = 0;
		int iteration = 0;
		int gap = size;
		double shrink = 1.3;
		long startTime = 0;
		long elapsedTime = 0;
		double finalTime = 0;
		boolean flag = true;
		startTime = System.nanoTime();
		while(gap > 1 || flag){
			gap = (int)(gap / shrink);
			if(gap < 1){
				gap = 1;
			}
			flag = false;
			iteration++;
			for(int j = 0; j + gap < size; j++){
				if(list[j] > list[j + gap]){
					temp = list[j + gap];
					list[j + gap] = list[j];
					list[j] = temp;
					swaps++; flag = true;
				}	
			}
		}
		elapsedTime = System.nanoTime() - startTime;
		finalTime = elapsedTime / 1_000_000_000.0;
		System.out.printf("Ordenado (Comb Sort):\n");
		for(int i = 0; i < size; i++){
			System.out.printf("%d, ", list[i]);
		}
		System.out.printf("\nTrocas: %d.\n", swaps);
		System.out.printf("Iterações: %d.\n", iteration);
		System.out.printf("Tempo: %fs.\n", finalTime);
	}
}

public class CombSortImplementation{
	public static void main(String[]args){
		CombSort combSort = new CombSort();
		CreateList createList = new CreateList();
		int size = 20;
		combSort.combsort(size, createList.createFirstList());
		combSort.combsort(size, createList.createSecondList());
		combSort.combsort(size, createList.createThirdList());
	}
}
