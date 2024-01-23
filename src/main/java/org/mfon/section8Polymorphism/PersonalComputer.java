package org.mfon.section8Polymorphism;

public class PersonalComputer extends Product{
    private ComputerCase computerCase;
    private Monitor monitor;
    private Motherboard motherboard;
    public PersonalComputer(String model, String manufacturer,
                            ComputerCase computerCase, Monitor monitor,
                            Motherboard motherboard) {
        super(model, manufacturer);
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }
//    public ComputerCase getComputerCase() {
//        return computerCase;
//    }
//    public Monitor getMonitor() {
//        return monitor;
//    }
//    public Motherboard getMotherboard() {
//        return motherboard;
//    }

   /** We really don't want the Main class,or any class except the PersonalComputer  class, to make calls on its parts.
    So, we create methods on PersonalComputer,which we'll expose to the calling code.
    The first one, we'll call drawLogo, and we're  going to implement that in a private method.
    And it might do some fancy graphics, but here  we're obviously not going to write that code yet.
    Instead, we'll just call drawPixelAt, on  the monitor attribute of our computer.
    We're making this private, because the only code  we want to draw the computer manufacturer logo,
    is the personal computer itself.

    Next, we want to call this method, from a method we'll call power up. If you think about a computer,
    when it starts up, you press the power button,  and then you see a logo come up on the screen.

    The powerUp function of the personal computer will draw that logo on the screen, as part of starting up the computer.
    And now, going back to the ComputerFactory class, we'll  comment out the three lines that aren't compiling.

    Instead, we'll make a call to the  powerUp method on the personal computer:
    */
   private void drawLogo() {
       monitor.drawPixelAt(1200, 50, "yellow");
   }
    public void powerUp() {
        computerCase.pressPowerButton();
        drawLogo();
    }
}
