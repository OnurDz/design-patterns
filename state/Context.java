abstract class Context {

    State state;

    Context(State state_) {
        state = state_;
    }

    void Request() {
        System.out.println("Request");
    }
    
}
