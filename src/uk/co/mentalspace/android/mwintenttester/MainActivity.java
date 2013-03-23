package uk.co.mentalspace.android.mwintenttester;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	Intent intent = null;
    	Bundle b = null;

    	switch (item.getItemId()) {
    	case R.id.menu_Discovery:
    		intent = new Intent("org.metawatch.manager.APPLICATION_DISCOVERY");
    		this.sendBroadcast(intent);
    		return true;
    	case R.id.menu_Activate:
    		intent = new Intent("org.metawatch.manager.APPLICATION_ACTIVATE");
    		b = new Bundle();
    		b.putString("id", "BusTimes");
    		intent.putExtras(b);
    		this.sendBroadcast(intent);
    		return true;
    	case R.id.menu_Deactivate:
    		intent = new Intent("org.metawatch.manager.APPLICATION_DEACTIVATE");
    		b = new Bundle();
    		b.putString("id", "BusTimes");
    		intent.putExtras(b);
    		this.sendBroadcast(intent);
    		return true;
    	default:
    		return super.onOptionsItemSelected(item);
    	}
    }
}
