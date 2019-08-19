/*�����Լ����쳣����
 * 
 	����JAVA�������쳣�����˴󲿷ֳ������󣬵���������ϣ�������Լ����쳣���ͣ��Դ����ض���Ӧ�ó�������
 	
 	ֻ��Ҫ Exception �����ࣨ��ȻҲ�� Throwable ���ࣩ���ɣ��������಻��Ҫʵ���κ����ݣ�
 	ֻҪ���Ǵ���������ϵͳ�У��Ϳ��Խ����������쳣
 	
 	Exception ��û��Ϊ�Լ������κη��������̳��� Throwalbe �ṩ�ķ�����
 	���е��쳣�������Զ������Щ�쳣�������Ի�� Throwable ����ķ�����������д��Щ������һ������!
 	
 	Exception�ඨ����4�����еĹ��캯�������е�����֧����ʽ�쳣
 		
 		Exception()			 //����û���������쳣
 		Exception(String i)  //����Ϊ�쳣ָ��������Ϣ
 	
 	
 */

class MyException extends Exception {
	private int datail;
	
	MyException(int datail) {
		this.datail = datail;
	}
	
	@Override
	public String toString() {
		return "MyException(" + datail + ")";		
	}
	
}

public class ExceptionHanding008 {
	static void compute(int a) throws MyException {
		System.out.println("MyException(" + a + ")");
		//�˴�ʹ��if����������쳣�Ĵ����������� a > 10
		if(a > 10) {
			throw new MyException(a);				
		}
		System.out.println("�������˳�");			
	}
	
	public static void main(String[] args) {
		try {
			//δ�����쳣
			compute(1);								//MyException(1)
													//�������˳�
			//�����쳣
			compute(20);							//MyException(20)
		} catch(MyException e) {
			System.out.println("Caught" + e);		//CaughtMyException(20)

		}
	}

}

