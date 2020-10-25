public class ConditionalOperator {

    public static void main(String[] args) {
    
        int x, y;

	x = 10;
	y = 100;

	int smaller = x < y ? x : y;
        // conditional operator
	// test ? trueresult : falseresult
	System.out.println(smaller);
    }
}
