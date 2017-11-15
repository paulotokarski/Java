package data_structure.queue;

public class Queue implements InterfaceQueue {

    private int queue[];
    private int i, j, qtd;

    public Queue() {
        i = -1;
        j = -1;
        qtd = 0;
        queue = new int[100];
    }

    @Override
    public void insert(int n) {
        if(!isFull()) {
            if(i == -1)
                i++;
            if(j == (queue.length - 1))
                j = -1;
            j++;
            qtd++;
            queue[j] = n;
        }
    }

    @Override
    public int remove() {
        if(!isEmpty()) {
            int r = queue[i];
            i++;
            qtd--;
            return r;
        } else
            return -1;
    }

    @Override
    public int peek() {
        if(!isEmpty())
            return queue[j];
        else
            return -1;
    }

    @Override
    public boolean isEmpty() {
        return qtd == 0;
    }

    @Override
    public boolean isFull() {
        return qtd == (queue.length - 1);
    }

    @Override
    public void list() {
        for(int cont = j; cont <= j; cont++)
            System.out.println(queue[cont]);
    }
}