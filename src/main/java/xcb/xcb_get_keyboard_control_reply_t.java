package xcb;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : xcb/xproto.h:2965</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class xcb_get_keyboard_control_reply_t extends Structure {
	/** < */
	public byte response_type;
	/** < */
	public byte global_auto_repeat;
	/** < */
	public short sequence;
	/** < */
	public int length;
	/** < */
	public int led_mask;
	/** < */
	public byte key_click_percent;
	/** < */
	public byte bell_percent;
	/** < */
	public short bell_pitch;
	/** < */
	public short bell_duration;
	/**
	 * <<br>
	 * C type : uint8_t[2]
	 */
	public byte[] pad0 = new byte[2];
	/**
	 * <<br>
	 * C type : uint8_t[32]
	 */
	public byte[] auto_repeats = new byte[32];
	public xcb_get_keyboard_control_reply_t() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("response_type", "global_auto_repeat", "sequence", "length", "led_mask", "key_click_percent", "bell_percent", "bell_pitch", "bell_duration", "pad0", "auto_repeats");
	}
	public xcb_get_keyboard_control_reply_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends xcb_get_keyboard_control_reply_t implements Structure.ByReference {
		
	};
	public static class ByValue extends xcb_get_keyboard_control_reply_t implements Structure.ByValue {
		
	};
}
