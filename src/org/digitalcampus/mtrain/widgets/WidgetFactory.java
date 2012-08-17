package org.digitalcampus.mtrain.widgets;

import org.digitalcampus.mtrain.R;
import org.digitalcampus.mtrain.model.Module;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

public abstract class WidgetFactory extends Activity{
	
	private LayoutInflater li;
	private LinearLayout ll;
	
	public WidgetFactory(Context context, Module module, org.digitalcampus.mtrain.model.Activity activity ) {
		super();
		ll = (LinearLayout) ((Activity) context).findViewById(R.id.activity_widget);
		ll.removeAllViews();
		li = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}
	
	public LayoutInflater getLayoutInflater(){
		return li;
	}
	
	public LinearLayout getLayout(){
		return ll;
	}
	
	public abstract boolean isComplete();
	
	public abstract long getTimeTaken();
	
}
