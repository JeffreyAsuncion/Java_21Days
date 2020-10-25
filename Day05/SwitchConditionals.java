public class SwitchConditionals {

    public static void main(String[] args) {
    
        int arg1, arg2;
	float sum;
        char oper;

	arg1 = 10;
	arg2 = 20;
	oper = '*';
	
	sum = 0;


	if (oper == '+'){
		sum = arg1 + arg2;
	}
	else if (oper == '-') {
		sum = arg1 - arg2;
	}
	else if (oper == '*') {
		sum = arg1 * arg2;
	}
	else if (oper == '/'){
		sum = arg1 / arg2;
	}
	System.out.println(sum);
    }
}
