package br.com.layouts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AbsoluteLayout;
import android.widget.FrameLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirLinearLayout(View view) {
        Toast.makeText(this, R.string.esta_activity_usa_linear_layout, Toast.LENGTH_SHORT).show();
    }

    public void abrirRelativeLayout(View view) {
        Intent it = new Intent(this, RelativeActivity.class);
        startActivity(it);
    }

    public void abrirAbsoluteLayout(View view) {
        Intent it = new Intent(this, AbsoluteActivity.class);
        startActivity(it);
    }

    public void abrirFrameActivity(View view) {
        Intent it = new Intent(this, FrameActivity.class);
        startActivity(it);
    }
}
