/*throws
 * 
 	����쳣��������������֮����쳣����ô�ͱ���ָ��������Ϊ���Ա㷽���ĵ������ܹ����������Լ��Է��������쳣
 	
 	throws �Ӿ��г��������ܻ��׳����쳣���͡����� Error �� RuntimeException �����������͵��쳣֮��
 		�����������͵��쳣�ⶼ�Ǳ����
 	
 	���������׳������������쳣�������� throws �Ӿ��н��������������������
 		
 		�������� ������(�����б�) throws �쳣�б� {
 			��������;
 		}
 	
 */
public class ExceptionHanding006 {
	//�г����ܻ��׳����쳣���ͣ����������׳����������Ͷ������ڴ˴�������
	//���û�� throws ��ô�ó�����ͼ�׳��޷�ƥ����쳣���������
	static void throwOne() throws IllegalAccessException,ArrayIndexOutOfBoundsException {
		System.out.println("����һ���쳣");					//����һ���쳣
		throw new IllegalAccessException("demo");
	}
	
	public static void main(String[] args) {
		//���붨�岶����쳣�� try catch ���
		try {
			throwOne();
		} catch(IllegalAccessException e) {
			System.out.println(e);							//java.lang.IllegalAccessException: demo
		}
	}

}
