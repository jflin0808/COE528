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

/* A basic up-down counter. */
public interface Counter {
	
    /* The current value of this Counter as a String of digits. */
	String Count();

	/* Increment this Counter. */
	void Increment();

	/* Decrement this Counter. */
	void Decrement();

	/* Reset this Counter. */
	void Reset();
	void setLeft(Counter c);
}