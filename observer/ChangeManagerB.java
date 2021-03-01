class ChangeManagerB extends ChangeManager {
    
    @Override
    void register(Subject s, Observer o) {
        System.out.println("Register operation of B");
    }

    @Override
    void unregister(Subject s, Observer o) {
        System.out.println("Unregister operation of B");
    }

    @Override
    void notify_() {
        System.out.println("Notification by ChangeManager B");
    }
}
