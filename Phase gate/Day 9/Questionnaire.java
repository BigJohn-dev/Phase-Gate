public class Questionnaire {

	static void questions() {

	{"question": "What is the opposite of black?",
	"options": "A. White", "B. Red", "C. Green", "D. All of the above",
	"answer": "D"
},
	{"question": "We should alwaly accept everything at face value?",
	"options": "A. No", "B. Yes", "C. Maybe", "D. Sometimes",
	"correct": "A"
},
	{"question": "Fighting is a crime; fight for life, is it a crime?",
	"options": "A. It depends", "B. No", "C. Yes", "D. Perspective matters here",
	"correct": "D"
},
	{"question": "What is the opposite of Man?",
	"options": "A. Woman", "B. Boy", "C. Men", "D. A and B"],
			"correct": "A"
		},
		{
			"question": "The main character in the popular movie JOHN WICK is...?",
			"options": ["A. Keanue Reaves", "B. John Cena", "C. Idris Elba", "D. Gibbs White"],
			"correct": "A"
		},
		{
			"question": "What is the sum of 14 and 62?",
			"options": ["A. 146", "B. 46", "C. 76", "D. I don't know"],
			"correct": "C"
		},
		{
			"question": "What creature has its exo-skeletal system as its outer skin?",
			"options": ["A. Pig", "B. Crocodile", "C. Crabs", "D. All of the above"],
			"correct": "C"
		},
		{
			"question": "What is element has the chemical symbol 'O2'? ,
			"options": ["A. Sodium", "B. Orange", "C. Oxygen", "D. Calcium"],
			"correct": "C"
		},
		{
			"question": "What is the chemical formula for water? ",
			"options": ["A. H2O", "B. O2", "C. NaCl", "D. CO2"],
			"correct": "A"
		},
		{
			"question": "What ocean is the largest in the world?",
			"options": ["A. Atlantic", "B. Indiana", "C. Pacific", "D. Artic"],
			"correct": "A"
		}

};
	public static void printQuestions() {
	System.out.println("-----------------------------");
	for(int i = 0; i < 9; i++) {
	  for(int j = 0; j < questions.length; j++) {
		System.out.print(questions[i][j] + "  ");
}
	System.out.println();
	System.out.println("-----------------------------");
}
}


	public static void main(String[] args) {
	printQuestions();
	


}
}