/**
 * The MIT License
 *
 * Copyright (C) 2007 Asterios Raptis
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package de.alpharogroup.designpattern.observer.exception;

import java.util.Objects;

/**
 * The Class ExceptionEvent.
 */
public class ExceptionEvent
{

	/** The value. */
	private Throwable value;

	public ExceptionEvent(final Throwable value)
	{
		super();
		this.value = value;
	}

	@Override
	public boolean equals(final Object obj)
	{
		if (obj == null)
		{
			return false;
		}
		if (getClass() != obj.getClass())
		{
			return false;
		}
		final ExceptionEvent other = (ExceptionEvent)obj;
		return Objects.equals(this.value, other.value);
	}

	/**
	 * Gets the value.
	 *
	 * @return the value
	 */
	public Throwable getValue()
	{
		return value;
	}

	/**
	 * Override hashCode.
	 *
	 * @return the Objects hashcode.
	 */
	@Override
	public int hashCode()
	{
		int hashCode = 1;
		hashCode = 31 * hashCode + (value == null ? 0 : value.hashCode());
		return hashCode;
	}

	/**
	 * Sets the value.
	 *
	 * @param value
	 *            the new value
	 */
	public void setValue(final Throwable value)
	{
		this.value = value;
	}

}