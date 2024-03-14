import javax.swing.JOptionPane;

public class animalGame {

    public static Object system(Tree<String> tree, Node<String> rootNode) {
        do {
            JOptionPane.showConfirmDialog(null, "Pense em um animal", "Jogo dos Animais", JOptionPane.OK_OPTION);
            int livesInWater = JOptionPane.showConfirmDialog(null, "O animal que você pensou vive na água?", "Jogo do Animais", JOptionPane.YES_NO_OPTION);
            tree.setLivesInWater(livesInWater);
            switch (livesInWater){
                case JOptionPane.YES_OPTION:
                    question(rootNode.getLeft());
                    break;
                case JOptionPane.NO_OPTION:
                    question(rootNode.getRight());
                    break;
            }
        } while (true);
    }

    public static void question(Node<String> node) {
        int resp;
        do {
            resp = JOptionPane.showConfirmDialog(null, "O animal que você pensou" + node.getValue() + " ?", "Jogo dos animais", JOptionPane.YES_NO_OPTION);

            switch (resp) {
                case JOptionPane.YES_OPTION:
                    if (node.getLeft() != null) {
                        node = node.getLeft();
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "Acertei denovo!");
                        break;
                    }
                case JOptionPane.NO_OPTION:
                    if (node.getRight() != null) {
                        System.out.println(node.getRight().getValue());
                        node = node.getRight();
                        break;
                    } else {
                        node = creation(node);
                        System.out.println("pós criacao: " + node.getValue());
                        resp = 2;
                        break;
                    }
            }
        } while (resp != 2);
    }

    public static Node<String> creation(Node<String> node){
      String animalName = JOptionPane.showInputDialog("Qual animal você pensou? ");
      String animalChar = JOptionPane.showInputDialog("O que o diferencia? ");

      Node <String> newAnimalCharNode = new Node<String>(animalChar);

      Node<String> newAnimalNameNode = new Node<String>(animalName);

      node.setRight(newAnimalCharNode);
      newAnimalCharNode.setLeft(newAnimalNameNode);
        System.out.println("creation: " + node.getRight().getValue());
      return node.getRight();
    }

}
