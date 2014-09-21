package xcb;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : xcb/xproto.h:3213</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class xcb_set_modifier_mapping_reply_t extends Structure {
	/** < */
	public byte response_type;
	/** < */
	public byte status;
	/** < */
	public short sequence;
	/** < */
	public int length;
	public xcb_set_modifier_mapping_reply_t() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("response_type", "status", "sequence", "length");
	}
	/**
	 * @param response_type <<br>
	 * @param status <<br>
	 * @param sequence <<br>
	 * @param length <
	 */
	public xcb_set_modifier_mapping_reply_t(byte response_type, byte status, short sequence, int length) {
		super();
		this.response_type = response_type;
		this.status = status;
		this.sequence = sequence;
		this.length = length;
	}
	public xcb_set_modifier_mapping_reply_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends xcb_set_modifier_mapping_reply_t implements Structure.ByReference {
		
	};
	public static class ByValue extends xcb_set_modifier_mapping_reply_t implements Structure.ByValue {
		
	};
}
