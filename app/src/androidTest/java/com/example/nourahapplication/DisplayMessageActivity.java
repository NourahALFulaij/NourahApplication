package com.example.nourahapplication;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity  extends AppCompatActivity {
    private Intent intent;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent =getIntent();
              String message  = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
              TextView textView=findViewById(R.id.textView);
              textView.setText(message);

    }

    private void setContentView(int activity_display_message) {
    }

    private TextView findViewById(int textView) {

        return null;
    }

    public Intent getIntent() {

        return intent;
    }
}
