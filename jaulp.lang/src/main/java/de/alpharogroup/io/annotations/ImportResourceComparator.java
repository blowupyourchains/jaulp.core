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
package de.alpharogroup.io.annotations;

import java.io.Serializable;
import java.util.Comparator;

/**
 * The Class ImportResourceComparator compares two given ImportResource objects based on the index.
 */
public class ImportResourceComparator implements Comparator<ImportResource>, Serializable
{

	/**
	 * The serialVersionUID.
	 */
	private static final long serialVersionUID = 6972397205717174979L;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int compare(final ImportResource object, final ImportResource compareWithObject)
	{
		// Check if one of the objects are null
		if (object != null && compareWithObject == null)
		{
			return 1;// compareWithObject is null so its bigger
		}
		else if (object == null && compareWithObject != null)
		{
			return -1; // object is null so its smaller
		}
		else if (object == compareWithObject)
		{
			return 0;// it is the same Object
		}
		else
		{ // compare the two indexes from the objects
			final int indexOjbect = object.index();
			final int indexCompareWithObject = compareWithObject.index();
			if (indexOjbect > indexCompareWithObject)
			{
				return 1; // bigger
			}
			else if (indexOjbect < indexCompareWithObject)
			{
				return -1; // smaller
			}
			else
			{
				return 0; // same index.
			}
		}
	}

}
