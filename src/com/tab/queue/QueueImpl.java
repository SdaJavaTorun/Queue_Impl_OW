package com.tab.queue;

/**
 * Created by aleksandra on 09.03.2017.
 */
public class QueueImpl {

    private String value; //wartosc ktora bedziemy chcieli wlozyc do kolejki
    private QueueImpl next; //wskazujemy na nastepny element

    public QueueImpl(String value){
        this.value = value;
        this.next = null;

    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public QueueImpl getNext() {
        return next;
    }

    public void setNext(QueueImpl next) {
        this.next = next;
    }



}
