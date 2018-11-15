package jerad.reyes.com.project_1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class settings_page extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_page);
        Intent i = new Intent(this, myCustomService.class);
        startService(i);
    }

    public void process3(View view) {
        Intent i = null;
        if (view.getId() == R.id.btn_homee) {
            i = new Intent(this, MainActivity.class);
            startActivity(i);
        }
    }
    public void process9 (View view) {
        Intent i = null;
        if (view.getId() == R.id.btn_ver) {
            i = new Intent(this, ver_num.class);
            startActivity(i);
        }
    }
    public void process10 (View view) {
        Intent i = null;
        if (view.getId() == R.id.btn_upd) {
            i = new Intent(this, ver_num.class);
            startActivity(i);
        }
    }
}
