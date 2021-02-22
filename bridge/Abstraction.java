class Abstraction {
    
    Implementor imp;

    Abstraction(Implementor imp) {
        this.imp = imp;
    }

    void operation(){
        imp.operationImp();
    }

}