package xcb;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : xcb/xproto.h:3065</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class xcb_change_hosts_request_t extends Structure {
	/** < */
	public byte major_opcode;
	/** < */
	public byte mode;
	/** < */
	public short length;
	/** < */
	public byte family;
	/** < */
	public byte pad0;
	/** < */
	public short address_len;
	public xcb_change_hosts_request_t() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("major_opcode", "mode", "length", "family", "pad0", "address_len");
	}
	/**
	 * @param major_opcode <<br>
	 * @param mode <<br>
	 * @param length <<br>
	 * @param family <<br>
	 * @param pad0 <<br>
	 * @param address_len <
	 */
	public xcb_change_hosts_request_t(byte major_opcode, byte mode, short length, byte family, byte pad0, short address_len) {
		super();
		this.major_opcode = major_opcode;
		this.mode = mode;
		this.length = length;
		this.family = family;
		this.pad0 = pad0;
		this.address_len = address_len;
	}
	public xcb_change_hosts_request_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends xcb_change_hosts_request_t implements Structure.ByReference {
		
	};
	public static class ByValue extends xcb_change_hosts_request_t implements Structure.ByValue {
		
	};
}
