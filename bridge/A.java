class A extends Implementor {

    @Override
    void operationImp() {
        System.out.println("Operation A");
    }

    void addedOperationA() {
        System.out.println("Operation unique to A");
    }
    
}
