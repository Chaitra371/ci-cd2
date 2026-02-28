package cdv58;

public class Calculator {
		public static int calculator(int a,int b,char op) {
			if( op == '+') {
				return a+b;
			}
			else {
				return 0;
			}
		}

		public static void main(String[] args) {
			int ad=10;
			int b=20;
			char op = '+';
			int cal = calculator(a,b,op);
			System.out.println(cal);
			System.out.println("Completed");

		}

	}

