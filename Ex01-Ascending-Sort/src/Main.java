import javax.swing.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int stackSize = Integer.parseInt(JOptionPane.showInputDialog("Quantos items estarão na pilha ?"));
        int numbers;
        MyStack<Integer> stack = new MyStack<Integer>(stackSize);

        for(int i = 0; i < stackSize; i++) {
            numbers = Integer.parseInt(JOptionPane.showInputDialog("Digite o elemento"));
            stack.addItem(numbers);
            System.out.println(stack.unstack());
        }
    }
}