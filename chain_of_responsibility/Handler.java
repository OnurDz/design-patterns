abstract class Handler {
    
    Handler successor;

    Handler(Handler successor_) {
        successor = successor_;
    }

    void handleRequest() {
        System.out.println("Handle request");
    }

}
