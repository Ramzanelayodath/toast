package ramzan.toast;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void buttonClick(View v)
    {
        Toast.makeText(MainActivity.this,"HELLO....",Toast.LENGTH_SHORT).show();
    }
}
