/*throw
 * 
 	֮ǰ try catch �����JAVA����ʱϵͳ�׳����쳣��
 	���ĳ������ʹ�� throw ��䴴��JAVA��׼�쳣����
 	
 		throw new Throwable�����������͵Ķ���();
 		
 		��new��������ǿղι�������ַ������죬�ַ�����������������쳣
 		
 		��getMessage()������ȡ����ַ�����
 	
 	���������Լ��� Throwable �඼������Ϊ�쳣������ͨ�����ַ�ʽ���Throwable����
 		�� catch �Ӿ���ʹ�ò�������ʹ�� new ��������� Throwable ����
 	
 	��δ���JAVA�ı�׼�쳣����
 		throw new NullPointerException
 */
public class ExceptionHanding005 {
	static void demoproc() {
		try {
			throw new NullPointerException("��ʽ���׳����쳣");	//ʹ��new������NullPointerExceptionʵ��
																//���Ҹ��쳣������ʽ����ô֮���catch�ͻᲶ������쳣ʵ���������Ӧ��������
		} catch(NullPointerException e) {
			System.out.println("��һ��catch���");				//��һ��catch���
			throw e;
		}
	}

	public static void main(String[] args) {
		try {
			demoproc();
		} catch(NullPointerException e) {
			System.out.println("�ڶ���catch���" + e);			//�ڶ���catch���java.lang.NullPointerException: ��ʽ���׳����쳣
		}

	}

}





