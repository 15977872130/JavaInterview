/*ʹ�� try �� catch
 * 
 	JAVA�ṩ��Ĭ���쳣�����������ã�����ͨ������ϣ���Լ������쳣
 		�Լ������������ŵ㣺1�������޸����� 2����ֹ�����Զ���ֹ
 		
 	����ʹ�� try{ }catch(){ } ��ʽ������ܻ�����쳣�Ĵ����
 	
 		try����װϣ�����ӵĴ���
 		catch��ָ��ϣ��������쳣����
 		
 		try {
 			Ҫ���ӵĴ����;
 		} catch(���ֵ��쳣1) {
 			���쳣�Ĵ���ʽ;
 		} catch(���ֵ��쳣2) {
 			���쳣�Ĵ���ʽ;
 		} catch(���ֵ��쳣3) {
 			���쳣�Ĵ���ʽ;
 		} ...
 	
 	��ʽ�쳣��������Ϣ��Throwable ��д�ˣ���Object��toString()�������Ӷ����Է���һ�������쳣�������ַ���
 	
 */
public class ExceptionHanding002 {

	public static void main(String[] args) {
		int d, a;
		// try �Լ� catch ��乹����һ����Ԫ
		try {
			// try �����һ���׳����쳣����ô���ͻ���ֹ���в���ת�� catch �������
			d = 0;
			a = 42 / d;
			System.out.println("������䲻�����");
			// catch ����齫һֱ��������
			// catch �Ӿ����������������֮ǰ try ���ָ������Щ����ڣ����ܲ���������һ�� try ����׳����쳣��Ƕ��try������⣩ 
		} catch(ArithmeticException e) {
			System.out.println("�ڳ��������г�����0");				//�ڳ��������г�����0
			//��ѡ���ӡ����쳣
			System.out.println(e);									//java.lang.ArithmeticException: / by zero
		}
		System.out.println("�����˸��쳣�Ļ����������ͻ����");	//�����˸��쳣�Ļ����������ͻ����
	}
}
















