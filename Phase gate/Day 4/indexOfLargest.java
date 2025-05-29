public class indexOfLargest{

	public static void indexOf(){

	for (int i = 0; i < numbers.length - 1; i++) {

	int currentMin = numbers[i];
	int currentMinIndex = i;

        for (int j = i + 1; j < numbers.length; j++) {

	   if (currentMin > numbers[j]) {
		currentMin = numbers[j];
		currentMinIndex = j;
}
}
	if(currentMinIndex != i) {
	numbers[currentMinIndex] = numbers[i];
	numbers[i] = currentMin;
}
}


	public static void main(String[] args){

	int[] numbers = {{2, 5, 7}, {9, 1, 3}, {6, 4, 8}};
	indexOf();

}

}

