class ConcreteHandler1 extends Handler {

    ConcreteHandler1(Handle successor) {
        super(successor);
    }

    @Override
    void handleRequest() {
        System.out.println("Handle request by Concrete Handler 1");
        succesor.handleRequest();
    }

}
