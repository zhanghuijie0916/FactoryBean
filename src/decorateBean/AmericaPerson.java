package decorateBean;

public class AmericaPerson extends Person{
    private static String language = "English";


    @Override
    public void show() {
        super.show();
        System.out.println("speak "+this.language);
    }
}
