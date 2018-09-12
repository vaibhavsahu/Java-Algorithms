private int front;

public void push(int x) {
    if (s1.empty())
        front = x;
    while (!s1.isEmpty())
        s2.push(s1.pop());
    s2.push(x);
    while (!s2.isEmpty())
        s1.push(s2.pop());
}

public void pop() {
    s1.pop();
    if (!s1.empty())
        front = s1.peek();
}

public boolean empty() {
    return s1.isEmpty();
}

public int peek() {
  return front;
}


//2nd approach

private Stack<Integer> s1 = new Stack<>();
private Stack<Integer> s2 = new Stack<>();

// Push element x to the back of queue.
public void push(int x) {
    if (s1.empty())
        front = x;
    s1.push(x);
}


// Removes the element from in front of queue.
public void pop() {
    if (s2.isEmpty()) {
        while (!s1.isEmpty())
            s2.push(s1.pop());
    }
    s2.pop();    
}
