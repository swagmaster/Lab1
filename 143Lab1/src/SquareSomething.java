public class SquareSomething {

	int integerNum;
	double doubleNum;
	float floatNum;
	
	public SquareSomething(int newIntegerNum) {
		integerNum = newIntegerNum;
	}
	
	public SquareSomething(double newDoubleNum) {
		doubleNum = newDoubleNum;
	}
	
	public SquareSomething(float newFloatNum) {
		floatNum = newFloatNum;
	}
	
	public int getIntegerNumSq(int integerNum) {
		return integerNum*integerNum;
	}
	
	public double getDoubleNumSq(double doubleNum) {
		return doubleNum*doubleNum;
	}
	
	public float getFloatNumSq(float floatNum) {
		return floatNum*floatNum;
	}
}