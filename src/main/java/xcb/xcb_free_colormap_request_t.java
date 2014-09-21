package xcb;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : xcb/xproto.h:2507</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class xcb_free_colormap_request_t extends Structure {
	/** < */
	public byte major_opcode;
	/** < */
	public byte pad0;
	/** < */
	public short length;
	/**
	 * <<br>
	 * C type : xcb_colormap_t
	 */
	public int cmap;
	public xcb_free_colormap_request_t() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("major_opcode", "pad0", "length", "cmap");
	}
	/**
	 * @param major_opcode <<br>
	 * @param pad0 <<br>
	 * @param length <<br>
	 * @param cmap <<br>
	 * C type : xcb_colormap_t
	 */
	public xcb_free_colormap_request_t(byte major_opcode, byte pad0, short length, int cmap) {
		super();
		this.major_opcode = major_opcode;
		this.pad0 = pad0;
		this.length = length;
		this.cmap = cmap;
	}
	public xcb_free_colormap_request_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends xcb_free_colormap_request_t implements Structure.ByReference {
		
	};
	public static class ByValue extends xcb_free_colormap_request_t implements Structure.ByValue {
		
	};
}
