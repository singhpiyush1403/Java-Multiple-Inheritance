
interface Event {
    void start();
}


interface Sports {
    void play();
}


class Hockey implements Event, Sports {
    public void start() {
        System.out.println("Start Event");
    }

    public void play() {
        System.out.println("Play Sports.");
    }

    public void show() {
        System.out.println("Show Hockey.");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
     
        Hockey hockey = new Hockey();
        
        
        hockey.show();
        hockey.start();  
        hockey.play();  
    }
}
