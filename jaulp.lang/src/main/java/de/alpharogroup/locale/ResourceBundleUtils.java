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
package de.alpharogroup.locale;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import de.alpharogroup.lang.ClassExtensions;

/**
 * The class ResourceBundleUtils provides utility methods for the class ResourceBundle.
 */
public class ResourceBundleUtils
{

	/**
	 * Gets the string.
	 *
	 * @param resourceBundle
	 *            the resource bundle
	 * @param key
	 *            the key
	 * @return the string
	 */
	public static String getString(final ResourceBundle resourceBundle, final String key)
	{
		try
		{
			return resourceBundle.getString(key);
		}
		catch (final MissingResourceException e)
		{
			return "Warning:Missing key is '" + key + "'";
		}
	}

	/**
	 * Gets the string.
	 *
	 * @param resourceBundle
	 *            the resource bundle
	 * @param key
	 *            the key
	 * @param params
	 *            the parameters
	 * @return the string
	 */
	public static String getString(final ResourceBundle resourceBundle, final String key,
		final Object... params)
	{
		try
		{
			return MessageFormat.format(resourceBundle.getString(key), params);
		}
		catch (final MissingResourceException e)
		{
			return "Warning:Missing key is '" + key + "'";
		}
	}

	/**
	 * Gets the string.
	 *
	 * @param baseName
	 *            the base name of the resource bundle, a fully qualified class name
	 * @param locale
	 *            the locale for which a resource bundle
	 * @param key
	 *            the key
	 * @param params
	 *            the params
	 * @return the string
	 */
	public static String getString(final String baseName, final Locale locale, final String key,
		final Object... params)
	{
		final ResourceBundle resourceBundle = ResourceBundle.getBundle(baseName, locale);
		return getString(resourceBundle, key, params);
	}

	/**
	 * Creates a new resource key from the given object and the given key. The simple name of the
	 * given object will be taken as the prefix and the given keySuffix will be taken as suffix for
	 * the generated resource key.
	 *
	 * @param object
	 *            The object that will be used to generate the resource key.
	 * @param keySuffix
	 *            The suffix that will be used to generate the resource key.
	 * @param <T>
	 *            The generic type of the given object.
	 * @return The generated resource key.
	 */
	public static <T> String newResourceKey(final T object, final String keySuffix)
	{
		return ClassExtensions.getSimpleName(object.getClass()) + '.' + keySuffix;
	}
}
