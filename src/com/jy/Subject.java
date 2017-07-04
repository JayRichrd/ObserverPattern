package com.jy;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	private String name;
	// 成员变量
	private String state;
	// 观察者列表
	private List<Observer> observerList = new ArrayList<>();

	/**
	 * 带参数的构造函数
	 * 
	 * @param name
	 */
	public Subject(String name) {
		super();
		this.name = name;
	}

	/**
	 * 获取状态
	 * 
	 * @return
	 */
	public String getState() {
		return state;
	}

	/**
	 * 获取姓名
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
	 * 添加观察者
	 * 
	 * @param observer
	 *            将要被加入的观察者对象
	 */
	protected void attach(Observer observer) {
		observerList.add(observer);
	}

	/**
	 * 删除观察者
	 * 
	 * @param observer
	 *            将要被删除的观察者对象
	 * @return 删除成功返回true,否则返回false
	 */
	protected boolean detach(Observer observer) {
		if (!observerList.isEmpty())
			return observerList.remove(observer);
		return false;
	}

	/**
	 * 通知观察者
	 */
	protected void notifyObserver() {
		for (Observer observer : observerList) {
			observer.update();
		}
	}
}
