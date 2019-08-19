/*��ʽ�쳣��JDK1.4��ʼ
 * 
 	ͨ����ʽ�쳣������Ϊ�쳣������һ���쳣
 	�ڶ����쳣������һ���쳣��ԭ��������ǰ�쳣ԭ����쳣���ں����ֱ���Ϊ�������쳣���򡰱����쳣����
 	
 	ʹ����ʽ�쳣���Դ��������������ڶ���쳣�������
 		�磺ĳ��������ͼ��������� ArithmeticException�쳣����ʵ�ʵ��������Դ��������һ��I/O����
 			��ô����������ʽ���׳� ArithmeticException�쳣�������Ѿ������Ĵ��󣬵����Ǹ���֪���������ڵĴ���
 	
 	Ϊ��ʹ����ʽ�쳣������ Throwable ������������캯������������
 		�������캯����
 			Throwable(Throwable causeExc)				//��������ǰ�쳣���쳣��causeExc�ǵ�ǰ�쳣�ı���ԭ��
 			Throwable(String msq, Throwable causeExc)	//�ڶ�����ʽ������ָ�������쳣��ͬʱָ���쳣����
 		����������
 			Throwable getCause()						//����������ǰ�쳣���쳣����������ڱ����쳣���ͷ���null
 			Throwable initCause(Throwable causeExc)		//��cause�͵����쳣������һ�𣬲����ض��쳣������
 	
 */
public class ExceptionHanding009 {
	
	static void demoproc() {
		//new һ�������쳣
		NullPointerException e = new NullPointerException("�����쳣");
		//new һ�������쳣���쳣
		e.initCause(new ArithmeticException("cause"));
		//�׳����쳣
		throw e;
	}
	
	public static void main(String[] args) {
		try {
			demoproc();
		} catch(NullPointerException e) {
			//��ʽ����쳣
			System.out.println(e);					//java.lang.NullPointerException: �����쳣
			//��ʽ�ڲ��쳣
			System.out.println(e.getCause());		//java.lang.ArithmeticException: cause
		}
	}
}
