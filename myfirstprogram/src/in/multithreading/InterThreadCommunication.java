package in.multithreading;
//Producer Consumer Problem
//resourse clss
//put get method
//3.producer implements runnable
//in runnable create resource obj
//create producer method with resouce obj
//create thread inside pro method
//consumer implements runnable
//5.run method
//6.while condition in run method
//7.
class Resourse{
int i;
boolean status=false;
synchronized void put(int i) throws InterruptedException{//put method for producing the product
	while(status) {
		wait();
	}
	this.i=i;
	System.out.println("Put: "+i);
	status=true;
	notify();//to call consumer in wait
}
synchronized void get() throws InterruptedException {//get method is for consuming the product
	while(!status) {
		wait();
	}
	System.out.println("Get: "+i);
	status=false;
	notify();//to call producer in wait
	
}
}
class Producer1 implements Runnable{
	Resourse r1;
	 Producer1(Resourse r1){
		 this.r1=r1;
		 Thread t1=new Thread(this,"Producer1");
		 
		 t1.start();
	 }
	@Override
	public void run() {
		int i=0;
		while(true) {
		try {
			r1.put(i++);

			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	}
}
	class Consumer1 implements Runnable{
		Resourse r1;
		Consumer1(Resourse r1){
			this.r1=r1;
			Thread t1=new Thread(this,"Consumer1");
			t1.start();
		}
		
		@Override
		public void run(){
			while(true) {
			try {
				r1.get();

				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		}
	}
	

public class InterThreadCommunication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resourse r1=new Resourse();
		Producer1 p1=new Producer1(r1);
		Consumer1 c1=new Consumer1(r1);

	}

}
