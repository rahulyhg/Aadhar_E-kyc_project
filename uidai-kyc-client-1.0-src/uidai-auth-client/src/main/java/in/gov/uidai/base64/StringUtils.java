/**
 * DISCLAIMER: The sample code or utility or tool described herein
 * is provided on an "as is" basis, without warranty of any kind.
 * UIDAI does not warrant or guarantee the individual success
 * developers may have in implementing the sample code on their
 * environment. 
 * 
 * UIDAI does not warrant, guarantee or make any representations
 * of any kind with respect to the sample code and does not make
 * any representations or warranties regarding the use, results
 * of use, accuracy, timeliness or completeness of any data or
 * information relating to the sample code. UIDAI disclaims all
 * warranties, express or implied, and in particular, disclaims
 * all warranties of merchantability, fitness for a particular
 * purpose, and warranties related to the code, or any service
 * or software related thereto. 
 * 
 * UIDAI is not responsible for and shall not be liable directly
 * or indirectly for any direct, indirect damages or costs of any
 * type arising out of use or any action taken by you or others
 * related to the sample code.
 * 
 * THIS IS NOT A SUPPORTED SOFTWARE.
 * 
 */
package in.gov.uidai.base64;


import java.io.UnsupportedEncodingException;

public class StringUtils {
	/**
	 * Encodes the given string into a sequence of bytes using the ISO-8859-1 charset, storing the result into a new
	 * byte array.
	 * 
	 * @param string
	 *            the String to encode
	 * @return encoded bytes
	 * @throws IllegalStateException
	 *             Thrown when the charset is missing, which should be never according the the Java specification.
	 * @see <a href="http://java.sun.com/j2se/1.4.2/docs/api/java/nio/charset/Charset.html">Standard charsets</a>
	 * @see #getBytesUnchecked(String, String)
	 */
	public static byte[] getBytesIso8859_1(String string) {
		return StringUtils.getBytesUnchecked(string, CharEncoding.ISO_8859_1);
	}

	/**
	 * Encodes the given string into a sequence of bytes using the US-ASCII charset, storing the result into a new byte
	 * array.
	 * 
	 * @param string
	 *            the String to encode
	 * @return encoded bytes
	 * @throws IllegalStateException
	 *             Thrown when the charset is missing, which should be never according the the Java specification.
	 * @see <a href="http://java.sun.com/j2se/1.4.2/docs/api/java/nio/charset/Charset.html">Standard charsets</a>
	 * @see #getBytesUnchecked(String, String)
	 */
	public static byte[] getBytesUsAscii(String string) {
		return StringUtils.getBytesUnchecked(string, CharEncoding.US_ASCII);
	}

	/**
	 * Encodes the given string into a sequence of bytes using the UTF-16 charset, storing the result into a new byte
	 * array.
	 * 
	 * @param string
	 *            the String to encode
	 * @return encoded bytes
	 * @throws IllegalStateException
	 *             Thrown when the charset is missing, which should be never according the the Java specification.
	 * @see <a href="http://java.sun.com/j2se/1.4.2/docs/api/java/nio/charset/Charset.html">Standard charsets</a>
	 * @see #getBytesUnchecked(String, String)
	 */
	public static byte[] getBytesUtf16(String string) {
		return StringUtils.getBytesUnchecked(string, CharEncoding.UTF_16);
	}

	/**
	 * Encodes the given string into a sequence of bytes using the UTF-16BE charset, storing the result into a new byte
	 * array.
	 * 
	 * @param string
	 *            the String to encode
	 * @return encoded bytes
	 * @throws IllegalStateException
	 *             Thrown when the charset is missing, which should be never according the the Java specification.
	 * @see <a href="http://java.sun.com/j2se/1.4.2/docs/api/java/nio/charset/Charset.html">Standard charsets</a>
	 * @see #getBytesUnchecked(String, String)
	 */
	public static byte[] getBytesUtf16Be(String string) {
		return StringUtils.getBytesUnchecked(string, CharEncoding.UTF_16BE);
	}

	/**
	 * Encodes the given string into a sequence of bytes using the UTF-16LE charset, storing the result into a new byte
	 * array.
	 * 
	 * @param string
	 *            the String to encode
	 * @return encoded bytes
	 * @throws IllegalStateException
	 *             Thrown when the charset is missing, which should be never according the the Java specification.
	 * @see <a href="http://java.sun.com/j2se/1.4.2/docs/api/java/nio/charset/Charset.html">Standard charsets</a>
	 * @see #getBytesUnchecked(String, String)
	 */
	public static byte[] getBytesUtf16Le(String string) {
		return StringUtils.getBytesUnchecked(string, CharEncoding.UTF_16LE);
	}

	/**
	 * Encodes the given string into a sequence of bytes using the UTF-8 charset, storing the result into a new byte
	 * array.
	 * 
	 * @param string
	 *            the String to encode
	 * @return encoded bytes
	 * @throws IllegalStateException
	 *             Thrown when the charset is missing, which should be never according the the Java specification.
	 * @see <a href="http://java.sun.com/j2se/1.4.2/docs/api/java/nio/charset/Charset.html">Standard charsets</a>
	 * @see #getBytesUnchecked(String, String)
	 */
	public static byte[] getBytesUtf8(String string) {
		return StringUtils.getBytesUnchecked(string, CharEncoding.UTF_8);
	}

