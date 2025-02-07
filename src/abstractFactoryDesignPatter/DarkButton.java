package abstractFactoryDesignPatter;

public class DarkButton implements Button{
    @Override
    public void render() {
        System.out.println("Rendering a Dark Theme Button.");

    }
}
