package facade;

/**
 * This class represents new speakers.
 * It implements the Speaker interface.
 */
public class NewSpeaker implements Speaker{
  /**
   * This is the constructor for the new speaker.
   */
  public NewSpeaker(){}

  @Override public void on() {
    System.out.println( "New Speaker is on");
  }

  @Override public void off() {
    System.out.println("New Speaker is off");
  }
}
