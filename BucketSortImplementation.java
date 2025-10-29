class BucketSort{
    static void bucketsort(int size, int [] list){
        int swaps = 0;
        int passes = 0;
        int comparisons = 0;
        long startTime = 0;
        long elapsedTime = 0;
        double finalTime = 0;
        startTime = System.nanoTime();
        int minValue = list[0];
        int maxValue = list[0];
        for(int i = 1; i < size; i++){
            comparisons++;
            if(list[i] < minValue){
                minValue = list[i];
            }
            comparisons++;
            if(list[i] > maxValue){
                maxValue = list[i];
            }
        }
        int bucketCount = size;
        int[][] buckets = new int[bucketCount][size];
        int[] bucketSizes = new int[bucketCount];
        int range = maxValue - minValue + 1;
        for(int i = 0; i < size; i++){
            int bucketIndex = (int)((long)(list[i] - minValue) * bucketCount / range);
            if(bucketIndex >= bucketCount){
                bucketIndex = bucketCount - 1;
            }
            buckets[bucketIndex][bucketSizes[bucketIndex]] = list[i];
            bucketSizes[bucketIndex]++;
        }
        for(int i = 0; i < bucketCount; i++){
            int bucketSize = bucketSizes[i];
            for(int j = 1; j < bucketSize; j++){
                passes++;
                int key = buckets[i][j];
                int k = j - 1;
                while(k >= 0){
                    comparisons++;
                    if(buckets[i][k] > key){
                        buckets[i][k + 1] = buckets[i][k];
                        k--;
                    }
                    else{
                        break;
                    }
                }
                buckets[i][k + 1] = key;
            }
        }
        int index = 0;
        for(int i = 0; i < bucketCount; i++){
            for(int j = 0; j < bucketSizes[i]; j++){
                if(list[index] != buckets[i][j]){
                    list[index] = buckets[i][j];
                    swaps++;
                }
                index++;
            }
        }

        elapsedTime = System.nanoTime() - startTime;
        finalTime = elapsedTime / 1_000_000_000.0;
        System.out.printf("Ordenado (BucketSort):\n");
        for(int i = 0; i < size; i++){
            System.out.printf("%d, ", list[i]);
        }
        System.out.printf("\nTrocas: %d.\n", swaps);
        System.out.printf("Comparações: %d.\n", comparisons);
        System.out.printf("Iterações: %d.\n", passes);
        System.out.printf("Tempo: %fs.\n", finalTime);
    }
}

public class BucketSortImplementation{
    public static void main(String[]args){
        BucketSort bucketSort = new BucketSort();
        CreateList createList = new CreateList();
        int size = 20;
        bucketSort.bucketsort(size, createList.createFirstList());
        bucketSort.bucketsort(size, createList.createSecondList());
        bucketSort.bucketsort(size, createList.createThirdList());
    }
}
