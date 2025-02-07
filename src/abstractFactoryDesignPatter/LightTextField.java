package abstractFactoryDesignPatter;

public class LightTextField implements TextField{
    @Override
    public void render() {
        System.out.println("Rendering a Light Theme TextField.");

    }
}
