public class ascendingSquareArrayFunction {

	public static int[] sortingArray(int [] numbers) {

	int[] square = new int[numbers.length];

	for(int count = 0; count < numbers.length; count++){
		square[count] = numbers[count] * numbers[count];
}
	int[] result = square; 

	for (int i = 0; i < result.length - 1; i++) {

	int currentSmallest = result[i];
	int currentSmallestIndex = i;

        for (int j = i + 1; j < result.length; j++) {

	if (currentSmallest > result[j]) {
	     currentSmallest = result[j];
	     currentSmallestIndex = j;
}
}
	if(currentSmallestIndex != i) {
	result[currentSmallestIndex] = result[i];
	result[i] = currentSmallest;
}
}
  	return result;
}
}
