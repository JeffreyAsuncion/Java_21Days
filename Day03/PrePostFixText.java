public class PrePostFixText {

    public static void main(String[] args) {
    
        int x = 0;
	int y = 0;

	System.out.println("x and y are " + x + " and " + y );
	
	x++;
	System.out.println("x++ results in " + x );
	
	++x;
	System.out.println("++x results in " + x );

	System.out.println("Resetting x back to 0.");
	x = 0;

	System.out.println("-------------");
	y = x++;
	System.out.println("y = x++ (postfix) results in: ");
	System.out.println("x is " + x);
	System.out.println("y is " + y);
	System.out.println("-------------");

	y = ++x;
	System.out.println("y = ++ x (prefix) results in: ");
	System.out.println("x is " + x);
	System.out.println("y is " + y);
	System.out.println("-------------");


    }
}
