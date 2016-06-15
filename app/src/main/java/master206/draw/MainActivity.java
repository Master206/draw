package master206.draw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     //  setContentView(new DrawView(this));
    }

    public void onClickButton (View view) {
        Intent intent = new Intent(this, DrawActivity.class);
        MainActivity.this.startActivity(intent);



    }


}
