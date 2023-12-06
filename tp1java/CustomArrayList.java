public class CustomArrayList {
    protected int[] arraylist;
    protected int size;

    public CustomArrayList() {
        this(10);
    }

    public CustomArrayList(int initialsize) {

        this.arraylist = new int[initialsize];
        this.size = 0;
    }

    public void add(int obj) {

        int[] arrayt = new int[size + 1];

        for (int i = 0; i < this.size; i++) {

            arrayt[i] = arraylist[i];

        }
        arrayt[size] = obj;
        this.arraylist = arrayt;
        this.size++;
    }

    public void add(int index, int x) {
        if (index < (size + 1)) {
            if (index == size) {
                this.add(x);
            } else {
                int[] arrayt = new int[size + 1];

                for (int i = 0; i < index; i++) {

                    arrayt[i] = arraylist[i];

                }
                arrayt[index] = x;

                for (int i = index + 1; i < size + 1; i++) {

                    arrayt[i] = arraylist[i - 1];
                }
                this.arraylist = arrayt;
                size++;
            }
        }
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of range");
        } else {
            return (arraylist[index]);
        }
    }

    int size() {
        return (size);
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isln(int x) {
       if (this.find(x)!=-1){
            return (true);
       }
        return (false);
    }

    public int find(int value) {
        for (int i = 0; i < size; i++) {
            if (arraylist[i] == value) {
                return (i);
            }
        }
        return (-1);
    }
    public void remove(int x) {
        for (int i = 0; i < size; i++) {
            if (arraylist[i] == x) {
                for (int j = i; j < size - 1; j++) {
                    arraylist[j] = arraylist[j + 1];
                }
                size--;
                System.out.println( "size of array;"+size );
                return;
            }
        }
    }
}
