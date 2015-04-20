package ctec.sortingandsearching;


import sort.controller.SortController;
import sort.model.SortingMachine;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class SortActivity extends Activity
{
	private TextView whereNumbersGo;
	private Button update, displayButton, quickSort, selectSort, searchButton, scrambleButton;
	private SortController myController;
	private SortingMachine theMachine;
	private CheckBox Integers, Weapons, Words, Doubles, RPS, unused;
	private EditText intSize, intRandomization, doubleSize, wordsSize, weaponsSize, unusedSize;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sort);
		update = (Button) findViewById(R.id.update);
		quickSort = (Button) findViewById(R.id.quickSort);
		selectSort = (Button) findViewById(R.id.selectSort);
		searchButton = (Button) findViewById(R.id.searchButton);
		displayButton = (Button) findViewById(R.id.displayButton);
		scrambleButton = (Button) findViewById(R.id.scrambleButton);
		Integers = (CheckBox) findViewById(R.id.Integers);
		Weapons = (CheckBox) findViewById(R.id.Weapons);
		Words = (CheckBox) findViewById(R.id.Words);
		Doubles = (CheckBox) findViewById(R.id.Doubles);
		RPS = (CheckBox) findViewById(R.id.RPS);
		unused = (CheckBox) findViewById(R.id.unused);
		intSize = (EditText) findViewById(R.id.intSize);
		intRandomization = (EditText) findViewById(R.id.intRandomization);
		doubleSize = (EditText) findViewById(R.id.doubleSize);
		wordsSize = (EditText) findViewById(R.id.wordsSize);
		weaponsSize = (EditText) findViewById(R.id.weaponsSize);
		unusedSize = (EditText) findViewById(R.id.unusedSize);
		myController = new SortController();
		theMachine = new SortingMachine();
		whereNumbersGo = (TextView) findViewById(R.id.whereNumbersGo);
		
		whereNumbersGo.setText("This is where the numbers go");
		/**
		 * all arrays will be filled with 100 at this point
		 */
		myController.start();
		setupListeners();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.sort, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings)
		{
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	private void setupListeners()
	{
		update.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View currentView)
			{
				
			}
		});
		displayButton.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View currentView)
			{
				whereNumbersGo.setText(theMachine.displayTheArray(myController.getIntegers()));
			}
		});
		quickSort.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View currentView)
			{
				
			}
		});
		selectSort.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View currentView)
			{
				
			}
		});
		scrambleButton.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View currentView)
			{
				
			}
		});
		searchButton.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View currentView)
			{
				
			}
		});
	}
}
