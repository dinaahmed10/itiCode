package oopPrinciples.Abstract;

public interface Constants {
	int MAX_VALUE = 100;  // public, static, and final by default
    String DEFAULT_NAME = "Unknown";  // also public, static, and final
    static int add(int a, int b) {
        return a + b;
    }
}
