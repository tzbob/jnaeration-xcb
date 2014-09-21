package xcb;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : xcb/xproto.h:2676</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class xcb_coloritem_t extends Structure {
	/** < */
	public int pixel;
	/** < */
	public short red;
	/** < */
	public short green;
	/** < */
	public short blue;
	/** < */
	public byte flags;
	/** < */
	public byte pad0;
	public xcb_coloritem_t() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("pixel", "red", "green", "blue", "flags", "pad0");
	}
	/**
	 * @param pixel <<br>
	 * @param red <<br>
	 * @param green <<br>
	 * @param blue <<br>
	 * @param flags <<br>
	 * @param pad0 <
	 */
	public xcb_coloritem_t(int pixel, short red, short green, short blue, byte flags, byte pad0) {
		super();
		this.pixel = pixel;
		this.red = red;
		this.green = green;
		this.blue = blue;
		this.flags = flags;
		this.pad0 = pad0;
	}
	public xcb_coloritem_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends xcb_coloritem_t implements Structure.ByReference {
		
	};
	public static class ByValue extends xcb_coloritem_t implements Structure.ByValue {
		
	};
}
