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
public class DigitCounter extends AbstractCounter {

	private int val;

	public DigitCounter() {
		super();
		val = super.getValue();
	}

	@Override
	public void Increment() {
            if (val < 9)
                val++;
            else 
                val = 0;
	}
	
	@Override
	public void Reset() {
		val = 0;
	}

	@Override
	public String toString() {
		return Integer.toString(val);
	}

	@Override
	public void setLeft(Counter c) {
		// TODO Auto-generated method stub
	}

}