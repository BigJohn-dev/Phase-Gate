 public class correspondingIndexFunction {

	public static String correspondingIndexIn(String[] numbers){

	int count = 0;
	String values = " ";

	for(int i = 0; i < numbers.length; i++){
	if (numbers[i] == "0") count += 1;	 
	values = numbers[0] + " appears " + count;
}
	return values;
	
}
}