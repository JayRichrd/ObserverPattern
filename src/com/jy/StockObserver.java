package com.jy;

public class StockObserver implements Observer {
	private String name;
	private Subject subject;

	/**
	 * 带参数的构造函数
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
		System.out.println(subject.getName() + "通知：" + subject.getState() + name + "停止看股票，开始工作!");
	}

}
