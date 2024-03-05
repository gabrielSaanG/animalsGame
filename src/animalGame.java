import javax.swing.JOptionPane;

public class animalGame {

    public static void system() {

        Tree<String> tree = new Tree<String>();
        tree.addNewElement(null, 2);
        tree.addNewElement("um tubarão", JOptionPane.YES_OPTION);
        do {
            JOptionPane.showConfirmDialog(null, "Pense em um animal", "Jogo dos Animais", JOptionPane.OK_OPTION);
            int livesInWater = JOptionPane.showConfirmDialog(null, "O animal que você pensou vive na água?", "Jogo do Animais", JOptionPane.YES_NO_OPTION);
            tree.setLivesInWater(livesInWater);
            guessSelectionFrame(tree);
        } while (true);
    }

    public static void guessSelectionFrame(Tree<String> tree) {
            int ret = JOptionPane.showConfirmDialog(null, "O animal que você pensou é " + tree.searchElement(tree.getRoot()).getValue() + " ?", "Jogo dos Animais", JOptionPane.YES_NO_OPTION);
            Node<String> nodeWithNoChilds = tree.searchElement(tree.getRoot());
            if (ret == JOptionPane.NO_OPTION) {
                ret = JOptionPane.showConfirmDialog(null, "O animal que você pensou é " + tree.searchElementWithOneChild(nodeWithNoChilds, tree.getRoot()).getValue() + " ?", "Jogo dos Animais", JOptionPane.YES_NO_OPTION);
//                String animalName = JOptionPane.showInputDialog("Qual animal você pensou?");
//                String animalChar = JOptionPane.showInputDialog(animalName + " ____, mas um tubarão não");
//                tree.addNewElement(animalName, JOptionPane.NO_OPTION);
//                tree.addNewElement(animalChar, JOptionPane.YES_OPTION);
            } else {
                JOptionPane.showMessageDialog(null, "Acertei denovo! ");
                animalGame.system();
            }

        }


    }
