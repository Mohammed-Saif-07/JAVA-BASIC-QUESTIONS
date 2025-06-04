/* 

class A {
    public void show()
    {
        for(int i = 0 ; i <= 10 ; i++){
            System.out.println("hi");
        }
    }
}

class B {
    public void show()
    {
        for(int i = 0 ; i <= 10 ; i++){
            System.out.println("hello");
        }
    }
}

public class Multithreading {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        
        obj1.show();
        obj2.show();
    }
}

*/

//------------------------------------------------------------------------------

/* 

class A implements Thread{
    public void run()
    {
        for(int i = 0 ; i <= 10 ; i++){
            System.out.println("hi");
        }
    }
}

class B implements Thread {
    public void run()
    {
        for(int i = 0 ; i <= 10 ; i++){
            System.out.println("hello");
        }
    }
}

public class Multithreading {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        
        obj1.start();
        obj2.start();
    }
}

*/

//----------------------------------------------------------------------------

/* 

class A implements Thread{
    public void run()
    {
        for(int i = 0 ; i <= 10 ; i++){
            System.out.println("hi");
            try{
                Thread.sleep(10);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class B implements Thread {
    public void run()
    {
        for(int i = 0 ; i <= 10 ; i++){
            System.out.println("hello");
            try{
                Thread.sleep(10);
            } catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

public class Multithreading {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        
        // obj1.setPriority(Thread.MAX_PRIORITY);
        obj1.start();
        try{
            Thread.sleep(5);
        } catch(InterruptedException e){
            e.printStackTrace();
        }
        obj2.start();
    }
}

*/

//----------------------------------RUNNABLE------------------------------------

/* 

class A implements Runnable {
    public void run()
    {
        for(int i = 0 ; i <= 5 ; i++){
            System.out.println("hi");
            try{
                Thread.sleep(10);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class B implements Runnable {
    public void run()
    {
        for(int i = 0 ; i <= 5 ; i++){
            System.out.println("hello");
            try{
                Thread.sleep(10);
            } catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

public class Multithreading {
    public static void main(String[] args) {
        Runnable obj1 = new A();
        Runnable obj2 = new B();
        
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        // obj1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
    }
}

*/

//----------------------ANOTHER WAY------------------------------------------

/* 

public class Multithreading {
    public static void main(String[] args) {
        Runnable obj1 = new Runnable() {
            public void run()
            {
                    for(int i = 0 ; i <= 5 ; i++){
                        System.out.println("hi");
                    try{
                        Thread.sleep(10);
                        } catch(InterruptedException e){
                            e.printStackTrace();
                    }
                }
            }
        };
        Runnable obj2 = new Runnable() {
            public void run()
            {
                    for(int i = 0 ; i <= 5 ; i++){
                        System.out.println("hello");
                    try{
                        Thread.sleep(10);
                        } catch(InterruptedException e){
                            e.printStackTrace();
                    }
                }
            }
        };
        
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        // obj1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
    }
}

*/

//----------------------------RACE CONDITION--------------------------------

/* 

class Counter{
    int count;
    public synchronized void increment()
    {
        count++;
    }
}
public class Multithreading {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Runnable obj1 = new Thread (new Runnable() {
            public void run()
                {
                    for(int i = 0 ; i <= 100 ; i++){
                        c.increment();
                    }
                }
            });
        Runnable obj2 = new Thread (new Runnable() {
            public void run()
                {
                    for(int i = 0 ; i <= 100 ; i++){
                        c.increment();
                    }
                }
            });
        
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(c.count);
    }
}

*/

//----------DEADLOCK----------------------------------------------------

/* 

public class Multithreading {
    static Object lock1 = new Object();
    static Object lock2 = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 1: Holding lock 1...");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 1: Waiting for lock 2...");
                synchronized (lock2) {
                    System.out.println("Thread 1: Holding lock 1 and 2...");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Thread 2: Holding lock 2...");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 2: Waiting for lock 1...");
                synchronized (lock1) {
                    System.out.println("Thread 2: Holding lock 2 and 1...");
                }
            }
        });

        t1.start();
        t2.start();
    }
}

*/

//--------------------ATOMIC OPERATIONS------------------------------------

/* 

import java.util.concurrent.atomic.AtomicInteger;

class AtomicCounter {
    private AtomicInteger count = new AtomicInteger(0);

    public void increment() {
        count.incrementAndGet();
    }

    public int getCount() {
        return count.get();
    }
}

public class Multithreading {
    public static void main(String[] args) throws InterruptedException {
        AtomicCounter counter = new AtomicCounter();

        Runnable incrementTask = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        };

        Thread t1 = new Thread(incrementTask);
        Thread t2 = new Thread(incrementTask);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Atomic Count: " + counter.getCount());
    }
}

*/

//--------------PRODUCER - CONSUMER PROBLEM---------------------------------------

import java.util.LinkedList;

class SharedResource {
    private LinkedList<Integer> buffer = new LinkedList<>();
    private int capacity = 2;

    public void produce() throws InterruptedException {
        int value = 0;
        while (true) {
            synchronized (this) {
                while (buffer.size() == capacity) {
                    wait();
                }

                System.out.println("Producer produced: " + value);
                buffer.add(value++);
                notify();

                Thread.sleep(1000); // Simulate some work
            }
        }
    }

    public void consume() throws InterruptedException {
        while (true) {
            synchronized (this) {
                while (buffer.isEmpty()) {
                    wait();
                }

                int value = buffer.removeFirst();
                System.out.println("Consumer consumed: " + value);
                notify();

                Thread.sleep(1000); // Simulate some work
            }
        }
    }
}

public class Multithreading {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Thread producerThread = new Thread(() -> {
            try {
                sharedResource.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumerThread = new Thread(() -> {
            try {
                sharedResource.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}
