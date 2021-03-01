abstract class Subject {

    void attach(Observer o) {
        chman.register(this, o);
        System.out.println("Observer " + o + " is attached.");
    }

    void detach(Observer o ) {
        System.out.println("Observer " + o + " is detached.");
    }

    void notify_() {
        System.out.println("Notification by the Subject to Observers");
    }

}
