
interface Work {
    void work();
}

interface Eat {
    void eat();
}

class Human implements Work, Eat {
    public void work() {
        System.out.println("İnsan çalıştı");
    }
    public void eat() {
        System.out.println("İnsan yedi");
    }
}

class Robot implements Work {
    public void work() {
        System.out.println("Robot çalıştı");
    }
}

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        Robot robot = new Robot();
        human.eat();
        human.work();
        robot.work();
    }
}