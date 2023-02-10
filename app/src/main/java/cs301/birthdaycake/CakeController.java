package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {

    private CakeView cakeLooky;
    private CakeModel cakeGoodLooking;

    public CakeController(CakeView viewCake) {
        cakeLooky = viewCake;
        cakeGoodLooking = cakeLooky.getCakeGoodLooking();
    }

    @Override
    public void onClick(View view) {
        cakeGoodLooking.candlesOn = false;
        cakeLooky.invalidate();
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        Log.d("debug", "onChecked worked");
        cakeGoodLooking.hasCandles = b;
        cakeLooky.invalidate();
    }
}

