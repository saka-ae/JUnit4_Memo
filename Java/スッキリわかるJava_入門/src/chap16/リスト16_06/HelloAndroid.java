package chap16.リスト16_06;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;


public class HelloAndroid extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		TextView tv = new TextView(this);
		tv.setText("Hello Android");

		setContentView(tv);
	}

}
