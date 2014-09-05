package com.yuer.stockanalyzer.util;

import java.nio.charset.Charset;

/**
 * Charsets required of every implementation of the Java platform.
 *
 * From the Java documentation <a href="http://docs.oracle.com/javase/6/docs/api/java/nio/charset/Charset.html">Standard
 * charsets</a>:
 * <p>
 * <cite>Every implementation of the Java platform is required to support the following character encodings. Consult the
 * release documentation for your implementation to see if any other encodings are supported. Consult the release
 * documentation for your implementation to see if any other encodings are supported. </cite>
 * </p>
 *
 * <ul>
 * <li><b>US-ASCII</b><br/>
 * Seven-bit ASCII, a.k.a. ISO646-US, a.k.a. the Basic Latin block of the Unicode character set.</li>
 * <li><b>ISO-8859-1</b><br/>
 * ISO Latin Alphabet No. 1, a.k.a. ISO-LATIN-1.</li>
 * <li><b>UTF-8</b><br/>
 * Eight-bit Unicode Transformation Format.</li>
 * <li><b>UTF-16BE</b><br/>
 * Sixteen-bit Unicode Transformation Format, big-endian byte order.</li>
 * <li><b>UTF-16LE</b><br/>
 * Sixteen-bit Unicode Transformation Format, little-endian byte order.</li>
 * <li><b>UTF-16</b><br/>
 * Sixteen-bit Unicode Transformation Format, byte order specified by a mandatory initial byte-order mark (either order
 * accepted on input, big-endian used on output.)</li>
 * <li><b>GBK</b><br/>
 * GBK is an extension of the GB2312 character set for simplified Chinese characters, used in the People's Republic of China.
 * A character is encoded as 1 or 2 bytes.</li>
 * <li><b>GB2312</b><br/>
 * GB2312 is the registered internet name for a key official character set of the People's Republic of China, used for simplified Chinese characters.</li>
 * </ul>
 *
 * This perhaps would best belong in the Commons Lang project. Even if a similar class is defined in Commons Lang, it is
 * not foreseen that Commons Codec would be made to depend on Commons Lang.
 *
 * <p>
 * This class is immutable and thread-safe.
 * </p>
 * 
 * @author <a href="mailto:joe.dengtao@gmail.com">DengTao</a>
 * @version 1.0
 * @since 1.0
 */
public class CharsetUtils {
	
    /**
     * CharEncodingISO Latin Alphabet No. 1, a.k.a. ISO-LATIN-1.
     * <p>
     * Every implementation of the Java platform is required to support this character encoding.
     *
     * @see <a href="http://docs.oracle.com/javase/6/docs/api/java/nio/charset/Charset.html">Standard charsets</a>
     * @since 1.0
     */
    public static final Charset ISO_8859_1 = Charset.forName("ISO-8859-1");

    /**
     * Seven-bit ASCII, also known as ISO646-US, also known as the Basic Latin block of the Unicode character set.
     * <p>
     * Every implementation of the Java platform is required to support this character encoding.
     *
     * @see <a href="http://docs.oracle.com/javase/6/docs/api/java/nio/charset/Charset.html">Standard charsets</a>
     * @since 1.0
     */
    public static final Charset US_ASCII = Charset.forName("US-ASCII");

    /**
     * Sixteen-bit Unicode Transformation Format, The byte order specified by a mandatory initial byte-order mark
     * (either order accepted on input, big-endian used on output)
     * <p>
     * Every implementation of the Java platform is required to support this character encoding.
     *
     * @see <a href="http://docs.oracle.com/javase/6/docs/api/java/nio/charset/Charset.html">Standard charsets</a>
     * @since 1.0
     */
    public static final Charset UTF_16 = Charset.forName("UTF-16");

    /**
     * Sixteen-bit Unicode Transformation Format, big-endian byte order.
     * <p>
     * Every implementation of the Java platform is required to support this character encoding.
     *
     * @see <a href="http://docs.oracle.com/javase/6/docs/api/java/nio/charset/Charset.html">Standard charsets</a>
     * @since 1.0
     */
    public static final Charset UTF_16BE = Charset.forName("UTF-16BE");

    /**
     * Sixteen-bit Unicode Transformation Format, little-endian byte order.
     * <p>
     * Every implementation of the Java platform is required to support this character encoding.
     *
     * @see <a href="http://docs.oracle.com/javase/6/docs/api/java/nio/charset/Charset.html">Standard charsets</a>
     * @since 1.0
     */
    public static final Charset UTF_16LE = Charset.forName("UTF-16LE");

    /**
     * Eight-bit Unicode Transformation Format.
     * <p>
     * Every implementation of the Java platform is required to support this character encoding.
     *
     * @see <a href="http://docs.oracle.com/javase/6/docs/api/java/nio/charset/Charset.html">Standard charsets</a>
     * @since 1.0
     */
    public static final Charset UTF_8 = Charset.forName("UTF-8");
    
    /**
     * GBK is an extension of the GB2312 character set for simplified Chinese characters, used in the People's Republic of China.
     * A character is encoded as 1 or 2 bytes. 
     * A byte in the range 00–7F is a single byte that means the same thing as it does in ASCII. 
     * Strictly speaking, there are 96 characters and 32 control codes in this range.
     * A byte with the high bit set indicates that it is the first of 2 bytes. 
     * Loosely speaking, the first byte is in the range 81–FE (that is, never 80 or FF), 
     * and the second byte is 40–7E for some areas and 80–FE for others.
     * <p>
     * Every implementation of the Java platform is required to support this character encoding.
     * @since 1.0
     */
    public static final Charset GBK = Charset.forName("GBK");
    
    /**
     * GB2312 is the registered internet name for a key official character set of the People's Republic of China, used for simplified Chinese characters.
     * EUC-CN is often used as the character encoding (i.e. for external storage) in programs that deal with GB2312, thus maintaining compatibility with ASCII. Two bytes are used to represent every character not found in ASCII. The value of the first byte is from 0xA1-0xF7 (161-247), while the value of the second byte is from 0xA1-0xFE (161-254).
     * <p>
     * Every implementation of the Java platform is required to support this character encoding.
     * @since 1.0
     */
    public static final Charset GB2312 = Charset.forName("GB2312");

    //
    // This class should only contain Charset instances for required encodings. This guarantees that it will load
    // correctly and without delay on all Java platforms.
    //

    /**
     * Returns the given Charset or the default Charset if the given Charset is null.
     *
     * @param charset
     *            A charset or null.
     * @return the given Charset or the default Charset if the given Charset is null
     * @since 1.0
     */
    public static Charset toCharset(Charset charset) {
        return charset == null ? Charset.defaultCharset() : charset;
    }

    /**
     * Returns a Charset for the named charset. If the name is null, return the default Charset.
     *
     * @param charset
     *            The name of the requested charset, may be null.
     * @return a Charset for the named charset
     * @throws java.nio.charset.UnsupportedCharsetException
     *             If the named charset is unavailable
     * @since 1.0            
     */
    public static Charset toCharset(String charset) {
        return charset == null ? Charset.defaultCharset() : Charset.forName(charset);
    }
}
