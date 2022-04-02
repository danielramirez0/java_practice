package com.learningJava;

public class Node extends ListItem {
    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return this.nextItem;
    }

    @Override
    ListItem setNext(ListItem listItem) {
        this.nextItem = listItem;
        return this.nextItem;
    }

    @Override
    ListItem previous() {
        return this.prevItem;
    }

    @Override
    ListItem setPrevious(ListItem listItem) {
        this.prevItem = listItem;
        return this.prevItem;
    }

    @Override
    int compareTo(ListItem listItem) {
        if (listItem != null) {
            return ((String) super.getValue()).compareTo((String) listItem.getValue());
        } else {
            return -1;
        }
    }
}
