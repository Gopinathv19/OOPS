package Threads;


public class SimpleSync {
    // Shared resource
    private
 
int count = 0;

    public
 
synchronized
 
void
 
increment()
 
{
        count++;
    }

    public
 
int
 
getCount()
 
{
        return count;
    }

    public
 
static
 
void
 
main(String[] args)
 
throws InterruptedException {
        SimpleSync sync = new SimpleSync();

        // Create and start two threads
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                sync.increment();
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                sync.increment();
            }
        });

        thread1.start();
        thread2.start();

        // Wait for threads to finish
        thread1.join();
        thread2.join();

        // Print the final count
        System.out.println("Final count: " + sync.getCount());
    }
}
