class B extends Implementor {

    @Override
    void operationImp() {
        System.out.println("Operation B");
    }
    
    void addedOperationB() {
        System.out.println("Operation unique to B");
    }
    
}
