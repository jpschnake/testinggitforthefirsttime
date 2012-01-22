package de.teamscore.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import de.teamscore.R;

public class Startscreen extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button singleplayer = (Button) findViewById(R.id.btnSingleGame);
        
        singleplayer.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {

				Intent singleplayerIntent = new Intent(Startscreen.this, SelectGame.class);
				startActivity(singleplayerIntent);
			}
		});
    }
}