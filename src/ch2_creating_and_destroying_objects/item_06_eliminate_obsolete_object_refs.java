public class item_06_eliminate_obsolete_object_refs{

    public static void main(String[] args){
        System.out.println("creating a new stack...");
        Stack s = new Stack();
        for(int i=0;i< Integer.MAX_VALUE;i++){
            s.push(new Object());
            s.pop();
        }



    }
    // Can you spot the "memory leak"?
    public static class Stack {
        private Object[] elements;
        private int size = 0;
        private int DEFAULT_INITIAL_CAPACITY = 16;

        public Stack() {
            elements = new Object[DEFAULT_INITIAL_CAPACITY];
        }

        public void push(Object e) {
            ensureCapacity();
            elements[size++] = e;
        }

        public Object pop() {
            if (size == 0)
                throw new java.util.EmptyStackException();
            return elements[--size];
        }

        /**
         * Ensure space for at least one more element, roughly
         * doubling the capacity each time the array needs to grow.
         */
        private void ensureCapacity() {
            if (elements.length == size)
                elements = java.util.Arrays.copyOf(elements, 2 * size + 1);
        }
    }


}
