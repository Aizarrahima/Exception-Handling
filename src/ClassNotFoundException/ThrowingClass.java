package ClassNotFoundException;

class ThrowingClass {

    static void myMethod() throws ClassNotFoundException {
        throw new ClassNotFoundException("just a demo");
    }
}
