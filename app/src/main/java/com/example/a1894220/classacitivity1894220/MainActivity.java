package com.example.a1894220.classacitivity1894220;

import android.media.Image;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String tag;
    EditText editText_name, editText_email, editText_password;
    Button button_submit,button_exitDown,button_exitTop;
    ConstraintLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editText_name=findViewById(R.id.editText_name);
        editText_email=findViewById(R.id.editText_email);
        editText_password=findViewById(R.id.editText_password);
        button_submit=findViewById(R.id.button_submit);
        button_exitDown=findViewById(R.id.button2_exitDown);
        button_exitTop=findViewById(R.id.button3_exitTop);


        button_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Log.d(tag,editText_name.toString());
                Log.d(tag,editText_email.toString());
                Log.d(tag, editText_password.toString());

               // Toast.makeText(getApplicationContext(),"thank you",Toast.LENGTH_SHORT).show();



                Snackbar snackbar = Snackbar.make(layout, "clear All", Snackbar.LENGTH_LONG)
                        .setAction("To clear", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Snackbar snackbar1 = Snackbar.make(layout, "Message is cleared!", Snackbar.LENGTH_SHORT);
                                snackbar1.show();
                            }
                        });

                snackbar.show();

            }
        });
    button_exitTop.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            finish();
        }
    });
        button_exitDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }


}
