package abstractFactoryDesignPatter;

public class LightButton implements  Button{
    @Override
    public void render() {
        System.out.println("Rendering a Light Theme Button.");
    }
}
