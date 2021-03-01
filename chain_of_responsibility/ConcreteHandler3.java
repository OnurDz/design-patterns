class ConcreteHandler3 extends Handler {
    
    ConcreteHandler3(Handle successor) {
        super(sucessor);
    }

    @Override
    void handleRequest() {
        System.out.println("Handle request by Concrete Handler 3");
        System.out.println("End of chain");
    }

}
