package diamondProlem;

public class O implements M, N{
    // Need to override show() to resolve conflict
    @Override
    public void show() {
        System.out.println("O's show method");
        M.super.show();// Explicitly calling M's method
        N.super.show();// Explicitly calling N's methods

    }
}
