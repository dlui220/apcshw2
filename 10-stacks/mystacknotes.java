public boolean empty(){
    return s == null;
}

public void push (E data){
    Node temp = new Node(data);
    temp.setNext(s);
    s = temp;
}

public E pop() {
    E temp = s.getData(); // if (empty)
    s=s.getNext(); //        check if the Linked list is empty
    return temp; //          or else it'll return a null pointer exception
}

public E top(){
    if (empty)
	then _________;
    return s.getData();
}
