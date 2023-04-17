package facade;

/**
 * This class represents the Façade for living room.
 */
public class FacadeLivingRoom {
  private final Light light;
  private final Curtain curtain;
  private final Speaker speaker;
  private final Monitor monitor;

  /**
   * This is the constructor for the Façade used in bedroom.
   * @param light A Light object.
   * @param curtain A Curtain Object.
   * @param speaker A Speaker object.
   * @param monitor A Monitor object.
   */
  public FacadeLivingRoom(Light light, Curtain curtain, Speaker speaker, Monitor monitor){
    this.light = light;
    this.curtain = curtain;
    this.speaker = speaker;
    this.monitor = monitor;
  }

  /**
   * This method sets the living room to sleep mode.
   */
  public void sleep() {
    curtain.close();
    speaker.off();
    monitor.off();
    light.off();
  }

  /**
   * This method sets the living room to work mode.
   */
  public void work() {
    curtain.open();
    speaker.off();
    monitor.on();
    light.on();
  }

  /**
   * This method sets the living room to movie mode.
   */
  public void movie() {
    curtain.close();
    speaker.on();
    monitor.on();
    light.off();
  }
}