package css.cis3334.heartratetracker;

/**
 * Created by hvold on 3/3/2017.
 */

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends Activity {

    TextView tv2, tv3, tv4;
    String pulse;
    String range;

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_result);

        tv2 = (TextView) findViewById(R.id.textView2);
        tv3 = (TextView) findViewById(R.id.textView3);
        tv4 = (TextView) findViewById(R.id.textView4);
        Bundle extras = getIntent().getExtras();

        pulse = extras.getSerializable("pulse").toString();
        range = extras.getSerializable("range").toString();
    }
}