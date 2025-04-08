package ru.ivt5.v2.gen;

public class ArrayBox<T> {
    private T[] content;

    public ArrayBox(T[] content) {
        super();
        this.content = content;
    }

    public T[] getContent() {
        return content;
    }

    public void setContent(T[] content) {
        this.content = content;
    }

    public T getElement(int index) {
        return content[index];
    }

    public void setElement(int index, T element) {
        content[index] = element;
    }

    public boolean isSameSize(ArrayBox<?> other) {
        return this.content.length == other.content.length;
    }
}
