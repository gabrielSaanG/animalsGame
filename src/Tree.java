import javax.swing.*;

public class Tree<String> {
    private Node<String> root;
    private int livesInWater;

    public Tree(){
        this.root = null;
    }



    public void addNewElement(String value, int selectedAnswer){
        Node<String> newNode = new Node<String>(value);
        if (root == null){
            this.root = newNode;
        } else {
            Node<String> currentValue = this.root;
            while (true) {

                if (newNode.getValue() != null && selectedAnswer == JOptionPane.YES_OPTION) {
                    if (currentValue.getLeft() != null) {
                        currentValue = currentValue.getLeft();

                    } else {
                        currentValue.setLeft(newNode);
                        System.out.println(currentValue.getValue());
                        return;
                    }
                } else if (newNode.getValue() != null && selectedAnswer == JOptionPane.NO_OPTION) {
                    if (currentValue.getRight() != null) {
                        currentValue = currentValue.getRight();

                    } else {
                        currentValue.setRight((newNode));
                        return;
                    }
                }
            }
        }
    }

    public Node<String> searchElement(Node<String> position) {
        Node<String> treePosition = position;
        switch (livesInWater) {
            case 0:
                if (treePosition.getLeft() != null) {
                    position = treePosition.getLeft();
                    return searchElement(position);
                } else if (treePosition.getRight() != null){
                    position = treePosition.getRight();
                    return searchElement(position);
                } else{
                    return (treePosition);
                }
        }
        return treePosition;
    }

    public Node<String> searchElementWithOneChild(Node<String> nodeWithNoChilds, Node<String> position) {
        Node<String> treePosition = position;
        switch (livesInWater) {
            case 0:
                if (treePosition.getLeft() != null) {
                    if (treePosition.getLeft().getValue() == nodeWithNoChilds.getValue()) {
                        return position;
                    } else {
                        position = treePosition.getLeft();
                        return (searchElementWithOneChild(nodeWithNoChilds, position));
                    }
                } else if (treePosition.getRight() != null) {
                    if (treePosition.getRight().getValue() == nodeWithNoChilds.getValue()){
                        return position;
                    }
                    position = treePosition.getRight();
                    return (searchElementWithOneChild(nodeWithNoChilds, position));
                } else{
                    return position;
                }

        }
        return position;
    }


    public Node<String> getRoot() {
        return root;
    }

    public void setRoot(Node<String> root) {
        this.root = root;
    }

    public boolean checkTree(Node<String> currentValue){
        if (currentValue != null){
            if (currentValue.getLeft() == null && currentValue.getRight() == null){
                return true;
            }
            checkTree(currentValue.getLeft());

        } else {
            checkTree(currentValue.getRight());
        }
        return false;
    }

    public int getLivesInWater() {
        return livesInWater;
    }

    public void setLivesInWater(int livesInWater) {
        this.livesInWater = livesInWater;
    }
}
