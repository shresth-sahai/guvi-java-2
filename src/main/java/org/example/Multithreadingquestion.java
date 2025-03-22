// Write a Java program that prints even and odd numbers alternately using two threads. 
// One thread should print even numbers, and the other should print odd numbers. 
// The output should be in a sequence, e.g., 1, 2, 3, 4, 5, 6,....

class evenOddPrint{

    private int number=1;
    private final int MAX=100;

    // method fr even numbers 

    public synchronised void printEven() throws InterruptedException{

        while(number<=MAX){
            // wait if no is odd 
            while(number % 2 !=0 ){
                wait();
            }
            System.out.println(number);
            number++;
            notify();
        }

    }
    public synchronised void printOdd() throws InterruptedException}{

        while(number<=MAX){
            // wait if no is odd 
            while(number % 2 ==0 ){
                wait();
            }
            System.out.println(number);
            number++;
            notify();
        }
    }

    public static void main(){

        evenOddPrint p=new evenOddPrint();
        Thread e=new Thread(()->{
            try{
                print.printEven();

            }
            catch(e){

            }
        });

        Thread o=new Thread(()->{
            try{
                print.printOdd();

            }
            catch(e){

            }
        });
    }
    }


    }


    // You have a shared resource (e.g., a list of records) 
    // that can be read by multiple threads but can only be written by one thread at a time. 
    // Implement a system with multiple reader threads and a single writer thread

    class SharedResource{
        private String data="Initial data";

        private final ReadWriteLock lock=new ReentrantLock();

        public void read(){
            lock.readLock().lock();
            try{
                Sysyem.out.print(Thread.currentTHread().getname());
                return data;
            }
            finally{
lock.readLock.unlock();
            }
        }
        public String write(){
            lock.writeLock().lock();
            try{
                data=newData;
                Sysyem.out.print(Thread.currentTHread().getname());
            }
            finally{
lock.writeLock.unlock();
            }
        }
 // r1,r2,r3 
 // w1


    }



    // In a banking system, multiple threads might access the same account 
    // balance (e.g., deposits or withdrawals). A transaction should ensure that 
    // the account balance is updated
    //  correctly and consistently even with concurrent deposits or withdrawals.

    // Suppose several threads need to read from or write to a shared file. 
    // Reading operations can be performed simultaneously, 
    // but writing requires exclusive access to
    //  ensure the file content is not corrupted.



    // A cache is used to store frequently accessed data. Multiple threads
    //  may access the cache at the same time, and occasionally, the cache might need to be updated or
    //  invalidated (e.g., when the data expires or is updated).



    // In this problem, multiple philosophers sit at a table with a fork between each pair
    //  of philosophers. A philosopher can either think or eat. To eat, a philosopher needs both forks. 
    // The challenge is to avoid deadlocks and ensure that all philosophers get a chance to eat.