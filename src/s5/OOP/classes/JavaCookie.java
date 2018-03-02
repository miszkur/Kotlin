package s5.OOP.classes;

public class JavaCookie {
    private final String name;
    private final boolean glutenFree;

    public JavaCookie(String name) {
        this.name = name;
        this.glutenFree = true;
    }

    public JavaCookie(String name, boolean glutenFree) {
        this.name = name;
        this.glutenFree = glutenFree;
    }
}
