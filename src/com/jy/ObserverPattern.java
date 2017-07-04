package com.jy;

public class ObserverPattern {

	public static void main(String[] args) {
		// ���۲���
		Subject boss = new Boss("boss");

		// �۲���
		Observer stockObserver1 = new StockObserver("����Ʊͬ��", boss);
		Observer nbaObserver1 = new NBAObserver("��NBAͬ��", boss);

		// ��ӹ۲���
		boss.attach(stockObserver1);
		boss.attach(nbaObserver1);

		// ���۲���״̬�ı�
		boss.setState("boss������!");

		// ֪ͨ�۲���
		boss.notifyObserver();

		System.out.println("------------------------------------------------------");

		// ���۲���
		Subject secretary = new Secretary("secretary");

		// �۲���
		Observer stockObserver2 = new StockObserver("����Ʊͬ��", secretary);
		Observer nbaObserver2 = new NBAObserver("��NBAͬ��", secretary);

		// ��ӹ۲���
		secretary.attach(stockObserver2);
		secretary.attach(nbaObserver2);

		// ���۲���״̬�ı�
		secretary.setState("boss������!");

		// ֪ͨ�۲���
		secretary.notifyObserver();
	}

}
