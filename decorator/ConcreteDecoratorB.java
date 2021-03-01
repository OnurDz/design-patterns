class ConcreteDecoratorB extends Decorator {
    
    @Override
    void operation() {
        super.operation();
        addedBehaviour();
    }

    void addedBehaviour() {
        System.out.prinln("Added behaviour from Decorator B");
    }

}
