import java.util.*;

class Q735_asteroid_collision {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> st = new ArrayDeque<>();
        for (int a : asteroids) {
            boolean alive = true;

            while (alive && a < 0 && !st.isEmpty() && st.peekLast() > 0) {
                int top = st.peekLast();
                if (top < -a) {         // top explodes, keep checking with new top
                    st.pollLast();
                } else if (top == -a) { // both explode
                    st.pollLast();
                    alive = false;
                } else {                // a explodes
                    alive = false;
                }
            }

            if (alive) st.addLast(a);
        }

        int[] res = new int[st.size()];
        int i = 0;
        for (int v : st) res[i++] = v;
        return res;
    }
}