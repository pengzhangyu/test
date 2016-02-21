package test;

public interface F {
	public void doSomething(String thing);
}

interface BB {
}

interface C extends F, BB {
}

interface D {
	public void doIt(String thing);
}

class AImpl implements C, D {
	public void doSomething(String msg) {
	}

	public void doIt(String thing) {
	}
}
