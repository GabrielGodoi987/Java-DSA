import javax.swing.*;
import java.util.Stack;

// T - representa o tipo da pilha que pode ser definido conforme o necessário
public class MyStack<T> {
    private Stack<T> stack;
    private final int stackSize;

    // metodo para criar a pilha, baseado em um tamanho fixo
    public MyStack(int stackSize) {
        this.stack = new Stack<>();
        this.stackSize = stackSize;
    }

    public void addItem(T item)
    {
       if(this.stack.size() != this.stackSize)
       {
           this.stack.push(item);
       }else {
           JOptionPane.showMessageDialog(null,"Pilha cheia");
       }
    }

    public T  unstack()
    {
      return !this.stack.isEmpty() ? this.stack.pop() : null;
    }
}
