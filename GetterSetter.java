/**
 * Klasse von Luca und Jason, die Getter und setter als 
 * Blaupausen enthalten, die Kopiert und benutzt werden können.
 * 
 * Diese Klasse kann später wieder gelöscht werden!!!
 */
public class GetterSetter  
{
    protected int fleetSize;
    protected int xCoord;
    protected int yCoord;
    protected int credits;
    protected Position position;
    
    public int getFleetSize() {
        return fleetSize;
    }

    public void setFleetSize(int fleetSize) {
        this.fleetSize = fleetSize;
    }

    public int getxCoord() {
        return xCoord;
    }

    public void setxCoord(int xCoord) {
        this.xCoord = xCoord;
    }

    public int getyCoord() {
        return yCoord;
    }

    public void setyCoord(int yCoord) {
        this.yCoord = yCoord;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
    
    
    
    private int strength;//Raumschiffstärke -> mehr Schaden
    private int defense;//Verteidigung des eigenen Planeten (evtl. Haltbarkeit der Schiffe/später Schild)
    private int productionSpeed;//erhöht Produktion auf eigenem Planeten pro Runde
    private int collectionSpeed;//erhöht Materialaufnahme der Schiffe pro "fahrt"
    private int shipSpeed;
    
    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getProductionSpeed() {
        return productionSpeed;
    }

    public void setProductionSpeed(int productionSpeed) {
        this.productionSpeed = productionSpeed;
    }

    public int getCollectionSpeed() {
        return collectionSpeed;
    }

    public void setCollectionSpeed(int collectionSpeed) {
        this.collectionSpeed = collectionSpeed;
    }

    public int getShipSpeed() {
        return shipSpeed;
    }

    public void setShipSpeed(int shipSpeed) {
        this.shipSpeed = shipSpeed;
    }
    
    private int creditCost = 1000;
    private int steelCost = 500;
    private double i = 1.1; //i für increase
    private int upgradeTime = 3;
    private int remainingTime;
    private boolean upgrading = false;

    public int getCreditCost() {
        return creditCost;
    }

    public void setCreditCost(int creditCost) {
        this.creditCost = creditCost;
    }

    public int getSteelCost() {
        return steelCost;
    }

    public void setSteelCost(int steelCost) {
        this.steelCost = steelCost;
    }

    public double getI() {
        return i;
    }

    public void setI(double i) {
        this.i = i;
    }

    public int getUpgradeTime() {
        return upgradeTime;
    }

    public void setUpgradeTime(int upgradeTime) {
        this.upgradeTime = upgradeTime;
    }

    public int getRemainingTime() {
        return remainingTime;
    }

    public void setRemainingTime(int remainingTime) {
        this.remainingTime = remainingTime;
    }

    public boolean isUpgrading() {
        return upgrading;
    }

    public void setUpgrading(boolean upgrading) {
        this.upgrading = upgrading;
    }
}
