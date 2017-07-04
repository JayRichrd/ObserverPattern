package com.jy;

public class ObserverPattern {

	public static void main(String[] args) {
		// 被观察者
		Subject boss = new Boss("boss");

		// 观察者
		Observer stockObserver1 = new StockObserver("看股票同事", boss);
		Observer nbaObserver1 = new NBAObserver("看NBA同事", boss);

		// 添加观察者
		boss.attach(stockObserver1);
		boss.attach(nbaObserver1);

		// 被观察者状态改变
		boss.setState("boss回来了!");

		// 通知观察者
		boss.notifyObserver();

		System.out.println("------------------------------------------------------");

		// 被观察者
		Subject secretary = new Secretary("secretary");

		// 观察者
		Observer stockObserver2 = new StockObserver("看股票同事", secretary);
		Observer nbaObserver2 = new NBAObserver("看NBA同事", secretary);

		// 添加观察者
		secretary.attach(stockObserver2);
		secretary.attach(nbaObserver2);

		// 被观察者状态改变
		secretary.setState("boss回来了!");

		// 通知观察者
		secretary.notifyObserver();
	}

}
