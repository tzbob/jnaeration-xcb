package xcb;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : xcb/xproto.h:804</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class xcb_colormap_notify_event_t extends Structure {
	/** < */
	public byte response_type;
	/** < */
	public byte pad0;
	/** < */
	public short sequence;
	/**
	 * <<br>
	 * C type : xcb_window_t
	 */
	public int window;
	/**
	 * <<br>
	 * C type : xcb_colormap_t
	 */
	public int colormap;
	/** < */
	public byte _new;
	/** < */
	public byte state;
	/**
	 * <<br>
	 * C type : uint8_t[2]
	 */
	public byte[] pad1 = new byte[2];
	public xcb_colormap_notify_event_t() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("response_type", "pad0", "sequence", "window", "colormap", "_new", "state", "pad1");
	}
	/**
	 * @param response_type <<br>
	 * @param pad0 <<br>
	 * @param sequence <<br>
	 * @param window <<br>
	 * C type : xcb_window_t<br>
	 * @param colormap <<br>
	 * C type : xcb_colormap_t<br>
	 * @param _new <<br>
	 * @param state <<br>
	 * @param pad1 <<br>
	 * C type : uint8_t[2]
	 */
	public xcb_colormap_notify_event_t(byte response_type, byte pad0, short sequence, int window, int colormap, byte _new, byte state, byte pad1[]) {
		super();
		this.response_type = response_type;
		this.pad0 = pad0;
		this.sequence = sequence;
		this.window = window;
		this.colormap = colormap;
		this._new = _new;
		this.state = state;
		if ((pad1.length != this.pad1.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.pad1 = pad1;
	}
	public xcb_colormap_notify_event_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends xcb_colormap_notify_event_t implements Structure.ByReference {
		
	};
	public static class ByValue extends xcb_colormap_notify_event_t implements Structure.ByValue {
		
	};
}
