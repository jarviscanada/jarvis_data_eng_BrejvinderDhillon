package ca.jrvs.apps.grep;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JavaGrepLambdaImp extends JavaGrepImp {

  final Logger logger = LoggerFactory.getLogger(JavaGrepLambdaImp.class);

  public static void main(String[] args) {
    if (args.length != 3) {
      throw new IllegalArgumentException("USAGE JavaGrep regex rootPath outFile");
    }

    BasicConfigurator.configure();

    JavaGrepLambdaImp javaGrepLambdaImp = new JavaGrepLambdaImp();
    javaGrepLambdaImp.setRegex(args[0]);
    javaGrepLambdaImp.setRootPath(args[1]);
    javaGrepLambdaImp.setOutFile(args[2]);

    try {
      javaGrepLambdaImp.process();
    }catch (Exception ex) {
      javaGrepLambdaImp.logger.error("Usage JavaGrep regex rootPath outFile", ex);
    }
  }

  /**
   * Traverse a given directory and return all files
   *
   * @param rootDir input Directory
   * @return files under the root directory
   * @throws IOException if a given directory can't be opened or traversed
   */
  @Override
  public List<File> listFiles(String rootDir) throws IOException {
    List<File> files = new ArrayList<>();
    try {
      Stream<Path> path = Files.walk(Paths.get(rootDir));
      path.filter(Files:: isRegularFile).map(file -> file.toFile()).forEach(member -> files.add(member));
    } catch (IOException ex) {
      throw new IOException("Can't open directory", ex);
    }
    return files;
  }

  /**
   * Read a file and return all the lines
   *
   * @param inputFile file to be read
   * @return lines
   * @throws IllegalArgumentException if a given input file is not a file
   * @throws IOException if a given input file can't be opened
   */
  @Override
  public List<String> readLines(File inputFile) throws IOException {
    List<String> finalList = new ArrayList<>();
    try{
      Stream<String> lines = Files.lines(Paths.get(inputFile.getAbsolutePath()));
      lines.forEach(element -> finalList.add(element));
    }catch (IllegalArgumentException e) {
      throw new IllegalArgumentException("Illegal argument passed",e);
    }catch (IOException ex) {
      throw new IOException("Can't open files", ex);
    }
    return finalList;
  }
}
