package com.jy;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	private String name;
	// ��Ա����
	private String state;
	// �۲����б�
	private List<Observer> observerList = new ArrayList<>();

	/**
	 * �������Ĺ��캯��
	 * 
	 * @param name
	 */
	public Subject(String name) {
		super();
		this.name = name;
	}

	/**
	 * ��ȡ״̬
	 * 
	 * @return
	 */
	public String getState() {
		return state;
	}

	/**
	 * ��ȡ����
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	public void setState(String state) {
		this.state = state;
	}

	/**
	 * ��ӹ۲���
	 * 
	 * @param observer
	 *            ��Ҫ������Ĺ۲��߶���
	 */
	protected void attach(Observer observer) {
		observerList.add(observer);
	}

	/**
	 * ɾ���۲���
	 * 
	 * @param observer
	 *            ��Ҫ��ɾ���Ĺ۲��߶���
	 * @return ɾ���ɹ�����true,���򷵻�false
	 */
	protected boolean detach(Observer observer) {
		if (!observerList.isEmpty())
			return observerList.remove(observer);
		return false;
	}

	/**
	 * ֪ͨ�۲���
	 */
	protected void notifyObserver() {
		for (Observer observer : observerList) {
			observer.update();
		}
	}
}
