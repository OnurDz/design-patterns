class ChangeManagerA extends ChangeManager {

    @Override
    void register(Subject s, Observer o) {
        System.out.println("Register operation of A");
    }

    @Override
    void unregister(Subject s, Observer o) {
        System.out.println("Unregister operation of A");
    }

    @Override
    void notify_() {
        System.out.println("Notification by ChangeManager A");
    }
}
