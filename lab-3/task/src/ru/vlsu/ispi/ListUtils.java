package ru.vlsu.ispi;

public class ListUtils {
    public static ListElement insert(ListElement first, int value) {
        ListElement newElement = new ListElement(value);
        newElement.setNext(first);
        return newElement;
    }
    public static ListElement filter(ListElement first) {
        ListElement p = null;
        while (first != null) {
            if (first.getValue() % 3 == 0){
                p = insert(p, first.getValue());
            }
            first = first.getNext();
        }
        return p;
    }
    public static ListElement map(ListElement first, ListElement result) {
        if (first == null){
            return result;
        }

        result = insert(result, (int) Math.pow(first.getValue(), 3));
        return map(first.getNext(), result);
    }
    public static int reduce(ListElement first) {
        int sum = 0;
        while (first != null) {
            sum += first.getValue();
            first = first.getNext();
        }
        return sum;
    }
}
