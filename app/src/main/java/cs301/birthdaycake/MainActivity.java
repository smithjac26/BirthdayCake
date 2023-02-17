package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);
        CakeController CakeControlling = new CakeController((CakeView)findViewById(R.id.cakeview));

        CakeView cakeWatching = findViewById(R.id.cakeview);
        CakeController cakeControlling = new CakeController(cakeWatching);
        cakeWatching.setOnTouchListener(cakeControlling);


        Button blowOut = findViewById(R.id.BlowOut);
        blowOut.setOnClickListener(CakeControlling);

        Switch candles = findViewById(R.id.Candles);
        candles.setOnCheckedChangeListener(CakeControlling);

        SeekBar numCandles = findViewById(R.id.candlesAmount);
        numCandles.setOnSeekBarChangeListener(CakeControlling);
    }
    public void goodbye(View button) {
        finishAffinity();
    }
}
