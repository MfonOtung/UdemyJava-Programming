package org.mfon.section8_Polymorphism.CompositionChallenge;

/**
 INSTRUCTION
 Create an application for controlling a smart kitchen. Your smart kitchen will have several appliances.
 Your appliances will be Internet Of Things (IoT) devices, which can be programmed.

 For example, you might do stuff in your kitchen in the morning, in a rush to get to work,
 and then expect your smart kitchen appliances to run automatically at a later time.

 It's your job to write the code, to enable your Smart Kitchen application, to execute certain jobs.
 Methods on your SmartKitchen class, will determine what work needs to be done: addWater() will set the Coffee Maker's
 hasWorkToDo field to true. pourMilk() will also set Refrigerator's hasWorkToDo to true.
 And finally loadDishwasher() will set the hasWorkToDo flag to true, on that appliance.

 Alternately, you could have a single method, called setKitchenState,
 that takes three boolean values, which could combine the three methods above.

 To execute the work needed to be done by the appliances, you'll implement this in two ways:
 First, your application will access each appliance (by using a getter), and execute a method.
 The appliance methods are orderFood() on Refrigerator, doDishes() on DishWasher,mand brewCoffee() on CoffeeMaker. ;
 These methods should check the hasWorkToDo flag, and if true, print a message out, about what work is being done.

 Second, your application won't access the appliances directly.
 It should call doKitchenWork(), which delegates the work, to any of its appliances.
 */
public class SmartKitchen {
    public static void main(String[] args) {
        SmartKitchen kitchen = new SmartKitchen();

//        kitchen.getDishWasher().setHasWorkToDo(true);
//        kitchen.getBrewMaster().setHasWorkToDo(true);
//        kitchen.getIceBox().setHasWorkToDo(true);
//
//        kitchen.getDishWasher().doDishes();
//        kitchen.getIceBox().orderFood();
//        kitchen.getBrewMaster().brewCoffee();

        kitchen.setKitchenState(true, false, true);
        kitchen.doKitchenWork();
    }
    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;
    public SmartKitchen() {
        brewMaster =  new CoffeeMaker();
        dishWasher = new DishWasher();
        iceBox = new Refrigerator();
    }
    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }
    public DishWasher getDishWasher() {
        return dishWasher;
    }
    public Refrigerator getIceBox() {
        return iceBox;
    }

//    public boolean addWater (){
//         return true;
//    }
//    public void pourMilk (){
//    }
//    public void loadDishWasher(){
//    }
    public void setKitchenState (boolean coffeeFlag, boolean fridgeFlag, boolean dishWasherFlag){
        brewMaster.setHasWorkToDo(coffeeFlag);
        iceBox.setHasWorkToDo(fridgeFlag);
        dishWasher.setHasWorkToDo(dishWasherFlag);
    }
    public void doKitchenWork (){
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();
    }
}

class CoffeeMaker{
    private boolean hasWorkToDo;
    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    public void brewCoffee(){
        if (hasWorkToDo){
            System.out.println("Brewing Coffee");
            hasWorkToDo = false;
        }
    }
}
class DishWasher{
    boolean hasWorkToDo;
    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    public void doDishes(){
        if (hasWorkToDo){
            System.out.println("Washing Dishes");
            hasWorkToDo = false;
        }
    }
}
class Refrigerator{
    private boolean hasWorkToDo;
    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    public void orderFood(){
        if (hasWorkToDo){
            System.out.println("Ordering Food");
            hasWorkToDo = false;
        }
    }
}
