package data.reciever.domain;

public class ImageData {
	
	private final byte [] data;
	private final String filename;
	//define own header with metadata
//	private int bytesPerPixel;
//	private int widht;
//	private int weight;
	
	public ImageData(byte[] data, String filename) {
		super();
		this.data = data;
		this.filename = filename;
	}

	public byte[] getData() {
		return data;
	}

	public String getFilename() {
		return filename;
	}
	
}