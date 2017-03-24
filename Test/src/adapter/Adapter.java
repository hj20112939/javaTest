package adapter;

//Ŀ���ɫ
interface target {
	public void run();
}

//�����ɫ
class Adaptee {
	public void specificRun() {
		System.out.println("�¼ӵĹ���");
	}
}

//������
class ClassAdapter extends Adaptee implements target {
	@Override
	public void run() {
		this.specificRun();
	}
}

//�û�
public class Adapter {
	public static void main(String[] args) {
		ClassAdapter classAdapter = new ClassAdapter();
		classAdapter.run();
	}
}
