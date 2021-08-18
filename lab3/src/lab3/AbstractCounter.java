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
public abstract class AbstractCounter implements Counter {
	private int value;

	public AbstractCounter() {
		value = 0;
	}
	
	public int getValue() {
		return value;
	}
	
        public void setValue(int value){
		this.value = value;
	}

	public void Increment() {
		if (value < 9)
			value = value + 1;
		else {
			value = 0;
			// Increment digit to the left
		}
	}

	public void Decrement() {
		if (value > 0)
			value = value - 1;
		else {
			value = 9;
			// Decrement digit to the left
		}
	}

	public void Reset() {
		value = 0;
	}

	public String Count() {
		return Integer.toString(value);
	}

}
