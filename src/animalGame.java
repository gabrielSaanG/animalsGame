import javax.swing.JOptionPane;

public class animalGame {

    public static void system(Tree<String> tree, Node<String> rootNode) {
        do {
            JOptionPane.showMessageDialog(null, "Pense em um animal", "Jogo dos Animais", JOptionPane.INFORMATION_MESSAGE);
            int livesInWater = JOptionPane.showConfirmDialog(null, "O animal que você pensou vive na água?", "Jogo do Animais", JOptionPane.YES_NO_OPTION);
            tree.setLivesInWater(livesInWater);
            switch (livesInWater){
                case JOptionPane.YES_OPTION:
                    question(rootNode.getLeft(), tree);
                    break;
                case JOptionPane.NO_OPTION:
                    question(rootNode.getRight(), tree);
                    break;
                case JOptionPane.CLOSED_OPTION:
                    System.exit(0);
            }
        } while (true);
    }

    public static void question(Node<String> node, Tree<String> tree) {
        int resp;
        do {
            resp = JOptionPane.showConfirmDialog(null, "O animal que você pensou " + node.getValue() + " ?", "Jogo dos animais", JOptionPane.YES_NO_OPTION);

            switch (resp) {
                case JOptionPane.YES_OPTION:
                    if (node.getLeft() != null) {
                        node = node.getLeft();
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "Acertei denovo!");
                        return;
                    }
                case JOptionPane.NO_OPTION:
                    if (node.getRight() != null) {
                        System.out.println(node.getRight().getValue());
                        node = node.getRight();
                    } else {
                        creation(node);
                        resp = 2;
                    }
                    break;
                case JOptionPane.CLOSED_OPTION:
                    System.exit(0);
            }
        } while (resp != 2);
    }

    public static void creation(Node<String> node){
      String animalName = JOptionPane.showInputDialog("Qual animal você pensou? ");
      String animalChar = JOptionPane.showInputDialog("Um " + animalName + " _______ mas um " + node.getValue() + " não" );

      Node <String> newAnimalCharNode = new Node<String>(animalChar);

      Node<String> newAnimalNameNode = new Node<String>(animalName);

      node.setRight(newAnimalCharNode);
      newAnimalCharNode.setLeft(newAnimalNameNode);
        System.out.println("creation: " + node.getRight().getValue());
    }

}
