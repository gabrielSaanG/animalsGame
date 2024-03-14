import javax.swing.*;

public class Tree<String> {
    private Node<String> root;
    private int livesInWater;

    public Tree(){
        this.root = null;
    }
    private Node<String> lastSeenNode;


    public void addNewElement(String value, int selectedAnswer){
        Node<String> newNode = new Node<String>(value);
        Node<String> currentValue = this.root;

        if (currentValue == null){
            setRoot(newNode);
            currentValue = this.root;
        }
            while (true) {
                if (newNode.getValue() != null && selectedAnswer == JOptionPane.YES_OPTION) {
                    if (currentValue.getLeft() != null) {
                        currentValue = currentValue.getLeft();
                    } else {
                        currentValue.setLeft(newNode);
                        System.out.println("left "+ currentValue.getLeft().getValue());
                        return;
                    }
                } else if (newNode.getValue() != null && selectedAnswer == JOptionPane.NO_OPTION) {
                    if (currentValue.getRight() != null) {
                        currentValue = currentValue.getRight();
                    } else {
                        currentValue.setRight(newNode);
                        System.out.println("right" + currentValue.getRight().getValue());
                        return;
                    }
                }
            }
        }


    public Node<String> getRoot() {
        return root;
    }

    public void setRoot(Node<String> root) {
        this.root = root;
    }

    public int getLivesInWater() {
        return livesInWater;
    }

    public void setLivesInWater(int livesInWater) {
        this.livesInWater = livesInWater;
    }

    @Override
    public java.lang.String toString() {
        return "Tree{" +
                "root=" + root +
                ", livesInWater=" + livesInWater +
                ", lastSeenNode=" + lastSeenNode +
                '}';
    }
}

