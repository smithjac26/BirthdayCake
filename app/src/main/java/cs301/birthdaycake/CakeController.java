package cs301.birthdaycake;

import android.util.Log;
import android.view.View;

public class CakeController implements View.OnClickListener {

    private CakeView cakeLooky;
    private CakeModel cakeGoodLooking;

    public CakeController(CakeView viewCake) {
        cakeLooky = viewCake;
        cakeGoodLooking = cakeLooky.getCakeGoodLooking();
    }

    @Override
    public void onClick(View view) {
        Log.d("debug", "onClick worked");
        cakeGoodLooking.candlesOn = false;
        cakeLooky.invalidate();
    }
}

