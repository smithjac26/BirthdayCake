package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);
        CakeController CakeControlling = new CakeController((CakeView)findViewById(R.id.cakeview));
        Button blowOut = findViewById(R.id.BlowOut);
        blowOut.setOnClickListener(CakeControlling);
    }
    public void goodbye(View button) {
        finishAffinity();
    }
}
