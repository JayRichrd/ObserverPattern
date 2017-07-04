package com.jy;

public class NBAObserver implements Observer {
	private String name;
	private Subject subject;

	/**
	 * �������Ĺ��캯��
	 * 
	 * @param nama
	 * @param subject
	 */
	public NBAObserver(String nama, Subject subject) {
		super();
		this.name = nama;
		this.subject = subject;
	}

	@Override
	public void update() {
		System.out.println(subject.getName() + "֪ͨ��" + subject.getState() + name + "ֹͣ��NBA����ʼ����!");
	}

}
