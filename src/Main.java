import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Pense em um animal", "Jogo dos Animais", JOptionPane.OK_OPTION);
        Tree<String> tree = new Tree<String>();
        int livesInWater = JOptionPane.showConfirmDialog(null, "O animal que você pensou vive na água?", "Jogo do Animais", JOptionPane.YES_NO_OPTION);
        if (livesInWater == JOptionPane.YES_OPTION) {
            int ret = JOptionPane.showConfirmDialog(null, "O animal que você pensou é um tubarão?");
            if (ret == JOptionPane.NO_OPTION){

                tree.addNewElement("root", livesInWater);

                String animalName = JOptionPane.showInputDialog("Qual animal você pensou?");
                String animalChar = JOptionPane.showInputDialog("Um "+ animalName + " ____, mas um tubarão não");
                tree.addNewElement(animalChar, livesInWater);
                System.out.println(tree);
            }

        } else {
            tree.addNewElement("root", livesInWater);

            String animalName = JOptionPane.showInputDialog("Qual animal você pensou?");
            String animalChar = JOptionPane.showInputDialog("Um "+ animalName + " ____, mas um tubarão não");
            tree.addNewElement(animalChar, livesInWater);
            System.out.println(tree);
            System.out.println("Não chegamos aqui ainda!");
        }
    }
}