/*3��������ӵ��쳣���ԣ���JDK7��ʼ
 * 
 	1������Դ�������ļ���������Ҫʱ�ܹ������ͷţ��� try ������չ��ʽ���ƴ�����Դ�� try ��䣬������I/O��
 	
 	2�����ز�������ͨ����ͬ�� catch �Ӿ䲶�����������쳣������������������쳣����ͨ��һ��catch�Ӿ�ʹ����ͬ�Ĵ��봦�����д���
 				 ʹ�ö��ز�����catch�Ӿ���ʹ�û������ " | " �ָ�ÿ���쳣��ÿ�����ز������������ʽ����Ϊfinal����˲��ܸ���ֵ
 	
 	3����������׳�������׼�������׳�������������׳����쳣���ͽ������ƣ�ֻ�������׳��������������ľ������쳣��
 										 �ɹ����� try ������׳���û�б�ǰ��� catch �Ӿ䴦����������ǵ����������ͻ����͡�
 										 Ϊ��ǿ��ʹ�á�����׼�������׳����쳣���ԣ�catch �������뱻��Ч����ʽ������Ϊfinal����ζ�� catch ����鲻��Ϊ֮��ֵ
 */
public class ExceptionHanding010 {

	public static void main(String[] args) {
		int a = 10, b = 0;
		int[] vals = {1, 2, 3};
		
		try {
			int result = a / b;
			vals[10] = 17;
		//���ز����﷨��д
		} catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {	//java.lang.ArithmeticException: / by zero
			System.out.println(e);
		}
		System.out.println("�������");									//�������

	}

}
