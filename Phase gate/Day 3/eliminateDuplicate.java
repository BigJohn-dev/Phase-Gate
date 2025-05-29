public class eliminateDuplicate {
	public static void main(String[] args){

	int[] numbers = {1, 2, 2, 3, 4, 4, 5, 6};


	public static void eliminateDuplicateIn(){
	
	int values = [];
	int result = 0;
	for (int count = 0; count < numbers.length; count++) {
	   for(int counter = count; counter < numbers.length; counter++){
		if (counter == numbers[count]) {
		result += numbers[count];
	values.append(result);
}
}
}
}

	System.out.println(eliminateDuplicate.eliminateDuplicateIn());
}

}