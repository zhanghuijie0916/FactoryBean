package decorateBean;

public class ChinesePerson extends Person {
    private static String language = "Chinese";


    @Override

    public void show() {
        super.show();
        System.out.println("speak "+this.language);
    }
}
