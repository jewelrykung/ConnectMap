package sdu.thanaset.connectmap;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CallMap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_map);
    } //onCreate Method
    public void runCallMap(View view){
        EditText latitude = (EditText) findViewById(R.id.mapLat);
        EditText longtitude = (EditText) findViewById(R.id.mapLong);

        String lat = latitude.getText().toString().trim();
        String lng = longtitude.getText().toString().trim();//แปลง edittext เป็น string

        Uri location = Uri.parse("http://maps.google.com/maps?q=loc:13.759493,100.541522");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW,location);
        //mapIntent.setPackage("com.google.android.apps.maps");//ใช้ไม่ได้กับ genymotion
        startActivity(mapIntent);
    }
}
