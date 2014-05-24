package com.example.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class FaSongJiHuoMaActivity extends Activity {
	private Button faSongJiHuoMabtn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.wangjimima_fasongjihuoma);
		faSongJiHuoMabtn = (Button) this.findViewById(R.id.fadongjihuomaBtn);
		faSongJiHuoMabtn.setOnClickListener(faSongJiHuoMabtnListener);
	}

	private OnClickListener faSongJiHuoMabtnListener = new OnClickListener() {
		@Override
		public void onClick(View arg0) {

			Intent intent = new Intent(FaSongJiHuoMaActivity.this,
					ChongZhiMiMaActivity.class);
			FaSongJiHuoMaActivity.this.startActivity(intent);
		}
	};
}
