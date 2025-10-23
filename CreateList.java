public class CreateList{

	public static String arrayToString(int[] list, int size){
		String s = "";
		for(int i = 0; i < size; i++){
			s += list[i];
			if (i < size - 1){
				s += ", ";
			}
		}
		return s;
	}

	public static int[] createFirstList(){
		int size = 20;
		int[] list1 = {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
		System.out.printf("Lista 1 Original: ");
		System.out.println(arrayToString(list1, size));
		return list1;
	}
	
	public static int[] createSecondList(){
		int size = 20;
		int[] list2 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
		System.out.printf("Lista 2 Original: ");
		System.out.println(arrayToString(list2, size));
		return list2;
	}
	
	public static int[] createThirdList(){
		int size = 20;
		int[] list3 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};
		System.out.printf("Lista 3 original: ");
		System.out.println(arrayToString(list3, size));
		return list3;
	}
	public static void main(String[]args){
		createFirstList();
		createSecondList();
		createThirdList();
	}
}
