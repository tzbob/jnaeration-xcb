package xcb;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : xcb/xproto.h:850</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class xcb_ge_generic_event_t extends Structure {
	/** < */
	public byte response_type;
	/** < */
	public byte extension;
	/** < */
	public short sequence;
	/** < */
	public int length;
	/** < */
	public short event_type;
	/**
	 * <<br>
	 * C type : uint8_t[22]
	 */
	public byte[] pad0 = new byte[22];
	/** < */
	public int full_sequence;
	public xcb_ge_generic_event_t() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("response_type", "extension", "sequence", "length", "event_type", "pad0", "full_sequence");
	}
	/**
	 * @param response_type <<br>
	 * @param extension <<br>
	 * @param sequence <<br>
	 * @param length <<br>
	 * @param event_type <<br>
	 * @param pad0 <<br>
	 * C type : uint8_t[22]<br>
	 * @param full_sequence <
	 */
	public xcb_ge_generic_event_t(byte response_type, byte extension, short sequence, int length, short event_type, byte pad0[], int full_sequence) {
		super();
		this.response_type = response_type;
		this.extension = extension;
		this.sequence = sequence;
		this.length = length;
		this.event_type = event_type;
		if ((pad0.length != this.pad0.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.pad0 = pad0;
		this.full_sequence = full_sequence;
	}
	public xcb_ge_generic_event_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends xcb_ge_generic_event_t implements Structure.ByReference {
		
	};
	public static class ByValue extends xcb_ge_generic_event_t implements Structure.ByValue {
		
	};
}
