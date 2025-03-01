package ArrayDSAPractiseQuestion;

public class CustomArrayList {
  private int[] array;
  private int size;
  public static  final  int FINAL_CAPACITY=10;

  // Creating a constructor
    public CustomArrayList(){
        array = new int[FINAL_CAPACITY];
        size=0;
    }
    public void add(int data)
    {
        if(size == array.length)
        {
            expandArray();
        }
        array[size++] = data;
    }

    public void remove(int index)
    {
        if(index < 0 || index >= size)
        {
            System.out.println("Invalid index");
        }
        for(int i=index; i < size-1; i++){
            array[i] = array[i+1];
        }
        size--;
    }

    private  void expandArray()
    {
        int newCapacity = array.length;
        int [] newArray = new int[newCapacity];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

    public void print()
    {
        for(int i=0; i < size; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(1);
        System.out.println("ArrayList after adding elements");
        list.print();

        list.remove(4);
        System.out.println("ArrayList after removing elements");
        list.print();

    }
}
/*
1.) add the elements
2.) remove the elements
3.) Find an element
*/

