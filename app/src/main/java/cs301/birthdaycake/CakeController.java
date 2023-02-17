package cs301.birthdaycake;

import android.graphics.Paint;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener, View.OnTouchListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener {

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
        cakeGoodLooking.hasCandles = b;
        cakeLooky.invalidate();
    }


    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        cakeGoodLooking.numCandles = i;
        cakeLooky.invalidate();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        //nothing
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        //nothing
    }



    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        Log.d("debug", "onTouch worked!!!");
        cakeGoodLooking.xCoord = motionEvent.getX();
        cakeGoodLooking.yCoord = motionEvent.getY();
        cakeLooky.invalidate();
        return true;
    }

}

