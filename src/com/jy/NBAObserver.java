package com.jy;

public class NBAObserver implements Observer {
	private String name;
	private Subject subject;

	/**
	 * 带参数的构造函数
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
		System.out.println(subject.getName() + "通知：" + subject.getState() + name + "停止看NBA，开始工作!");
	}

}
