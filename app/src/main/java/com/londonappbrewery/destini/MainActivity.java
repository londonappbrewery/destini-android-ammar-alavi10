package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
     TextView storyText;
     Button topButton, bottomButton;
     int mIndexStory=1;


     private storyline[] mStorylines = new storyline[]{
             new storyline(R.string.T1_Story),
             new storyline(R.string.T2_Story),
             new storyline(R.string.T3_Story),
             new storyline(R.string.T4_End),
             new storyline(R.string.T5_End),
             new storyline(R.string.T6_End)
     };
     private answer[] mAnswers = new answer[]{
             new answer(R.string.T1_Ans1,R.string.T1_Ans2),
             new answer(R.string.T2_Ans1,R.string.T2_Ans2),
             new answer(R.string.T3_Ans1,R.string.T3_Ans2)
     };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        storyText = findViewById(R.id.storyTextView);
        topButton = findViewById(R.id.buttonTop);
        bottomButton = findViewById(R.id.buttonBottom);



        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        topButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updatestory('t');
                updateanswer();

            }
        });




        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        bottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updatestory('b');
                updateanswer();

            }
        });


    }
    void updatestory(char ch){
        if(mIndexStory == 1 ){
            if(ch == 't')
                mIndexStory = mIndexStory + 2;
            else
                mIndexStory = mIndexStory + 1;
        }
        else if(mIndexStory == 2){
            if(ch == 't')
                mIndexStory = mIndexStory + 1;
            else
                mIndexStory = mIndexStory + 2;
        }
        else if(mIndexStory == 3){
            if(ch == 't')
                mIndexStory = mIndexStory + 3;
            else
                mIndexStory = mIndexStory + 2;
        }
        storyText.setText(mStorylines[mIndexStory-1].getStoryid());
    }
    void updateanswer(){
        if(mIndexStory==4 || mIndexStory==5 || mIndexStory==6){
            topButton.setVisibility(View.GONE);
            bottomButton.setVisibility(View.GONE);
        }
        else{
            bottomButton.setText(mAnswers[mIndexStory-1].getAnswer_2_id());
            topButton.setText(mAnswers[mIndexStory-1].getAnswer_1_id());
        }

    }
}
