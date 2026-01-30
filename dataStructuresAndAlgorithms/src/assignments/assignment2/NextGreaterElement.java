package assignments.assignment2;

import java.util.Stack;

public class NextGreaterElement {

    public static void main(String[] args) {
        NextGreaterElement obj = new NextGreaterElement();

        int[] numArr = {1, 2, 9, 4, 5, 3, 2, 8};
        int[] nge = obj.getNGE(numArr);

        for (int i: nge) {
            System.out.print(i + " ");
        }
    }

    private int[] getNGE(int[] numArr) {
        int[] nge = new int[numArr.length];

        Stack<Integer> st = new Stack<>();

        for (int i = numArr.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= numArr[i]) {
                st.pop();
            }

            if (!st.isEmpty()) {
                nge[i] = st.peek();
            } else {
                nge[i] = -1;
            }

            st.push(numArr[i]);
        }

        return nge;
    }

}
