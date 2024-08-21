# Final-Project
## I am creating this quick addition test as part of a broader feature to have randomly generated tests at the teachers disposal to save time making tests.
## Main file to run would me MathTest.java.
 ## code example : public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] correctAnswers = new int[10]; 

        
        for (int i = 0; i < 10; i++) {
            int num1 = (int) (Math.random() * 100);
            int num2 = (int) (Math.random() * 100);
            correctAnswers[i] = num1 + num2;
            System.out.println("Question " + (i + 1) + ": What is " + num1 + " + " + num2 + "?");
        }

        
        int[] userAnswers = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter your answer for question " + (i + 1) + ": ");
            try {
                userAnswers[i] = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.nextLine(); 

  # I am using JUnit to test.   class MathTestTest {
	@Test
	public void test() {
		MathTest mathTest = new AdditionTest();
		int[] userAnswers  = { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
		int correctCount = 0;
		for (int i = 0; i < 10; i++) {
			int correctAnswer = mathTest.generateQuestion();
			if (userAnswers[i] == correctAnswer) {
				correctCount++;
			}
		}
		assertEquals(10, correctCount, "All answers should be correct");
	}
 # Contributors: I have had my friends Patrick, Ben, Dylan, Brent, and Kyle help me with ideas and features, and I have received any and all help I have needed from Jason Adams.
