package utilities;

public interface InputHandler<T> {
    T getInput(String prompt);

    T[] getMultipleInputs(String prompt, String delimiter);
}