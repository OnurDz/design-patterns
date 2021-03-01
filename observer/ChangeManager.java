abstract class ChangeManager {

    void register(Subject s, Observer o) {
        System.out.println("Register Subject" + s + " to Observer " + o);
    }

    void unregister(Subject s, Observer o) {
        System.out.println("Unregister Subject " + s + " from Observer " + o);
    }

    void notify_() {
        System.out.println("Notification by ChangeManager");
    }
}
