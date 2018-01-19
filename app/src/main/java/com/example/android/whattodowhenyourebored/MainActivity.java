package com.example.android.whattodowhenyourebored;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /*
     * This method is called when the seeContent button is clicked.
     *
     */

    public void seeContent(View view) {
        // When the seeContent button is clicked, change background
        ScrollView layout = (ScrollView) findViewById(R.id.scrollView);
        layout.setBackgroundResource(R.drawable.background);

        // When the seeContent button is clicked, change welcome to context
        TextView welcomeText = (TextView) findViewById(R.id.welcome_text_view);
        welcomeText.setText("Content");

        //When the seeContent button is clicked, hide the button
        Button contentButton = (Button)findViewById(R.id.content_Button);
        contentButton.setVisibility(View.GONE);

        // when the seeContent button is clicked, show the textView method1
        TextView method1 = (TextView) findViewById(R.id.method1_text_view);
        method1.setVisibility(View.VISIBLE);

        // when the seeContent button is clicked, show the button Read1
        Button read1 = (Button) findViewById(R.id.read_button_1);
        read1.setVisibility(View.VISIBLE);

        // when the seeContent button is clicked, show the textView method2
        TextView method2 = (TextView) findViewById(R.id.method2_text_view);
        method2.setVisibility(View.VISIBLE);

        // when the seeContent button is clicked, show the button Read2
        Button read2 = (Button) findViewById(R.id.read_button_2);
        read2.setVisibility(View.VISIBLE);

        // when the seeContent button is clicked, show the textView method3
        TextView method3 = (TextView) findViewById(R.id.method3_text_view);
        method3.setVisibility(View.VISIBLE);

        // when the seeContent button is clicked, show the button Read3
        Button read3 = (Button) findViewById(R.id.read_button_3);
        read3.setVisibility(View.VISIBLE);

        // when the seeContent button is clicked, show the textView method4
        TextView method4 = (TextView) findViewById(R.id.method4_text_view);
        method4.setVisibility(View.VISIBLE);

        // when the seeContent button is clicked, show the button Read4
        Button read4 = (Button) findViewById(R.id.read_button_4);
        read4.setVisibility(View.VISIBLE);

        // when the seeContent button is clicked, show the textView method5
        TextView method5 = (TextView) findViewById(R.id.method5_text_view);
        method5.setVisibility(View.VISIBLE);

        // when the seeContent button is clicked, show the button Read5
        Button read5 = (Button) findViewById(R.id.read_button_5);
        read5.setVisibility(View.VISIBLE);

    }

    /*
    * This method is called when readButton1 is clicked
    *
    * */
    public void readButton1(View view) {
        Intent intent = new Intent(this, Entertaining_yourself_while_traveling.class);
        startActivity(intent);

    }

    /*
     * This method is called when readButton2 is clicked
     *
     * */
    public void readButton2(View view) {
        Intent intent = new Intent(this, Entertainingyourselfoutsidethehouse.class);
        startActivity(intent);

    }


    /*
    * This method is called when readButton3 is clicked
    *
    * */
    public void readButton3(View view) {
        Intent intent = new Intent(this, Entertaining_yourself_at_work_or_class.class);
        startActivity(intent);

    }

    /*
     * This method is called when readButton4 is clicked
     *
     * */
    public void readButton4(View view) {
        Intent intent = new Intent(this, Entertaining_yourself_with_friend.class);
        startActivity(intent);
    }

    /*
    * This method is called when readButton5 is clicked
    *
    * */
    public void readButton5(View view) {
        Intent intent = new Intent(this, To_get_started_busting_through_your_boredom.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
