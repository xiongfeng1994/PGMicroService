package com.ebest.cloud.utility.copier;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletOutputStream;
import javax.servlet.WriteListener;

/**
 * ServletOutputStreamCopier class
 * @author ebest
 *
 */
public class ServletOutputStreamCopier extends ServletOutputStream {

	private OutputStream outputStream;
	private ByteArrayOutputStream copy;

	/**
	 * ServletOutputStreamCopier constructor
	 * @param outputStream
	 */
	public ServletOutputStreamCopier(OutputStream outputStream) {
		this.outputStream = outputStream;
		this.copy = new ByteArrayOutputStream(1024);
	}

	/**
	 * override write
	 */
	@Override
	public void write(int b) throws IOException {
		outputStream.write(b);
		copy.write(b);
	}

	/**
	 * add get copy
	 * @return
	 */
	public byte[] getCopy() {
		return copy.toByteArray();
	}

	/**
	 * override isReady
	 */
	@Override
	public boolean isReady() {
		return true;
	}

	/**
	 * override setWriteListener
	 */
	@Override
	public void setWriteListener(WriteListener writeListener) {
	}

}
