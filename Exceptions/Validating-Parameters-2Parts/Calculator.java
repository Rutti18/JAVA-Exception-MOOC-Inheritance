//  EXERCISE - Validating parameters (2 parts)

public class Calculator {

    public int factorial(int num) {
        if(num >= 0){
               int answer = 1;
        for (int i = 1; i <= num; i++) {
            answer *= i;
        }
        return answer;
        } else {
            throw new IllegalArgumentException("error factortial");
        }

    }

    public int binomialCoefficent(int setSize, int subsetSize) {
        
        if((setSize >=0 && subsetSize >=0) && subsetSize <= setSize){
            
             int numerator = factorial(setSize);
        int denominator = factorial(subsetSize) * factorial(setSize - subsetSize);

        return numerator / denominator;
         } else {
            throw new IllegalArgumentException("error factortial");
        }
    }
    
    public static void main(String[] args) {
		Calculator  calc = new Calculator();
		calc.factorial(3); // valid input
		calc.factorial(-1); //invalid input
	}
    
}