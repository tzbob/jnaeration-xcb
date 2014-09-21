package xcb;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : xcb/xproto.h:870</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class xcb_value_error_t extends Structure {
	/** < */
	public byte response_type;
	/** < */
	public byte error_code;
	/** < */
	public short sequence;
	/** < */
	public int bad_value;
	/** < */
	public short minor_opcode;
	/** < */
	public byte major_opcode;
	/** < */
	public byte pad0;
	public xcb_value_error_t() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("response_type", "error_code", "sequence", "bad_value", "minor_opcode", "major_opcode", "pad0");
	}
	/**
	 * @param response_type <<br>
	 * @param error_code <<br>
	 * @param sequence <<br>
	 * @param bad_value <<br>
	 * @param minor_opcode <<br>
	 * @param major_opcode <<br>
	 * @param pad0 <
	 */
	public xcb_value_error_t(byte response_type, byte error_code, short sequence, int bad_value, short minor_opcode, byte major_opcode, byte pad0) {
		super();
		this.response_type = response_type;
		this.error_code = error_code;
		this.sequence = sequence;
		this.bad_value = bad_value;
		this.minor_opcode = minor_opcode;
		this.major_opcode = major_opcode;
		this.pad0 = pad0;
	}
	public xcb_value_error_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends xcb_value_error_t implements Structure.ByReference {
		
	};
	public static class ByValue extends xcb_value_error_t implements Structure.ByValue {
		
	};
}
