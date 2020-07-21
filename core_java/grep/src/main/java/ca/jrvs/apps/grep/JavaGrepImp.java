package ca.jrvs.apps.grep;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JavaGrepImp implements JavaGrep{

  /**
   * Top level search workflow
   *
   * @throws IOException
   */
  @Override
  public void process() throws IOException {

  }

  /**
   * Traverse a given directory and return all files
   *
   * @param rootDir - Input directory
   * @return files under rootdir
   */
  @Override
  public List<File> listFiles(String rootDir) {
    return null;
  }

  /**
   * Read a file and return all the lines
   *
   * @param inputFile - File to be read
   * @return lines
   * @throws IllegalArgumentException if given an inputFile which is not a file
   */
  @Override
  public List<String> readLines(File inputFile) {
    return null;
  }

  /**
   * Check if a line contains the regex pattern (Passed by the user)
   *
   * @param line - Input string
   */
  @Override
  public boolean containsPattern(String line) {
    return false;
  }

  /**
   * Write lines to a file
   *
   * @param lines - Matched lines
   * @throws IOException if write failed
   */
  @Override
  public void writeToFile(List<String> lines) throws IOException {

  }

  @Override
  public String getRootPath() {
    return null;
  }

  @Override
  public void setRootPath(String rootPath) {

  }

  @Override
  public String getRegex() {
    return null;
  }

  @Override
  public void setRegex(String regex) {

  }

  @Override
  public String getOutFile() {
    return null;
  }

  @Override
  public void setOutFile(String outFile) {

  }
}
