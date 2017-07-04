package com.jy;

public class StockObserver implements Observer {
	private String nama;
	private Subject subject;

	/**
	 * 带参数的构造函数
	 * 
	 * @param nama
	 * @param subject
	 */
	public StockObserver(String nama, Subject subject) {
		super();
		this.nama = nama;
		this.subject = subject;
	}

	@Override
	public void update() {
		System.out.println(subject.getName() + "通知：" + subject.getState() + nama + "停止看股票，开始工作!");
	}

}
