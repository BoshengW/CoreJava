package JavaSE.DesignPattern.Proxy;

public class StaticProxy {
    public static void main(String[] args) {
        // when try to do something use proxy rather than real object
        ProxydoSomething myproxy = new ProxydoSomething();
        myproxy.display();
    }
}

interface doSomething {
    public void display();
}

class IdoSomething implements doSomething {

    @Override
    public void display() {
        System.out.println("I can do something");
    }
}

class ProxydoSomething implements doSomething {
    private IdoSomething idoSomething; // import real object class

    @Override
    public void display() {
        System.out.println("proxy do something");
        if(idoSomething==null) {
            idoSomething = new IdoSomething();
        }
        idoSomething.display();

    }
}