package cn.itape.java.disabuse;

import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Example041 {

	public static void main(String[] args) throws IOException {
		Example041 e41 = new Example041();
		e41.copy("d:\\微信名ape_it.txt", "d:\\微信名爱题猿.txt");
	}

	private void copy(String src, String dest) throws IOException {
		InputStream is = null;
		OutputStream os = null;
		try {
			is = new FileInputStream(src);
			os = new FileOutputStream(dest);
			byte[] buf = new byte[1024];
			int n;
			while ((n = is.read(buf)) > 0) {
				os.write(buf, 0, n);
			}
		} finally {
			is.close();
			os.close();
		}
	}

	void copy1(String src, String dest) throws IOException {
		InputStream is = null;
		OutputStream os = null;
		try {
			is = new FileInputStream(src);
			os = new FileOutputStream(dest);
			byte[] buf = new byte[1024];
			int n;
			while ((n = is.read(buf)) > 0) {
				os.write(buf, 0, n);
			}
		} finally {
			if (is != null) {
				try {
					is.close();
				} catch (IOException e) {
					// do nothing
				}
			}
			if (os != null) {
				try {
					os.close();
				} catch (IOException e) {
					// do nothing
				}
			}
		}
	}

	void copy2(String src, String dest) throws IOException {
		InputStream is = null;
		OutputStream os = null;
		try {
			is = new FileInputStream(src);
			os = new FileOutputStream(dest);
			byte[] buf = new byte[1024];
			int n;
			while ((n = is.read(buf)) > 0) {
				os.write(buf, 0, n);
			}
		} finally {
			close(is);
			close(os);
		}
	}

	private void close(Closeable closeable) {
		if (closeable != null) {
			try {
				closeable.close();
			} catch (IOException e) {
				// do nothing
			}
		}
	}
}
