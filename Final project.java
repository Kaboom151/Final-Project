
import org.junit.jupiter.api.Test;
import java.util.Scanner;
/** 
 * Abstract class representing a math test
 *
 * provides method to generate math random math questions 
 * @author student
 *
 */
abstract class MathTest {
	/**
	 * Generates math question
	 * 
	 * @return the results of generated questions.
	 */
    abstract int generateQuestion(); 
    
    public static void main(String[] args) {
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
                i--; 
            }
        }
        
        
        int correctCount = 0;
        for (int i = 0; i < 10; i++) {
            if (userAnswers[i] == correctAnswers[i]) {
                correctCount++;
            }
        }
        
        System.out.println("You answered " + correctCount + " out of 10 questions correctly.");
    }
}
class MathTestTest {
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
    
	private void assertEquals(int i, int correctCount, String string) {
		// TODO Auto-generated method stub
        
	}
}
