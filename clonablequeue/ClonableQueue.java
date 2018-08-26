/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clonablequeue;

import java.util.PriorityQueue;

/**
 *
 * @author Lanie
 */
public class ClonableQueue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyPriorityQueue<String> queue = new MyPriorityQueue<>();
            queue.offer("Jeremiah");
            queue.offer("Jason");
            queue.offer("Judy");
            queue.offer("Donyale");

MyPriorityQueue<String> queue1 = null;
try {
queue1 = (MyPriorityQueue<String>)(queue.clone());
} catch (CloneNotSupportedException e) {
e.printStackTrace();
}

System.out.print(queue1);
}

static class MyPriorityQueue<E> extends PriorityQueue<E> implements Cloneable {

@Override
public Object clone() throws CloneNotSupportedException {

MyPriorityQueue<E> clone = new MyPriorityQueue<>();

this.forEach(clone::offer);

return clone;
}

}
}

    
