package global.sesoc.manager;

import java.util.List;

import global.sesoc.vo.Toy;

public interface ToyManager {
	/**
	 * ���Ͽ� ������ ��� Toy ��ü ������ �о���δ�.
	 * */
	public void loadFile();
	/**
	 * ��ϵ� ��� Toy ��ü ������ ���Ͽ� ����Ѵ�.
	 * @return ���� ���� ���� ����
	 * */
	public boolean saveFile();

	/**
	 * ���޹��� Toy ��ü�� List�� �߰�
	 * @param list�� �߰��� Toy��ü
	 * @return boolean �߰�����(�߰� ���� �� true, �߰� ���н� false) 
	 */
	public boolean insertToy(Toy toy);
	/**
	 * ��ǰ�� �Ϸ� ��ȣ�� �̿��� �ش��ϴ� ��ǰ�� �ִ��� ã�´�.
	 * @param serialNum ��ǰ��ȣ
	 * 
	 * @return ��ǰ��ȣ�� ���� �˻��� ��ǰ ����, �˻��� ������ ���� ��� null�� ���ϵȴ�.
	 */
	public Toy searchToy(String serialNum);
	
	/**
	 * ��ǰ ��ȣ�� �̿��� �ش� ��ǰ�� ã���� ��� ��ǰ�� ��Ͽ��� �����ϰ�, ���Ͽ� ������ �� true�� �����Ѵ�.
	 * ��ǰ��ȣ�� ã�� ������ ��� false�� �����Ѵ�.
	 * @param serialNum
	 * @return boolean ���� ���� ���� (���� �Ϸ� �� true, ���� ���� �� false)
	 */
	public boolean deleteToy(String serialNum);
	
	/**
	 * �ּұݾװ�, �ִ�ݾ��� ���޹޾� �ش��ϴ� ���� ���޹޾� �� ���������� ������ �峭���� �����Ѵ�.
	 * @param �ּҰ�, �ִ밪
	 * @return ������ �ݾ� �ȿ� �����ϴ� �峭���� ���
	 */
	public List<Toy> toyListForPrice(int minPrice, int maxPrice);
	
	/**
	 * ���޵� Ÿ���� �峭�� ����� ����Ѵ�.
	 * @param �峭�� Ÿ��
	 * @return List<Toy> �˻��� �峭�� ���
	 */
	public List<Toy> printToyInfo(int type);
}
