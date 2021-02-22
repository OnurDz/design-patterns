public class Client {
    
    void main() {
        A a = new A();
        B b = new B();
        Abstraction abstraction = new Abstraction(a);
        abstraction.operation();
        abstraction = new Abstraction(b);
        abstraction.operation();
    }

}
