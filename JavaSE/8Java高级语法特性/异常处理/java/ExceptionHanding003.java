/*����catch�Ӿ�
 * 
 	���������ܻ��������쳣����ô��ָ����������� catch �Ӿ䣬ÿ�� catch �Ӿ䶼���Բ���ͬ���͵��쳣
 	���׳��쳣ʱ����˳����ÿ�� catch ��䣬��ִ�����ͺ��쳣�ܹ�ƥ��ĵ�һ�� catch �Ӿ䡣
 	
 	ִ����һ�� catch �Ӿ�󣬻�������� catch ��䣬������ִ��֮������
 	
 	��ʹ�ö��� catch ���ʱ��Ҫ�ص��ס�쳣�������λ�����г���֮ǰ��
 	��Ϊʹ����ĳ����� catch ���Ჶ�����������������������쳣����
	
 	
 */
public class ExceptionHanding003 {

	public static void main(String[] args) {
		try {
			int a = args.length;
			System.out.println("a = " + a);						//0
			int b = 42 / a;
			int[] c = {1};
			c[42] = 99;											
		} catch(ArithmeticException e) {
			System.out.println("��һ�� catch ���쳣" + e);		//��һ�� catch ���쳣java.lang.ArithmeticException: / by zero
		//�쳣�ĳ��� Exception ���λ���쳣����֮ǰ����ô֮������ཫ�ᱨ��
		//��ô�봦���������ͱ���Ҫ�����쳣��˳���ó��� Exception �������� catch ֮��
//		} catch(Exception e) {
//			System.out.println("һ��������쳣");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�ڶ��� catch ���쳣" + e);
		}
		System.out.println("֮��Ĵ����");						//֮��Ĵ����
	}

}
