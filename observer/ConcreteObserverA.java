class ConcreteObserverA extends Observer {
    
    int observerState;

    ConcreteObserverA(Subject subject_) {
        super(subject_);
    }

    @Override
    void update(Subject s) {
        System.out.println("Update on Subject " + s + " by Observer A");
        observerState = subject.getState();
    }

}
