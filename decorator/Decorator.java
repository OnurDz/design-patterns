abstract class Decorator {
    Component component;

    Decorator(Component component_) {
        component = component_;
    }

    void operation() {
        component.operation();
    }

}
