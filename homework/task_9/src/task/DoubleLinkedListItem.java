package task;

public class DoubleLinkedListItem<T extends  Comparable<T>> {

    private DoubleLinkedListItem<T> Before_Curr;
    private DoubleLinkedListItem<T> After_Curr;
    private T data;



    public DoubleLinkedListItem(T data) {
        Before_Curr = After_Curr = null;
        this.data = data;
    }


    public DoubleLinkedListItem<T> getNext() {
        return After_Curr;
    }
    public DoubleLinkedListItem<T> getPrev() {
        return Before_Curr;
    }
    public T getData() {
        return data;
    }



    public void setNext(DoubleLinkedListItem<T> value) {
        After_Curr = value;
    }
    public void setPrev(DoubleLinkedListItem<T> value) {
        Before_Curr = value;
    }
    public void setData(T value) {
        data = value;
    }
}
