public class bst {
    private Node<Integer> l;
    
    public Node search(Node t, int i){
	if (t==null || t.getData() ==i)
	    return t;
	else if (t.getData() < i)
	    return search(t.getLeft(),i);
	else
	    return saerch(t.getRight(),i);
    }

    public String search(int i){
	Node retval = search(r,i);
	if(retval == null)
	    return "Not found";
	else
	    return "" + retval;
    }
    
    public void insert(Node t, int i){
	Node<Integer> temp = new Node<Integer>(i);
	if (t.getData() == i){
	    return;
	}
	if (t.getData() > i){
	    if (t.getLeft() != null){
		insert(t.getLeft(), i);
	    } else {
		t.setLeft(temp);
	    }
	} else {
	    if (t.getRight() != null){
		insert(t.getRight(), i);
	    } else {
		t.setRight(temp);
	    }
	}
    }

    public String toString(){
	return traverse(r);
    }

    public String traverse(Node t){
	
    }
    
}
