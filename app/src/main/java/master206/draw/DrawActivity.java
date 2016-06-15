package master206.draw;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import master206.draw.view.DrawView;

/**
 * Created by akrau on 15.06.2016.
 */
public class DrawActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new DrawView(this));


    }
}
