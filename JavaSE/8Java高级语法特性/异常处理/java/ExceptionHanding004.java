/*Ƕ�׵� try ���
 *
	try ����Ƕ�ף�һ��try������λ��һ��try����У�ÿ������ try ���ʱ���쳣�������ľͻᱻ�����ջ��
	����ڲ��try���û��Ϊ�ض����쳣�ṩcatch������򣬶�ջ�ͻᵯ����try��䣬�����һ��try����catch�������
	һֱ���ܹ�ƥ���catch��䣬���Ǽ��������Ƕ�׵� try���
	
	���û���ҵ�ƥ���catch��䣬JAVA����ʱϵͳ�ᴦ���쳣
	
 */
public class ExceptionHanding004 {
	public static void main(String[] args) {
		try {
			int a = args.length;
			int b = 42 / a;
			System.out.println("a = " + a);
		
			try {
				if(a == 1) {
					a = a / (a - a);
				}
				
				if(a == 2) {
					int[] c = {1};
					c[42] = 99;
				}
				
				} catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("�ڲ�try catch���" + e);
				 }
			
			} catch(ArithmeticException e) {
				System.out.println("�ⲿtry catch���" + e);			//�ⲿtry catch���java.lang.ArithmeticException: / by zero
	
			}
		
		}
	}




























