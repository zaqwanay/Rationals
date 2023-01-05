package com.cooksys.ftd.assignments.objects;

import com.cooksys.ftd.assignments.objects.util.MissingImplementationException;

public class Rational implements IRational {
	/**
	 * ADD FIELDS
	 *
	 * Constructor for rational values of the type:
	 * <p>
	 * `numerator / denominator`
	 * <p>
	 * No simplification of the numerator/denominator pair should occur in this
	 * method.
	 *
	 * @param numerator   the numerator of the rational value
	 * @param denominator the denominator of the rational value
	 * @throws IllegalArgumentException if the given denominator is 0
	 */
	private int numerator;
	private int denominator;

	public Rational(int numerator, int denominator) throws IllegalArgumentException {
		if (denominator == 0) {
			throw new IllegalArgumentException();
		}
		this.numerator = numerator;
		this.denominator = denominator;

	}

	/**
	 * @return the numerator of this rational number
	 */
	@Override
	public int getNumerator() {
		return this.numerator;
	}

	/**
	 * @return the denominator of this rational number
	 */
	@Override
	public int getDenominator() {
		return this.denominator;
	}

	/**
	 * Specializable constructor to take advantage of shared code between Rational
	 * and SimplifiedRational
	 * <p>
	 * (FOCUS ON THIS) Essentially, this method allows us to implement most of
	 * IRational methods directly in the interface while preserving the underlying
	 * type
	 *
	 * @param numerator   the numerator of the rational value to construct
	 * @param denominator the denominator of the rational value to construct
	 * @return the constructed rational value
	 * @throws IllegalArgumentException if the given denominator is 0
	 */
	@Override
	public Rational construct(int numerator, int denominator) throws IllegalArgumentException {
		if (denominator == 0) {
			throw new IllegalArgumentException();
		}
		return new Rational(numerator, denominator);
	}

	/**
	 * @param obj the object to check this against for equality
	 * @return true if the given obj is a rational value and its numerator and
	 *         denominator are equal to this rational value's numerator and
	 *         denominator, false otherwise
	 */
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Rational) {
			Rational newRational = (Rational) obj; 
			return newRational.numerator == this.numerator && newRational.denominator == this.denominator;
		}
		return false;
	}

	@Override
	public String toString() {
		if ((getNumerator() < 0 && getDenominator() < 0 || getNumerator() > 0 && getDenominator() > 0)) {
			return Math.abs(getNumerator()) + "/" + Math.abs(getDenominator());
		} else if (getNumerator() < 0 || getDenominator() < 0) {
			
		}return "-" + Math.abs(getNumerator()) + "/" + Math.abs(getDenominator());
	}
}
		
