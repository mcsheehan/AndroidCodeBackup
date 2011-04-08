package mcs.MediaRemote;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.*;

public class RemoteScreen extends Activity 
{
	private TextView DebugTextBox;
	
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
       	super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        DebugTextBox = (TextView) findViewById(R.id.DebugText);
        
        //All of the TCP socket threading stuff
        new BroadcastSocket(null).start();
    }

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		float XValue = event.getRawX();
		float YValue = event.getRawY();
		
		String TouchData = "X= " + Float.toString(XValue) + " Y= " + Float.toString(YValue);
		DebugTextBox.setText(TouchData);
		
		return super.onTouchEvent(event);
	}

	public void PlayListener(View PresentView)
	{
		DebugTextBox.setText("Play button");
	}
	public void FastForwardListener(View PresentView)
	{
//		TextView DebugTextBox = (TextView) findViewById(R.id.DebugText);
		DebugTextBox.setText("FF button");
	}
	public void RewindListener(View PresentView)
	{
//		TextView DebugTextBox = (TextView) findViewById(R.id.DebugText);
		DebugTextBox.setText("Rewind button");
	}
	public void StopListener(View PresentView)
	{
//		TextView DebugTextBox = (TextView) findViewById(R.id.DebugText);
		DebugTextBox.setText("Stop button");
        Thread cThread = new Thread(new TCPClient());
        cThread.start();
	}
	public void PowerListener(View PresentView)
	{
//		TextView DebugTextBox = (TextView) findViewById(R.id.DebugText);
		DebugTextBox.setText("Power button");
	}

	public void FingerTracker(View PresentView)
	{
		
	}
}