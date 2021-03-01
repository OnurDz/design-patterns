class ConcreteDecoratorA extends Decorator {
    
    void operation() {
        super.operation();
        addedBehaviour();
    }

    void addedBehaviour() {
        System.out.prinln("Added behaviour from Decorator A");
    }
    
}
