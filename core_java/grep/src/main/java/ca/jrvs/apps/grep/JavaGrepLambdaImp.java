package ca.jrvs.apps.grep;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
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
   */
  @Override
  public List<File> listFiles(String rootDir) {
    List<File> files = new ArrayList<File>();
    try {
      Stream<Path> fileStream = Files.walk(Paths.get(rootDir));
      fileStream.filter(Files::isRegularFile).forEach(file -> files.add(file.toFile()));
    } catch (Exception ex) {
      logger.error("ERROR: Failed to retrieve file");
    }
    return files;
  }

  /**
   * Read a file and return all the lines
   *
   * @param inputFile file to be read
   * @return lines
   * @throws IllegalArgumentException if a given input file is not a file
   */
  @Override
  public List<String> readLines(File inputFile) throws IllegalArgumentException {
    if (!inputFile.isFile()) {
      throw new IllegalArgumentException("ERROR: inputFile is not a file.");
    }
    List<String> lines = new ArrayList<>();
    try {
      Stream<String> stream = Files.lines(inputFile.toPath());
      lines = stream.collect(Collectors.toList());
    } catch (Exception ex) {
      logger.error("ERROR: Failed to read file", ex);
    }
    return lines;
  }
}
