package xcb;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : xcb/xproto.h:1768</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class xcb_set_input_focus_request_t extends Structure {
	/** < */
	public byte major_opcode;
	/** < */
	public byte revert_to;
	/** < */
	public short length;
	/**
	 * <<br>
	 * C type : xcb_window_t
	 */
	public int focus;
	/**
	 * <<br>
	 * C type : xcb_timestamp_t
	 */
	public int time;
	public xcb_set_input_focus_request_t() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("major_opcode", "revert_to", "length", "focus", "time");
	}
	/**
	 * @param major_opcode <<br>
	 * @param revert_to <<br>
	 * @param length <<br>
	 * @param focus <<br>
	 * C type : xcb_window_t<br>
	 * @param time <<br>
	 * C type : xcb_timestamp_t
	 */
	public xcb_set_input_focus_request_t(byte major_opcode, byte revert_to, short length, int focus, int time) {
		super();
		this.major_opcode = major_opcode;
		this.revert_to = revert_to;
		this.length = length;
		this.focus = focus;
		this.time = time;
	}
	public xcb_set_input_focus_request_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends xcb_set_input_focus_request_t implements Structure.ByReference {
		
	};
	public static class ByValue extends xcb_set_input_focus_request_t implements Structure.ByValue {
		
	};
}
