package cs301.birthdaycake;

public class CakeModel {

    public boolean candlesOn;
    public int numCandles;
    public boolean hasFrosting;
    public boolean hasCandles;
    public float xCoord;
    public float yCoord;

    public CakeModel() {
        numCandles = 2;
        hasFrosting = true;
        hasCandles = true;
        candlesOn = true;
        yCoord = -1;
        xCoord = -1;
    }
}
