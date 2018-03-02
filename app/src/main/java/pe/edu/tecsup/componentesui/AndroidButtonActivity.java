package pe.edu.tecsup.componentesui;


import android.content.Context;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class AndroidButtonActivity extends AppCompatActivity {
    private static final String TAG= Activity_botton.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_button);
    }
    public void callButon1 (View view) {
        Log.d(TAG, "Entro al buton 1");

        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();

    }
    public void callButon2 (View view) {
        Log.d(TAG, "Entro al buton 2");

        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();

    }

    public void callButon3 (View view) {
        Log.d(TAG, "Entro al buton 1");

        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();

    }

    public void callButon4 (View view) {
        Log.d(TAG, "Entro al buton 1");

        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();

    }

    public void callButon5 (View view) {
        Log.d(TAG, "Entro al buton 1");

        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();

    }

    public void callButon6 (View view) {
        Log.d(TAG, "Entro al buton 1");

        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();

    }
}
