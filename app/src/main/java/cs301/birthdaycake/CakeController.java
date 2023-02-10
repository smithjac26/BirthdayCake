package cs301.birthdaycake;

import android.util.Log;

public class CakeController {

    private CakeView cakeLooky;
    private CakeModel cakeGoodLooking;

    public CakeController(CakeView viewCake) {
        cakeLooky = viewCake;
        cakeGoodLooking = cakeLooky.getCakeGoodLooking();
        Log.i("debug","goodbye");
    }
}

