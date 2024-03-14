import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        System.out.println("alou");
        Tree<String> tree = new Tree<String>();
        Node<String> rootNode = new Node<>("root");
        tree.setRoot(rootNode);
        tree.addNewElement("um macaco", JOptionPane.NO_OPTION);
        tree.addNewElement("um tubarao", JOptionPane.YES_OPTION);

        animalGame.system(tree, rootNode);
    }
}