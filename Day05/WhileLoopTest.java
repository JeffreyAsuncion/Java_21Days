public class WhileLoopTest {

    public static void main(String[] args) {
    
	int count = 0;
	int[] array1 = {2, 4, 6, 8, 10, 12, 14, 16};
	int[] array2 = {1};

        while (count < array1.length) {
	
	    if (array1[count] == 0) {
	        break;
	    }
	    array2[count] = array1[count];
	    count++;
	}
    }
}
