package abstractFactoryDesignPatter;

public class AbstractFactoryPatternExample {
    public static void main(String[] args) {
        // Create a Light Theme
        ThemeFactory lightThemeFactory = new LightThemeFactory();
        Button lightButton = lightThemeFactory.createButton();
        TextField lightTextFiled = lightThemeFactory.createTextField();
        lightButton.render();
        lightTextFiled.render();

        // Create a Dark Theme
        ThemeFactory darkThemeFactory = new DarkThemeFactory();
        Button darkButton = darkThemeFactory.createButton();
        TextField darkTextField = darkThemeFactory.createTextField();

        darkButton.render(); // Output: Rendering a Dark Theme Button.
        darkTextField.render(); // Output: Rendering a Dark Theme TextField.
    }
}
