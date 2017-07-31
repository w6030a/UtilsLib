package bytes.encode;
import java.util.Base64;

public class Base64Util {

	public static byte[] encode(byte[] content) {
		return Base64.getEncoder().encode(content);
	}
	
	public static byte[] decode(byte[] base64Content) {
		return Base64.getDecoder().decode(base64Content);
	}
}
