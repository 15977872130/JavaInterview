/*finally
 * 
 	���׳��쳣ʱ�������е�ִ���������һ���ǳ�ͻȻ�������Ե�·�����⽫�ı䷽��������ִ������
 	
 	ʹ�� finally ���Դ���һ������飬�ô�������ִ�� try catch �����֮�󣬲�ִ���� try catch��������Ĵ���֮ǰִ��
 	�����Ƿ����쳣�׳�������ִ�� finally ����飻
 	
 	�����׳��쳣����ô��ʹû�� catch �����ƥ���쳣��finally ������Ի�ִ��
 	ֻҪ������ try catch ������ڲ����ص����ߣ�����ͨ��δ������쳣������ʽ�ķ�����䣬�����ڷ�������֮ǰִ�� finally �Ӿ�
 	
 	���ڹر��ļ�����Լ��ͷ��ڷ�����ʼʱ���з��䣬���ڷ�������֮ǰ���д��������������Դ��˵��finally �Ӿ䶼�����ã�
 	
 	ÿ�� try ���������Ҫһ�� catch �Ӿ�� finally �Ӿ�
 	
 	���finally������ĳ��try��������������ôfinally����������� try ����������ִ��
 	
 */
public class ExceptionHanding007 {
	static void procA() {
		try {
			System.out.println("��һ��������try");
			throw new RuntimeException("demo");
		//�����쳣�Ƿ��׳�����finally����鶼��ִ��
		} finally {
			System.out.println("��һ��������finally");
		}
	}
	static void procB() {
		try {
			System.out.println("�ڶ�������try");
		//return��佫��������飬���Բ�������תfinally
			return;
		} finally {
			System.out.println("�ڶ���������finally");
		}
	}
	static void procC() {
		try {
		System.out.println("������������try");
		//�����쳣�Ƿ��׳�����finally����鶼��ִ��
		} finally {
			System.out.println("������������fianlly");
		}
	}
	public static void main(String[] args) {
		try {
			procA();									//��һ��������try
														//��һ��������finally
		} catch (Exception e) {
			System.out.println("���������try");		//���������try
		}
		
		procB();										//�ڶ�������try
														//�ڶ���������finally
		procC();										//������������try
														//������������fianlly
	}
}


















