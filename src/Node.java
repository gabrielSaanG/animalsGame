import javax.swing.JOptionPane;
public class Node<Type> {
    private Type value;
    private Node<Type> left;
    private Node<Type> right;


    public Node (Type value){
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public Type getValue() {
        return value;
    }

    public void setValue(Type value) {
        this.value = value;
    }

    public Node<Type> getLeft() {
        return left;
    }

    public void setLeft(Node<Type> left) {
        this.left = left;
    }

    public Node<Type> getRight() {
        return right;
    }

    public void setRight(Node<Type> right) {
        this.right = right;
    }

}
