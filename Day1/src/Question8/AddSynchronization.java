package Question8;
class Counter implements Runnable {

	Storage st;

	public Counter(Storage store) {
		st = store;
	}

	@Override
	public void run() {
		synchronized (st) {
			for (int i = 0; i < 10; i++) {
				while (!st.isPrinted()) { 
					try {
						st.wait();
					} catch (Exception e) {
					}
				}
				st.setValue(i);
				st.setPrinted(false);
				st.notify();
			}
		}
	}

}

class Printer1 implements Runnable {
	Storage st;

	public void Printer(Storage st) {
		this.st = st;
	}

	@Override
	public void run() {
		synchronized (st) {
			for (int i = 0; i < 10; i++) {
				while (st.isPrinted()) { 
					try {
						st.wait();
					} catch (Exception e) {
					}
				}
				System.out.println(Thread.currentThread().getName() + " " + st.getValue());
				st.setPrinted(true);
				st.notify();
			}
		}
	}

}

class Storage {
	int i;
	boolean printed = true;

	public void setValue(int i) {
		this.i = i;
	}

	public int getValue() {
		return this.i;
	}

	public boolean isPrinted() {
		return printed;
	}

	public void setPrinted(boolean p) {
		printed = p;
	}
}

public class AddSynchronization {
	public static void main(String[] args) {
		Storage st = new Storage();
		Counter c = new Counter(st);
		Printer1 p = new Printer1();
		new Thread(c, "Counter").start();
		new Thread(p, "Printer").start(); 
	}

}
