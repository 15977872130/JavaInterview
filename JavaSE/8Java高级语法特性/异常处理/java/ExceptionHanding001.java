
public class ExceptionHanding001 {

	public static void main(String[] args) {
		/**
		 * δ������쳣
		 * 	��JAVA����ʱ��⵽�쳣ʱ����ô�����ṹ��һ���µ��쳣����Ȼ���׳�����쳣��
		 * 	�⽫���µ�ǰ������ִֹ�У�
		 *
		 * 	һ���׳��쳣���ͱ�����һ���쳣����ȥ��������쳣���������д���
		 * 	���û���ṩ�κ��쳣����ĳ�����ô���쳣����JAVA����ʱϵͳ�ṩ��Ĭ�ϴ�����򲶻�
		 * 	û�б����򲶻�������쳣�����ն�����Ĭ�ϳ�����д���
		 *
		 * 	Ĭ�ϴ���������ʾһ�������쳣���ַ���������쳣������ġ���ջ�ټ�������ֹ����
		 *
		 */
		
		//����������쳣����������£��������������ı��ʽ
		int d = 0;
		int a = 42 / d;		//Exception in thread "main" java.lang.ArithmeticException: / by zero
							//at Konwledge004.ExceptionHanding001.main(ExceptionHanding001.java:68)
							
		/* 	Exception in thread "main" java.lang.ArithmeticException 
				�쳣������Exception������ArithmeticException��������������˷����Ĵ�������Ϊ�� zero
		  	at Konwledge004.ExceptionHanding001.main(ExceptionHanding001.java:68)
		  		��ջ�켣������(Konwledge004.ExceptionHanding001)��������(main)���ļ���(ExceptionHanding001.java)���к�(68)
		*/
		
		
		Exc1.subroutine();		//xception in thread "main" java.lang.ArithmeticException: / by zero
								//at Konwledge004.Exc1.subroutine(ExceptionHanding001.java:94)	������н�ָʾ�쳣���ڵ����еڼ���
								//at Konwledge004.ExceptionHanding001.main(ExceptionHanding001.java:83)

	}

}

class Exc1 {
	static void subroutine() {
		int d = 0;
		int a = 10 / d;
	}
}
































