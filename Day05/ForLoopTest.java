public class ForLoopTest {

    public static void main(String[] args) {
        int i; 
        String[] chiles = {"jalapeno", "anaheim", "serrano", "TacoBell", "Chipotle"};
        
	for(i=0; i < chiles.length; i++) {
	    System.out.println(i);
	    System.out.println(chiles[i]);
	} 
    }
}
