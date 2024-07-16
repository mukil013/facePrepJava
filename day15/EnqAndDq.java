import java.util.*;

public class EnqAndDq {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        CustomQueue cq = new CustomQueue();
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            switch (num) {
                case 1:
                    cq.enq(in.nextInt());
                    break;
                case 2:
                    cq.deq();
                    break;
                case 3:
                    System.out.println(cq.peek());
                    break;
            }
        }
        in.close();
    }
}

class CustomQueue {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    void enq(int n) {
        s1.push(n);
    }

    int peek() {
        if (s2.empty()) {
            while (!s1.empty()) s2.push(s1.pop());
        }
        return s2.peek();
    }

    int deq() {
        if (s2.empty()) {
            while (!s1.empty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }
}
