public class Tree<Type> {
    private Node<Type> root;
    private int livesInWater;
    public Tree(){
        this.root = null;
    }

    public void addNewElement(Type value, int livesInWater){
        Node<Type> newNode = new Node<Type>(value);
        if (root == null){
            this.root = newNode;
        } else {
            Node<Type> currentValue = this.root;
            while (true) {

                if (newNode.getValue() != null && livesInWater == 0) {
                    if (currentValue.getLeft() != null) {
                        currentValue = currentValue.getLeft();
                    } else {
                        currentValue.setLeft(newNode);

                    }
                } else if (newNode.getValue() != null && livesInWater == 1) {
                    if (currentValue.getRight() != null) {
                        currentValue = currentValue.getRight();
                    } else {
                        currentValue.setRight((newNode));
                        System.out.println(newNode.getValue());
                    }
                }
            }
        }
    }
//    public void addNewAnimalName(Type value, String animalChar, String animalName){
//        Node<Type> newNode = new Node<Type>(value);
//        if (root == null){
//            this.root = newNode;
//        } else {
//            Node<Type> currentValue = this.root;
//            while (true) {
//                if (newNode.getValue() != null) {
//                    if (currentValue.getLeft() != null) {
//                        currentValue = currentValue.getLeft();
//                    } else if (currentValue.getValue() == animalChar) {
//                        currentValue.setLeft(newNode.setValue(animalName));
//
//                    }
//                } else if (newNode.getValue() != null && livesInWater == 1) {
//                    if (currentValue.getRight() != null) {
//                        currentValue = currentValue.getRight();
//                    } else {
//                        currentValue.setRight((newNode));
//                        System.out.println(newNode.getValue());
//                    }
//                }
//            }
//        }
//    }


    @Override
    public String toString() {
        return "Tree{" +
                "root=" + root +
                ", livesInWater=" + livesInWater +
                '}';
    }
}
