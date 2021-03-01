class ConcreteHandler2 extends Handler {
    
    ConcreteHandler2(Handle successor) {
        super(sucessor);
    }
    
    @Override
    void handleRequest() {
        System.out.println("Handle request by Concrete Handler 2");
        succesor.handleRequest();
    }

}
