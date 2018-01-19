package com.example.android.whattodowhenyourebored;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;


public class Tell_us_about_yourself extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tell_us_about_yourself);
    }

    public void homeButton (View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    public void submitButton (View view){
        // Find the user's name
        EditText text = (EditText) findViewById(R.id.name_Edit_Text);
        String name = text.getText().toString();

        // Figure out if the user choose travel
        CheckBox while_traveling = (CheckBox) findViewById(R.id.checkbox_1);
        boolean hasTraveling = while_traveling.isChecked();

        // Figure out if the user choose at school
        CheckBox at_School = (CheckBox) findViewById(R.id.checkbox_2);
        boolean hasAtSchool = at_School.isChecked();

        // Figure out if the user choose at work
        CheckBox at_Work = (CheckBox) findViewById(R.id.checkbox_3);
        boolean hasAtWork = at_Work.isChecked();

        // Figure out if the user choose with friend
        CheckBox withFriend = (CheckBox) findViewById(R.id.checkbox_4);
        boolean hasWithFriend = withFriend.isChecked();

        // Figure out if the user choose other
        CheckBox other = (CheckBox) findViewById(R.id.other_checkbox);
        boolean hasOtherOption = other.isChecked();

        // Display the order summary on the screen
        String message = createSummary(name, hasTraveling, hasAtSchool , hasAtWork, hasWithFriend, hasOtherOption);
        displayMessage(message);
    }

    /**
     *
     * @param name is whether or not the user given their name.
     * @param traveling is whether or not the uses choose while traveling.
     * @param atSchool is whether or not the uses choose atSchool.
     * @param atWork is whether or not the uses choose atWork.
     * @param withFriend is whether or not the uses choose withFriend.
     * @param other is whether or not the uses choose other.
     * @return summaryMessage
     */


    private String createSummary(String name,boolean traveling, boolean atSchool, boolean atWork, boolean withFriend, boolean other) {
        // Find the user's answer
        TextView text = (TextView)findViewById(R.id.other_edit_text);
        String otherText = text.getText().toString();

        //Find the user's answer
        TextView answer = (TextView)findViewById(R.id.edit_text_Q2);
        String stringAnswer = answer.getText().toString();

        String summaryMessage = name;

          // if/else if condition
         if (traveling==true && atSchool==true && atWork==true && withFriend==true && other==true){
            summaryMessage += "\nOh my god!!! Really??" ;
            summaryMessage += "\nYou better follow our method!!! " ;
            summaryMessage += "\nYour answer for question2: "+stringAnswer+"\nThank you!";
        }
        else if ((traveling==true && atSchool==true && atWork==true && withFriend==true )||(traveling==true && atSchool==true && atWork==true && other==true ) ||(traveling==true && atSchool==true && withFriend==true && other==true )||(traveling==true && withFriend==true && atWork==true && other==true )
                 ||(atSchool==true && atWork==true && withFriend==true && other==true) ){
            summaryMessage += "\nOh my god!!! Really??" ;
             summaryMessage += "\nYour answer for question2: "+stringAnswer+"\nThank you!";
        }

        else if (traveling==true && atSchool==true && atWork==true){
            summaryMessage += "\nYou usually getting bored while traveling, at school and also at work." ;
             summaryMessage += "\nYour answer for question2: "+stringAnswer+"\nThank you!";

        }
         else if (atWork==true && withFriend==true && other==true){
             summaryMessage += "\nYou usually getting bored at work,with your friend "+otherText+ "." ;
             summaryMessage += "\nYour answer for question2: "+stringAnswer+"\nThank you!";
         }
         else if (traveling==true && atSchool==true && withFriend==true){
             summaryMessage += "\nYou usually getting bored while traveling, at school and with your friend." ;
             summaryMessage += "\nYour answer for question2: "+stringAnswer+"\nThank you!";

         }
         else if (traveling==true && atSchool==true && other==true){
             summaryMessage += "\nYou usually getting bored while traveling, at school and "+ otherText +".";
             summaryMessage += "\nYour answer for question2: "+stringAnswer+"\nThank you!";

         }
         else if (traveling==true && atWork==true && withFriend==true){
             summaryMessage += "\nYou usually getting bored while traveling, at work and with your friend." ;
             summaryMessage += "\nYour answer for question2: "+stringAnswer+"\nThank you!";

         }
         else if (traveling==true && atWork==true && other==true){
             summaryMessage += "\nYou usually getting bored while traveling, at work and "+ otherText+"." ;
             summaryMessage += "\nYour answer for question2: "+stringAnswer+"\nThank you!";

         }
         else if (traveling==true && withFriend==true && other==true){
             summaryMessage += "\nYou usually getting bored while traveling, with your friend and "+ otherText+"." ;
             summaryMessage += "\nYour answer for question2: "+stringAnswer+"\nThank you!";
         }
         else if (atSchool==true && other==true && withFriend==true){
             summaryMessage += "\nYou usually getting bored at school, with your friend and also "+ otherText+"." ;
             summaryMessage += "\nYour answer for question2: "+stringAnswer+"\nThank you!";
         }

         else if (atSchool==true && atWork==true && other==true){
             summaryMessage += "\nYou usually getting bored at school, at work and also "+ otherText +"." ;
             summaryMessage += "\nYour answer for question2: "+stringAnswer+"\nThank you!";
         }
         else if (atSchool==true && atWork==true && withFriend==true){
             summaryMessage += "\nYou usually getting bored at school, at work and also with your friend." ;
             summaryMessage += "\nYour answer for question2: "+stringAnswer+"\nThank you!";
         }
         else if (traveling==true && atSchool==true){
             summaryMessage += "\nYou usually getting bored while traveling and also at school." ;
             summaryMessage += "\nYour answer for question2: "+stringAnswer+"\nThank you!";
         }

        else if (traveling==true && atWork==true){
            summaryMessage += "\nYou usually getting bored while traveling and also at work." ;
             summaryMessage += "\nYour answer for question2: "+stringAnswer+"\nThank you!";
        }
        else if (traveling==true && withFriend==true){
            summaryMessage += "\nYou usually getting bored while traveling and also with friend." ;
             summaryMessage += "\nYour answer for question2: "+stringAnswer+"\nThank you!";

        }
        else if (traveling==true && other==true){
            summaryMessage += "\nYou usually getting bored while traveling and also " + otherText +".";
             summaryMessage += "\nYour answer for question2: "+stringAnswer+"\nThank you!";

        }

        else if (atSchool==true && atWork==true){
            summaryMessage += "\nYou usually getting bored at school and also at work." ;
             summaryMessage += "\nYour answer for question2: "+stringAnswer+"\nThank you!";

        }
        else if (atSchool==true && withFriend==true){
            summaryMessage += "\nYou usually getting bored at school and also with your friend." ;
            summaryMessage += "\nThank you!";

        }
        else if (atSchool==true && other==true){
            summaryMessage += "\nYou usually getting bored at school and also " + otherText +".";
             summaryMessage += "\nYour answer for question2: "+stringAnswer+"\nThank you!";
        }


         else if (atWork==true && withFriend==true){
             summaryMessage += "\nYou usually getting bored at work and also with your friend.";
             summaryMessage += "\nYour answer for question2: "+stringAnswer+"\nThank you!";
         }
         else if (atWork==true && other==true){
             summaryMessage += "\nYou usually getting bored at work and also " + otherText +".";
             summaryMessage += "\nThank you!";

         }
         else if (withFriend==true && other==true){
             summaryMessage += "\nYou usually getting bored with your friend and also " + otherText +".";
             summaryMessage += "\nYour answer for question2: "+stringAnswer+"\nThank you!";

         }

        else if (traveling==true){
            summaryMessage += "\nYou usually getting bored while traveling." ;
             summaryMessage += "\nYour answer for question2: "+stringAnswer+"\nThank you!";
        }

        else if (atSchool==true){
            summaryMessage += "\nYou usually getting bored at school." ;
             summaryMessage += "\nYour answer for question2: "+stringAnswer+"\nThank you!";
        }

        else if (atWork==true){
            summaryMessage += "\nYou usually getting bored at work." ;
             summaryMessage += "\nYour answer for question2: "+stringAnswer+"\nThank you!";
        }
        else if (withFriend==true){
            summaryMessage += "\nYou usually getting bored with friend." ;
             summaryMessage += "\nYour answer for question2: "+stringAnswer+"\nThank you!";
        }
        else if(other==true) {
            summaryMessage += "\nYou usually getting bored " + otherText +"." ;
             summaryMessage += "\nYour answer for question2: "+stringAnswer+"\nThank you!";
        }
        else {
             Toast.makeText(this, "Please choose some answer..", Toast.LENGTH_LONG).show();
        }
        return summaryMessage;
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView summaryTextView = (TextView) findViewById(R.id.summary_text_view);
        summaryTextView.setText(message);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_tell_us_about_yourself, menu);
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
