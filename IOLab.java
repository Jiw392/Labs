import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.PathMatcher;
//Jinke Wang
public class IOLab {

	public static void Speed() throws IOException {

		PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:*.txt*");
		File f = new File("A:\\Backup\\SPEED");
		File[] allFiles = f.listFiles();

		for (int i = 0; i < allFiles.length; i++) {
			String a = allFiles[i].getPath();
			Path b = Paths.get(a);

		if (matcher.matches(b.getFileName())) {
			System.out.println("File doesn't match: " + b);
			}

		else {
			System.out.println("Doesn't match: " + b);
			Files.deleteIfExists(b);
			}
		}
	}

	public static void Apollo() throws IOException {

		File f = new File("A:\\Backup\\APOLLO");
		File[] allFiles = f.listFiles();
		int i = 0;
		for (;i < allFiles.length; i++) {
			continue;
		}
		String a = allFiles[i - 1].getPath();
		
		int d = a.length();
		int c = a.charAt(d - 5);

		System.out.println(c);
		System.out.println(i);
		
		if (c != d) {
			System.out.println("Missing files.");
		}
		else
			System.out.println("Files are here");

	}

	public static void main(String[] args) throws IOException {
		Speed();
		Apollo();
	}
}