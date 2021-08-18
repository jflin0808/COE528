/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Jiafei Lin
 */
public class Odometer {

	private Counter CounterList[];
	private DigitCounter dc;
	private int size;

	public Odometer(int size) {
		this.size = size;
		if (size == 0)
			throw new IllegalArgumentException("Can't have size 0 odometer");
		CounterList = new Counter[size];
		dc = new DigitCounter();

		// create objects
		for (int i = 0; i < size; i++) {
			if (i == size - 1) {
				CounterList[i] = dc;
				break;
			}
			CounterList[i] = new LinkedDigitCounter();
		}
		// set left numbers
		for (int i = 0; i < size; i++) {
			if (i==size-1) break;
			CounterList[i].setLeft(CounterList[i + 1]);
		}

	}

	public void Increment() {
		CounterList[0].Increment();
	}

	public void Decrement() {
		CounterList[0].Decrement();
	}
	
        public String Count(){
            String s = "";
            for (Counter c : CounterList){
                s += c.Count();
            }
            return s;
        }
          
        public void Reset(){
		for (Counter c:CounterList){
			c.Reset();
		}
	}

	@Override
	public String toString() {
            return (this.Count());
	}

}