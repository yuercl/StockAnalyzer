package com.yuer.stockanalyzer.util;

/**
 * Converts hexadecimal Strings.
 * @author <a href="mailto:joe.dengtao@gmail.com">DengTao</a>
 * @version 1.0
 * @since 1.0
 */
public class HexUtils {
	
	/** Used to build output as Hex */
	private static final String HEXES = "0123456789abcdef";
	private static final String UPPER_HEXES = "0123456789ABCDEF";
    
	/**
	 * Converts an array of bytes into hex string.
     * The returned string will be double the length of the passed array, as it takes two characters to represent any
     * given byte.
	 * @param bytes
	 * @return A hex string.
	 * @since 1.0
	 */
    public static String bytesToHex(byte[] bytes) {
        if ( bytes == null ) return null;
        StringBuilder hex = new StringBuilder( 2 * bytes.length );
        for (byte b : bytes ) {
          hex.append(HEXES.charAt((b & 0xF0) >> 4)).append(HEXES.charAt((b & 0x0F)));
        }
        return hex.toString();
    }
    
    /**
     * Converts an array of bytes into hex string.
     * The returned string will be double the length of the passed array, as it takes two characters to represent any
     * given byte.
     * @param bytes
     * @return A hex string.
     * @since 1.0
     */
    public static String bytesToHEX(byte[] bytes) {
    	if ( bytes == null ) return null;
    	StringBuilder hex = new StringBuilder( 2 * bytes.length );
    	for (byte b : bytes ) {
    		hex.append(UPPER_HEXES.charAt((b & 0xF0) >> 4)).append(UPPER_HEXES.charAt((b & 0x0F)));
    	}
    	return hex.toString();
    }

    /**
     * Converts a hex string into an array of bytes of those same values. The
     * returned array will be half the length of the passed array, as it takes two characters to represent any given
     * byte. An exception is thrown if the passed char array has an odd number of elements.
     * @param hexString
     * @return A byte array containing binary data decoded from the supplied char array.
     * @since 1.0
     */
    public static byte[] hexToBytes(String hexString){
        int len = hexString.length();
        byte[] ba = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            ba[i/2] = (byte) ((Character.digit(hexString.charAt(i), 16) << 4) + Character.digit(hexString.charAt(i+1), 16));
        }
        return ba;
    }
    
}