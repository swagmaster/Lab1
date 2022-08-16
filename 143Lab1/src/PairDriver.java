public class PairDriver {

	public static void main(String[] args) {
		
		Pair pair = new Pair();
		
		System.out.print(pair.toString());
		//a call to a private method in pair claims that it is "never used locally"
	}
	

}