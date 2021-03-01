class ConcreteObserverB extends Observer {
    
    int observerState;

    ConcreteObserverB(Subject subject_) {
        super(subject_);
    }

    @Override
    void update(Subject s) {
        System.out.println("Update on Subject " + s + " by Observer B");
        observerState = subject.getState();
    }

}
