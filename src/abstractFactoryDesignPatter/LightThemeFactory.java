package abstractFactoryDesignPatter;

public class LightThemeFactory implements ThemeFactory{
    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public TextField createTextField() {
        return new LightTextField();
    }
}
