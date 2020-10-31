import java.io.*;
import java.util.*;

class msort {
    private node l;
    void mergeSort(node l) {
	if (l.getNext().getNext() == null) {
	    if (l.getInfo() > l.getNext().getInfo()) {
		node temp;
		temp = l;
		l = l.getNext();
		l.setNext() = temp;
	    }
	}
	else {
	    private node t;
	    split(l,t);
	    mergeSort(l);
	    mergeSort(t);
	    merge(l,t);
	}
    }
    void split (node a, node b) {
	int c=0;
	node t=a;
	while (t !=null) {
	    c++;
	    t=t.getNext();
	}
	t=a;
	if (c % 2 == 0) {
	    for (int i = 0;i < c/2;i++) {
		t=t.getNext();
	    }
	}
	else {
	    for (int i = 0; i <= (c/2)-1;i++) {
		t=t.getNext();
	    }
	}
	b=t;
    }
    void merge (node a, node b) {
    }
}

class node {
    int info;
    node next;
    public node(int i) {
	info = i;
	next = null;
    }
    public node(int i, node n) {
	info = i;
	next = n;
    }
}
