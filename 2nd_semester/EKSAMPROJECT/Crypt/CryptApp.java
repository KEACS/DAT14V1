import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class CryptApp
{
	public static byte[] cryptString(String s) throws NoSuchAlgorithmException, UnsupportedEncodingException
	{
		// Konverter tekst fra String til byte array
		byte[] bytesOfMessage = s.getBytes("UTF-8");

		// bestem hvilken krypteringsalgorithme der skal bruges
		// (MD5, SHA-1, SHA-256)
		MessageDigest md = MessageDigest.getInstance("MD5");

		// Krypter tekststrengen
		byte[] cryptString = md.digest(bytesOfMessage);

		// retuner den krypterede tekststreng
		return cryptString;
	}
}