	/**
	 * Encodes the given string into a sequence of bytes using the named charset, storing the result into a new byte
	 * array.
	 * <p>
	 * This method catches {@link UnsupportedEncodingException} and rethrows it as {@link IllegalStateException}, which
	 * should never happen for a required charset name. Use this method when the encoding is required to be in the JRE.
	 * </p>
	 * 
	 * @param string
	 *            the String to encode
	 * @param charsetName
	 *            The name of a required {@link java.nio.charset.Charset}
	 * @return encoded bytes
	 * @throws IllegalStateException
	 *             Thrown when a {@link UnsupportedEncodingException} is caught, which should never happen for a
	 *             required charset name.
	 * @see CharEncoding
	 * @see String#getBytes(String)
	 */
	public static byte[] getBytesUnchecked(String string, String charsetName) {
		if (string == null) {
			return null;
		}
		try {
			return string.getBytes(charsetName);
		} catch (UnsupportedEncodingException e) {
			throw StringUtils.newIllegalStateException(charsetName, e);
		}
	}

	private static IllegalStateException newIllegalStateException(String charsetName, UnsupportedEncodingException e) {
		return new IllegalStateException(charsetName + ": " + e);
	}

	/**
	 * Constructs a new <code>String</code> by decoding the specified array of bytes using the given charset.
	 * <p>
	 * This method catches {@link UnsupportedEncodingException} and re-throws it as {@link IllegalStateException}, which
	 * should never happen for a required charset name. Use this method when the encoding is required to be in the JRE.
	 * </p>
	 * 
	 * @param bytes
	 *            The bytes to be decoded into characters
	 * @param charsetName
	 *            The name of a required {@link java.nio.charset.Charset}
	 * @return A new <code>String</code> decoded from the specified array of bytes using the given charset.
	 * @throws IllegalStateException
	 *             Thrown when a {@link UnsupportedEncodingException} is caught, which should never happen for a
	 *             required charset name.
	 * @see CharEncoding
	 * @see String#String(byte[], String)
	 */
	public static String newString(byte[] bytes, String charsetName) {
		if (bytes == null) {
			return null;
		}
		try {
			return new String(bytes, charsetName);
		} catch (UnsupportedEncodingException e) {
			throw StringUtils.newIllegalStateException(charsetName, e);
		}
	}

	/**
	 * Constructs a new <code>String</code> by decoding the specified array of bytes using the ISO-8859-1 charset.
	 * 
	 * @param bytes
	 *            The bytes to be decoded into characters
	 * @return A new <code>String</code> decoded from the specified array of bytes using the given charset.
	 * @throws IllegalStateException
	 *             Thrown when a {@link UnsupportedEncodingException} is caught, which should never happen since the
	 *             charset is required.
	 */
	public static String newStringIso8859_1(byte[] bytes) {
		return StringUtils.newString(bytes, CharEncoding.ISO_8859_1);
	}

	/**
	 * Constructs a new <code>String</code> by decoding the specified array of bytes using the US-ASCII charset.
	 * 
	 * @param bytes
	 *            The bytes to be decoded into characters
	 * @return A new <code>String</code> decoded from the specified array of bytes using the given charset.
	 * @throws IllegalStateException
	 *             Thrown when a {@link UnsupportedEncodingException} is caught, which should never happen since the
	 *             charset is required.
	 */
	public static String newStringUsAscii(byte[] bytes) {
		return StringUtils.newString(bytes, CharEncoding.US_ASCII);
	}

	/**
	 * Constructs a new <code>String</code> by decoding the specified array of bytes using the UTF-16 charset.
	 * 
	 * @param bytes
	 *            The bytes to be decoded into characters
	 * @return A new <code>String</code> decoded from the specified array of bytes using the given charset.
	 * @throws IllegalStateException
	 *             Thrown when a {@link UnsupportedEncodingException} is caught, which should never happen since the
	 *             charset is required.
	 */
	public static String newStringUtf16(byte[] bytes) {
		return StringUtils.newString(bytes, CharEncoding.UTF_16);
	}

	/**
	 * Constructs a new <code>String</code> by decoding the specified array of bytes using the UTF-16BE charset.
	 * 
	 * @param bytes
	 *            The bytes to be decoded into characters
	 * @return A new <code>String</code> decoded from the specified array of bytes using the given charset.
	 * @throws IllegalStateException
	 *             Thrown when a {@link UnsupportedEncodingException} is caught, which should never happen since the
	 *             charset is required.
	 */
	public static String newStringUtf16Be(byte[] bytes) {
		return StringUtils.newString(bytes, CharEncoding.UTF_16BE);
	}

	/**
	 * Constructs a new <code>String</code> by decoding the specified array of bytes using the UTF-16LE charset.
	 * 
	 * @param bytes
	 *            The bytes to be decoded into characters
	 * @return A new <code>String</code> decoded from the specified array of bytes using the given charset.
	 * @throws IllegalStateException
	 *             Thrown when a {@link UnsupportedEncodingException} is caught, which should never happen since the
	 *             charset is required.
	 */
	public static String newStringUtf16Le(byte[] bytes) {
		return StringUtils.newString(bytes, CharEncoding.UTF_16LE);
	}

	/**
	 * Constructs a new <code>String</code> by decoding the specified array of bytes using the UTF-8 charset.
	 * 
	 * @param bytes
	 *            The bytes to be decoded into characters
	 * @return A new <code>String</code> decoded from the specified array of bytes using the given charset.
	 * @throws IllegalStateException
	 *             Thrown when a {@link UnsupportedEncodingException} is caught, which should never happen since the
	 *             charset is required.
	 */
	public static String newStringUtf8(byte[] bytes) {
		return StringUtils.newString(bytes, CharEncoding.UTF_8);
	}
}

