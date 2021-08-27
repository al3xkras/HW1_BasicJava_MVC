package org.example;

public class Main {

    private static final View view =  new View();
    private static final Model model = new Model();

    public static void main(String[] args) {
        final Controller controller = new Controller(view,model);

        controller.run();
    }
}
