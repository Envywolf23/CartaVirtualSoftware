package jp.restaurantes;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.ListAdapter;
import android.widget.ArrayAdapter;

public class MenuActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    void IrEntradas(View v) {

        Intent intencion = new Intent(this, EntradasActivity.class);
        startActivity(intencion);
    }

    void IrFuertes (View v) {

        Intent intencion = new Intent(this, FuertesActivity.class);
        startActivity(intencion);
    }

    void IrBebidas (View v) {

        Intent intencion = new Intent(this, BebidasActivity.class);
        startActivity(intencion);
    }

    void IrPostres(View v) {

        Intent intencion = new Intent(this, PostresActivity.class);
        startActivity(intencion);
    }
}
