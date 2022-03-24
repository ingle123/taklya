package ifelse;

public class NestedIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 30;
		int b = 20;
		int c = 50 ;
		
		//if (b>a) {
		//	System.out.println("b is greater than a");
		//}
		//	if (b>a && b>c) {
			//System.out.println("b is greatest");
			
			//}
		
		if(a>b) {
			System.out.println("a is greater than b");
			if(a>c) {
				System.out.println("a is greater than c");
			}else {
				if(a==c)
				System.out.println("a is equal to c");
				else
					System.out.println("a is smaller than c");
			}	
		}else {
			if(a==b) {
				System.out.println("a is equal to b");
			}else {
				System.out.println("a is smaller than b");
			}
		}
	}
		
		}
	


