package com.tasks3.linkedlist;



public class LinkedList {

    private Node finish;

    private Node start;

    private int size = 0;



    public LinkedList() {

    }



    public void add(Integer data) {

        Node newNode = new Node();

        newNode.setData(data);



        if (size == 0){

            start = newNode;

            }

        else{

            finish.setNext(newNode);

            }



        finish = newNode;

        size++;

    }



    public Integer get(int index) {

        return nodeSearch(index).getData();

    }



    public boolean delete(int index) {

        if (nodeSearch(index) != null ) {

            

            if (index == 0){

                start = start.getNext();

            }

            else{

                nodeSearch(index - 1).setNext(nodeSearch(index+1));

                }

            size--;

            return true;

        }

        return false;

    }



    public int size() {

        return size;

    }



    private Node nodeSearch(int index) {

        if (index < size && index >= 0) {

            Node currentNode = start;

            int currentIndex = 0;

            while (currentIndex < index){

                if (currentNode.getNext() != null) {

                    currentNode = currentNode.getNext();

                    currentIndex++;

                }



            }

            return currentNode;

        }

        else

            return null;

    }

}   

