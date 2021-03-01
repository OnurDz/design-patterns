import org.graalvm.compiler.graph.Node.Successor;

class ConcreteHandler1 extends Handler {

    ConcreteHandler1(Handle successor) {
        super(successor);
    }

    void handleRequest() {
        System.out.println("Handle request by Concrete Handler 1");
        succesor.handleRequest();
    }

}
