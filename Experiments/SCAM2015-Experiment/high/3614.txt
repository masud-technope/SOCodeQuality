class Job implements Runnable{

    Bankaccount b;

    Job(Bankaccount b){
        this.b = b;
    }

    public void run(){
        if (b != null)
            if(b.getBalance()>100){
                System.out.println("the balanced ammount is " + b.getBalance());
                makeWithdrawal(100);
            }
    }

    public void makeWithdrawal(int ammount){
        b.withdraw(ammount);
        System.out.println(b.getBalance());
    }

    public static void main(String[] args) {

        // Creating one Bankaccount instance
        Bankaccount b = new Bankaccount();

        // Passing one instance to different threads 
        Job x=new Job(b);
        Job y=new Job(b);

        Thread t1=new Thread(x);
        Thread t2=new Thread(y);

        // Race conditions may appear 
        t1.start();
        t2.start();
    }

}