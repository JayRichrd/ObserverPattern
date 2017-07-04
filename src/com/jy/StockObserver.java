package com.jy;

public class StockObserver implements Observer {
	private String name;
	private Subject subject;

	/**
	 * �������Ĺ��캯��
	 * 
	 * @param nama
	 * @param subject
	 */
	public StockObserver(String nama, Subject subject) {
		super();
		this.name = nama;
		this.subject = subject;
	}

	@Override
	public void update() {
		System.out.println(subject.getName() + "֪ͨ��" + subject.getState() + name + "ֹͣ����Ʊ����ʼ����!");
	}

}
