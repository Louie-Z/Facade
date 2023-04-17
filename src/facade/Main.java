package facade;

/**
 * This class represents the main class that acts as the driver to run the program.
 */
public class Main {
  /**
   * This is the main method.
   * @param args Not used in our driver class.
   */
  public static void main(String[] args) {
    Light light = new Light();
    Curtain curtain = new Curtain();
    Speaker speaker = new OldSpeaker();
    Speaker awesome_speaker = new NewSpeaker();
    Monitor monitor = new Monitor();

    // create a living object with the old speaker
    FacadeLivingRoom living_room = new FacadeLivingRoom(light, curtain, speaker, monitor);

    // create a bedroom object with the old speaker
    FacadeBedroom bedroom = new FacadeBedroom(light, curtain, speaker, monitor);

    // Process a series of operations involved with a fixed range of subclasses
    System.out.println("In the Living room:");
    System.out.println("\nSleep mode:");
    living_room.sleep();

    System.out.println("\nWork mode:");
    living_room.work();

    System.out.println("\nMovie mode:");
    living_room.movie();

    //We can add functionalities to the façade interface
    System.out.println("\nIn the Bedroom:");
    bedroom.currentTime("day");
    System.out.println("Work mode:");
    bedroom.work();
    bedroom.currentTime("night");
    System.out.println("Work mode:");
    bedroom.work();

    //The façade object does not encapsulate the subsystems
    monitor.displayFamilyPhoto();

    // Achieve loose coupling between the client and the subclass by enhancing maintainability,
    // extensibility, testability, and reusability.
    FacadeBedroom upgraded_bedroom = new FacadeBedroom(light, curtain, awesome_speaker, monitor);
    System.out.println("\nIn the upgraded Bedroom:");
    upgraded_bedroom.currentTime("day");
    System.out.println("Work mode:");
    upgraded_bedroom.work();
  }
}
