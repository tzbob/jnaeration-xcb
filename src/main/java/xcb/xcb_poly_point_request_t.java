package xcb;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : xcb/xproto.h:2325</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class xcb_poly_point_request_t extends Structure {
	/** < */
	public byte major_opcode;
	/** < */
	public byte coordinate_mode;
	/** < */
	public short length;
	/**
	 * <<br>
	 * C type : xcb_drawable_t
	 */
	public int drawable;
	/**
	 * <<br>
	 * C type : xcb_gcontext_t
	 */
	public int gc;
	public xcb_poly_point_request_t() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("major_opcode", "coordinate_mode", "length", "drawable", "gc");
	}
	/**
	 * @param major_opcode <<br>
	 * @param coordinate_mode <<br>
	 * @param length <<br>
	 * @param drawable <<br>
	 * C type : xcb_drawable_t<br>
	 * @param gc <<br>
	 * C type : xcb_gcontext_t
	 */
	public xcb_poly_point_request_t(byte major_opcode, byte coordinate_mode, short length, int drawable, int gc) {
		super();
		this.major_opcode = major_opcode;
		this.coordinate_mode = coordinate_mode;
		this.length = length;
		this.drawable = drawable;
		this.gc = gc;
	}
	public xcb_poly_point_request_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends xcb_poly_point_request_t implements Structure.ByReference {
		
	};
	public static class ByValue extends xcb_poly_point_request_t implements Structure.ByValue {
		
	};
}
