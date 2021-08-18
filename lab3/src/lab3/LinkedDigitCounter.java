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
public class LinkedDigitCounter extends AbstractCounter {
	private Counter left;
	AbstractCounter ac;

	public LinkedDigitCounter() {
            super();
	}

	public void setLeft(Counter c) {
            this.left = c;
            ac = (AbstractCounter)left;
	}

	@Override
	public void Increment() {
            if (super.getValue() < 9) {
                super.Increment();
            } 
            else {
                super.Reset();
                left.Increment();
		}
	}

	@Override
	public void Decrement() {
		
		if (super.getValue()>0){
                    super.Decrement();
		}
                else{
                    ac.Decrement();
                    super.setValue(9);
		}
	}

	@Override
	public String toString() {
            return Integer.toString(super.getValue());
	}
}