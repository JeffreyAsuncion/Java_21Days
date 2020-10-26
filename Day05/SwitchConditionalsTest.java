public class SwitchConditionalsTest {

    public static void main(String[] args) {
    
        int arg1, arg2;
	float sum;
        char oper;

	arg1 = 10;
	arg2 = 20;
	oper = '*';
	
	sum = 0;

        switch (oper) {
		case '+':
			sum = arg1 + arg2;
			break;
		case '-':
			sum = arg1 - arg2;
			break;
		case '*':
			sum = arg1 * arg2;
			break;
		case '/':
			sum = arg1 / arg2;
			break;
	}
	System.out.println(sum);
    }
}
