package Collections;
import java.util.PriorityQueue;

public class CustomPriorityQueue {

        private PriorityQueue<Integer> queue;

        public CustomPriorityQueue()
        {
            this.queue = new PriorityQueue<>();
        }

        // Enqueue (Add element)
        public void enqueue(int value)
        {
            queue.add(value);
            printQueue();
        }

        // Dequeue (Remove element with hisghest priority i.e , smallest)
        public int dequeue()
        {
            if(isEmpty()) {
                System.out.println("Queue is empty! Cannot dequeue");
                return -1;
            }
            int removedValue = queue.poll(); // Removes the smallest element
            printQueue();
            return  removedValue;
        }


        // Peek(View the highest priority element)
        public int peek()
       {
        if(isEmpty()){
            System.out.println("Queue is empty! No front element");
            return-1;
        }
        return  queue.peek();
      }

      // Check if the queue is empty
    public boolean isEmpty()
    {
        return queue.isEmpty();
    }

    // Get the size of the queue
     public int size()
     {
        return queue.size();
     }

     // Print queue elements
    public void printQueue()
    {
        System.out.println("Priority Queue :" + queue);
    }


    // Main class to test the priority queue
        public static  void main(String[] args)
        {
            CustomPriorityQueue pq = new CustomPriorityQueue();

            pq.enqueue(30);
            pq.enqueue(10);
            pq.enqueue(20);
            pq.enqueue(5);

            System.out.println("Front elements (Highest Priority): " + pq.peek());
            pq.dequeue();
            pq.dequeue();

            System.out.println("Queue size :" + pq.size());
            pq.enqueue(15);
            pq.enqueue(25);

            System.out.println("Queue is empty ?" + pq.isEmpty());

        }
    }


