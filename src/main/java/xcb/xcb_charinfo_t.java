package xcb;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : xcb/xproto.h:1844</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class xcb_charinfo_t extends Structure {
	/** < */
	public short left_side_bearing;
	/** < */
	public short right_side_bearing;
	/** < */
	public short character_width;
	/** < */
	public short ascent;
	/** < */
	public short descent;
	/** < */
	public short attributes;
	public xcb_charinfo_t() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("left_side_bearing", "right_side_bearing", "character_width", "ascent", "descent", "attributes");
	}
	/**
	 * @param left_side_bearing <<br>
	 * @param right_side_bearing <<br>
	 * @param character_width <<br>
	 * @param ascent <<br>
	 * @param descent <<br>
	 * @param attributes <
	 */
	public xcb_charinfo_t(short left_side_bearing, short right_side_bearing, short character_width, short ascent, short descent, short attributes) {
		super();
		this.left_side_bearing = left_side_bearing;
		this.right_side_bearing = right_side_bearing;
		this.character_width = character_width;
		this.ascent = ascent;
		this.descent = descent;
		this.attributes = attributes;
	}
	public xcb_charinfo_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends xcb_charinfo_t implements Structure.ByReference {
		
	};
	public static class ByValue extends xcb_charinfo_t implements Structure.ByValue {
		
	};
}
