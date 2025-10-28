class GnomeSort{
	static void gnomesort(int size, int[] list){
		int i = 0;
		int temp = 0;
		int swaps = 0;
		int passes = 0;
		int comparisons = 0;
		long startTime = 0;
		long elapsedTime = 0;
		double finalTime = 0;
		startTime = System.nanoTime();
		while(i < size){
			passes++;
			if(i == 0){
				i++;
			}
			if(list[i - 1] <= list[i]){
				i++;
				comparisons++;
			}
			else{
				temp = list[i];
				list[i] = list[i - 1];
				list[i - 1] = temp;
				i--;
				swaps++;
			}
		}
		elapsedTime = System.nanoTime() - startTime;
		finalTime = elapsedTime / 1_000_000_000.0;
		System.out.printf("Ordenado (Gnome Sort):\n");
		for(int index = 0; index < size; index++){
			System.out.printf("%d, ", list[index]);
		}
		System.out.printf("\nTrocas: %d.\n", swaps);
		System.out.printf("Comparações: %d.\n", comparisons);
		System.out.printf("Iterações: %d.\n", passes);
		System.out.printf("Tempo: %fs.\n", finalTime);
	}
}

public class GnomeSortImplementation{
	public static void main(String[]args){
		GnomeSort gnomeSort = new GnomeSort();
		CreateList createList = new CreateList();
		int size = 20;
		gnomeSort.gnomesort(size, createList.createFirstList());
		gnomeSort.gnomesort(size, createList.createSecondList());
		gnomeSort.gnomesort(size, createList.createThirdList());
	}
}
