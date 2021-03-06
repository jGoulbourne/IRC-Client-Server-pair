import java.io.BufferedReader;
import java.io.IOException;

public class Receiver extends Thread{
  private BufferedReader reader;
  private String line = null;
  public Receiver(BufferedReader in) {
    reader = in;
  }

  //looks for a new input but in a thread
  public void run() {
    while(true) {
      try {
        line = reader.readLine();
        sleep(10);
        System.out.println(this + "has recieved" + line);
      } catch(Exception e) {}
    }
  }

  //returns the value, then resets the line so it
  //doesn't spam out the same line
  public String getLine() {
    String temp = line;
    line = null;
    return temp;
  }

}
