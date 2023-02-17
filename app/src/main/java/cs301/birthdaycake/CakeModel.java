package cs301.birthdaycake;

public class CakeModel {

    public boolean candlesOn;
    public int numCandles;
    public boolean hasFrosting;
    public boolean hasCandles;
    public float xCoordinate;
    public float yCoordinate;

    public CakeModel() {
        numCandles = 2;
        hasFrosting = true;
        hasCandles = true;
        candlesOn = true;
        //xCoordinate = -1;
        //yCoordinate = -1;
    }
}
