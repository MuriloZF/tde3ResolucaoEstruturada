class CocktailSort{
	public static void cocktailsort(int size, int[] list){
		int swaps = 0;
		int passes = 0;
		int comparisons = 0;
		int temp;
		int start = 0;
		int end = size - 1;
		long startTime = 0;
		long elapsedTime = 0;
		double finalTime = 0;
		boolean flag = true;
		startTime = System.nanoTime();
		while(flag){
			flag = false;
			passes++;
			for(int i = start; i < end; i++){
				comparisons++;
				if(list[i] > list[i + 1]){
					temp = list[i];
					list[i] = list[i + 1];
					list[i + 1] = temp;
					swaps++;
					flag = true;		
				}
			}
			if(!flag){
				break;
			}
			flag = false;
			end--;
			for(int i = end; i > start; i--){
				comparisons++;
				if(list[i] < list[i -1]){
					temp = list[i];
					list[i] = list[i - 1];
					list[i -1] = temp;
					swaps++;
					flag = true;
				}
			}
			start++;
		}
		elapsedTime = System.nanoTime() - startTime;
		finalTime = elapsedTime / 1_000_000_000.0;
		System.out.printf("Ordenado (Cocktail Sort):\n");
		for(int i = 0; i < size; i++){
			System.out.printf("%d, ", list[i]);
		}
		System.out.printf("\nTrocas: %d.\n", swaps);
		System.out.printf("Comparações: %d.\n", comparisons);
		System.out.printf("Iterações: %d.\n", passes);
		System.out.printf("Tempo: %fs.\n", finalTime);
	} 
}

public class CocktailSortImplementation{
	public static void main(String[]args){
		CreateList createList = new CreateList();
		CocktailSort cocktailSort = new CocktailSort();
		int size = 20;
		cocktailSort.cocktailsort(size, createList.createFirstList());
		cocktailSort.cocktailsort(size, createList.createSecondList());		
		cocktailSort.cocktailsort(size, createList.createThirdList());
	}
}
