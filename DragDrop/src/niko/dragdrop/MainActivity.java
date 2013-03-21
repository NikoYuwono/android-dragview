package niko.dragdrop;

import niko.dragdrop.view.DragDropView;
import android.os.Bundle;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.app.Activity;
import android.content.Context;
public class MainActivity extends Activity {
	
	private Context context;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		context = this;
		LinearLayout llContainerMain = (LinearLayout) findViewById(R.id.llMainContainer);
		DragDropView dragDropView = new DragDropView(context);
		dragDropView.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.FILL_PARENT));
		ImageView ivTest = new ImageView(context);
		ivTest.setImageDrawable(context.getResources().getDrawable(R.drawable.ic_launcher));
		dragDropView.AddDraggableView(ivTest, 50, 50, 100, 100);
		llContainerMain.addView(dragDropView);
	}

}
