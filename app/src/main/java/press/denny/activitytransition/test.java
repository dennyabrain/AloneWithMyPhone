package press.denny.activitytransition;

import android.app.Activity;
import android.os.Bundle;

import android.transition.Transition;
import android.transition.Explode;
import android.transition.Slide;
import android.transition.Fade;

import android.content.Intent;
import android.view.View;

public class test extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        Transition enterTrans = new Slide();
        getWindow().setEnterTransition(enterTrans);

        Transition returnTrans = new Slide();
        getWindow().setReturnTransition(returnTrans);
    }
}
