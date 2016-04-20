package press.denny.activitytransition;

import android.os.Bundle;
import android.app.Activity;
import android.app.ActivityOptions;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;

import android.transition.Transition;
import android.transition.Explode;
import android.transition.Slide;
import android.transition.Fade;

public class Home extends Activity {
    TextView b1;
    public final static String EXTRA_MESSAGE="testKey";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        b1=(TextView) findViewById(R.id.notes);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), "Button was clicked", Toast.LENGTH_LONG).show();
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(Home.this);
                Intent intent = new Intent(getApplicationContext(), test.class);
                String message = "Coming From Home Screen";
                intent.putExtra(EXTRA_MESSAGE, message);


                startActivity(intent, options.toBundle());

                //startActivity(intent);
            }
        });

        Transition exitTrans = new Slide();
        getWindow().setExitTransition(exitTrans);

        Transition reenterTrans = new Slide();
        getWindow().setReenterTransition(reenterTrans);

    }
}
