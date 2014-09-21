package xcb;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : xcb/xproto.h:1248</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class xcb_intern_atom_request_t extends Structure {
	/** < */
	public byte major_opcode;
	/** < */
	public byte only_if_exists;
	/** < */
	public short length;
	/** < */
	public short name_len;
	/**
	 * <<br>
	 * C type : uint8_t[2]
	 */
	public byte[] pad0 = new byte[2];
	public xcb_intern_atom_request_t() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("major_opcode", "only_if_exists", "length", "name_len", "pad0");
	}
	/**
	 * @param major_opcode <<br>
	 * @param only_if_exists <<br>
	 * @param length <<br>
	 * @param name_len <<br>
	 * @param pad0 <<br>
	 * C type : uint8_t[2]
	 */
	public xcb_intern_atom_request_t(byte major_opcode, byte only_if_exists, short length, short name_len, byte pad0[]) {
		super();
		this.major_opcode = major_opcode;
		this.only_if_exists = only_if_exists;
		this.length = length;
		this.name_len = name_len;
		if ((pad0.length != this.pad0.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.pad0 = pad0;
	}
	public xcb_intern_atom_request_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends xcb_intern_atom_request_t implements Structure.ByReference {
		
	};
	public static class ByValue extends xcb_intern_atom_request_t implements Structure.ByValue {
		
	};
}
