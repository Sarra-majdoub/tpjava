public class CustomStack {
    protected int[] elements ;
    protected int capacity;
    protected int index;

    public CustomStack(int capacity){
        this.index=-1;
        this.capacity=capacity;
        this.elements= new int[capacity];
    }
    public void AddElement(int element) {
        if (index==capacity-1) {
            System.out.println("can not add elements");
            return ;
        }
        index++;
        elements[index]=element;
    }
    public void RemoveElement(){
        if (index==-1){
            System.out.println("stack is empty");
            return;
        }
        index--;
    }
    public int lastInStack() {
        if (index == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return elements[index];
    }
    public boolean StackIsEmpty(){
        return(index==-1);
    }
    public boolean StackIsFull(){
        return index== capacity-1;
    }
    public void Affiche_Stack() {
        for (int i = 0; i <= index ; i++) {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[]args){
        CustomStack customStack= new CustomStack(4);

        System.out.println( customStack.StackIsEmpty());

        customStack.AddElement(5);
        customStack.AddElement(2);
        customStack.AddElement(4);

        customStack.Affiche_Stack();

        System.out.println( customStack.lastInStack());

        customStack.RemoveElement();
        customStack.Affiche_Stack();

        System.out.println( customStack.lastInStack());

        customStack.AddElement(6);
        customStack.AddElement(8);
        System.out.println( customStack.StackIsFull());
    }
}


