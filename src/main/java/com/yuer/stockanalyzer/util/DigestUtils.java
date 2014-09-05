package com.yuer.stockanalyzer.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Digest constants.
 * @author <a href="mailto:joe.dengtao@gmail.com">DengTao</a>
 * @version 1.0
 * @since 1.0
 */
class DigestUtils {
	
	/** The MD2 message digest algorithm defined in RFC 1319. */
    public static final String MD2 = "MD2";
    
    /** The MD4 message digest algorithm defined in RFC 1320. */
    public static final String MD4 = "MD4";

    /** The MD5 message digest algorithm defined in RFC 1321. */
    public static final String MD5 = "MD5";

    /** The SHA-1 hash algorithm defined in the FIPS PUB 180-2. */
    public static final String SHA_1 = "SHA-1";

    /** The SHA-256 hash algorithm defined in the FIPS PUB 180-2. */
    public static final String SHA_256 = "SHA-256";

    /** The SHA-384 hash algorithm defined in the FIPS PUB 180-2. */
    public static final String SHA_384 = "SHA-384";

    /** The SHA-512 hash algorithm defined in the FIPS PUB 180-2. */
    public static final String SHA_512 = "SHA-512";
	
	/**
     * Returns a <code>MessageDigest</code> for the given <code>algorithm</code>.
     *
     * @param algorithm
     *            the name of the algorithm requested. See <a
     *            href="http://java.sun.com/j2se/1.3/docs/guide/security/CryptoSpec.html#AppA">Appendix A in the Java
     *            Cryptography Architecture API Specification & Reference</a> for information about standard algorithm
     *            names.
     * @return An digest instance.
     * @see MessageDigest#getInstance(String)
     * @throws IllegalArgumentException
     *             when a {@link NoSuchAlgorithmException} is caught.
     */
    public static MessageDigest getDigest(String algorithm) {
        try {
            return MessageDigest.getInstance(algorithm);
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalArgumentException(e);
        }
    }
    
}
