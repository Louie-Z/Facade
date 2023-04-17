package facade;

/**
 * This class represents the Façade for bedroom.
 */
public class FacadeBedroom {
  private final Light light;
  private final Curtain curtain;
  private final Speaker speaker;
  private final Monitor monitor;
  private String time;

  /**
   * This is the constructor for the Façade used in bedroom.
   * @param light A Light object.
   * @param curtain A Curtain Object.
   * @param speaker A Speaker object.
   * @param monitor A Monitor object.
   */
  public FacadeBedroom(Light light, Curtain curtain, Speaker speaker, Monitor monitor){
    this.light = light;
    this.curtain = curtain;
    this.speaker = speaker;
    this.monitor = monitor;
    this.time = "";
  }

  /**
   * This method sets the current time to the time field of the Façade object.
   * @param time String of current time.
   */
  public void currentTime(String time) {
    this.time = time;
    System.out.println("\nCurrent time is: " + time);
  }

  /**
   * This method sets the bedroom to work mode.
   */
  public void work() {
    if (time.equals("day")) {
      curtain.open();
      light.off();
    } else {
      curtain.close();
      light.on();
    }
    speaker.off();
    monitor.on();
  }

}
