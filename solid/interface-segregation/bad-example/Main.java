
interface Worker {
    void work();
    void eat();
}

class Human implements Worker {
    public void work() {
        System.out.println("Çalıştı");
    }
    public void eat() {
        System.out.println("Yedi");
    }
}

class Robot implements Worker {
    public void work() {
        System.out.println("Çalıştı");
    }
    public void eat() {
        System.out.println("Yedi !!??");
    }
}
