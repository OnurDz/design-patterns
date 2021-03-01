class Context {
    
    Strategy strat;

    Context(Strategy strat) {
        this.strat = strat;
    }

    void ContextInterface() {
        strat.algorithmInterface();
    }
    
}
