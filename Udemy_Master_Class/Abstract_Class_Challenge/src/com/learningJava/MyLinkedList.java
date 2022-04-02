package com.learningJava;

import java.util.List;

public class MyLinkedList implements NodeList {
    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (this.root == null) {
            // The list is empty, so this item becomes the head
            this.root = newItem;
            return true;
        }
        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = (currentItem.compareTo(newItem));
            if (comparison < 0) {
                // New item is greater so moves right if possible
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    // there is no next, so insert new item at end of list
//                    currentItem.setNext(newItem);
//                    newItem.setPrevious(currentItem);
                    currentItem.setNext(newItem).setPrevious(currentItem); // shortcut syntax
                    return true;
                }
            } else if (comparison > 0) {
                // New item is less, insert before
                if (currentItem.previous() != null) {
//                    currentItem.previous().setNext(newItem);
//                    newItem.setPrevious(currentItem.previous());
                    currentItem.previous().setNext(newItem).setPrevious(currentItem.previous()); // shortcut
//                    newItem.setNext(currentItem);
//                    currentItem.setPrevious(newItem);
                    newItem.setNext(currentItem).setPrevious(newItem); // shortcut
                } else {
                    // the node without a previous is the root
//                    newItem.setNext(this.root);
//                    this.root.setPrevious(newItem);
                    newItem.setNext(this.root).setPrevious(newItem); // shortcut
                    this.root = newItem;
                }
                return true;
            } else {
                // equal
                System.out.println(newItem.getValue() + " is already present, not added.");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem removeItem) {
        if (removeItem != null) {
            System.out.println("Deleted item " + removeItem.getValue());
        }

        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(removeItem);
            if (comparison == 0) {
                /// found the item to delete
                if (currentItem == this.root) {
                    this.root = currentItem.next();
                } else {
                    currentItem.previous().setNext(currentItem.next());
                    if (currentItem.next() != null) {
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            } else if (comparison < 0) {
                // not reached the item
                currentItem = currentItem.next();
            } else {
                // We are at an item greater than the one to be deleted
                // item is not in the list
                return false;
            }
        }
        // reached end of list, did not find item
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null) {
            System.out.println("This list is empty");
        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }
}
