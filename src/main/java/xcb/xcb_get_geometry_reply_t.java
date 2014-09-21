package xcb;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : xcb/xproto.h:1214</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class xcb_get_geometry_reply_t extends Structure {
	/** < */
	public byte response_type;
	/** < */
	public byte depth;
	/** < */
	public short sequence;
	/** < */
	public int length;
	/**
	 * <<br>
	 * C type : xcb_window_t
	 */
	public int root;
	/** < */
	public short x;
	/** < */
	public short y;
	/** < */
	public short width;
	/** < */
	public short height;
	/** < */
	public short border_width;
	/**
	 * <<br>
	 * C type : uint8_t[2]
	 */
	public byte[] pad0 = new byte[2];
	public xcb_get_geometry_reply_t() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("response_type", "depth", "sequence", "length", "root", "x", "y", "width", "height", "border_width", "pad0");
	}
	public xcb_get_geometry_reply_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends xcb_get_geometry_reply_t implements Structure.ByReference {
		
	};
	public static class ByValue extends xcb_get_geometry_reply_t implements Structure.ByValue {
		
	};
}
