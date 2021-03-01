abstract class Observer {

    Subject subject;

    Observer(Subject subject_) {
        subject = subject_;
    }

    void update() {
        System.out.println("Update on Subject " + s);
    }

}
