package com.londonappbrewery.destini;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView mStoryTextView;
    Button mAnswerTop;
    Button mAnswerBottom;
    // TODO: Declare as variaveis aqui:
    Story mT1 =  new Story(R.string.T1_Story);
    Story mT2 =  new Story(R.string.T1_Story);
    Story mT3 =  new Story(R.string.T1_Story);
    Story mT4 =  new Story(R.string.T1_Story);
    Story mT5 =  new Story(R.string.T1_Story);
    Story mT6 =  new Story(R.string.T1_Story);
    Answer mT1_Ans = new Answer(R.string.T1_Ans1);
    Answer mT1_Ans2 = new Answer(R.string.T1_Ans2);
    Answer mT2_Ans = new Answer(R.string.T2_Ans1);
    Answer mT2_Ans2 = new Answer(R.string.T2_Ans2);
    Answer mT3_Ans = new Answer(R.string.T3_Ans1);
    Answer mT3_Ans2 = new Answer(R.string.T3_Ans2);




    //indice corrente da historia
    private Story mStorySelected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //TODO: Faça o link do layout com a activity
        mStoryTextView = findViewById(R.id.storyTextView);
        mAnswerTop = findViewById(R.id.buttonTop);
        mAnswerBottom = findViewById(R.id.buttonBottom);


        //TODO:faça o mapeamento da história
        mT1.setAnswerTop(mT1_Ans);
        mT1.setAnswerBottom(mT1_Ans2);
        mT1_Ans.setChildStory(mT3);
        mT3.setAnswerTop(mT3_Ans);
        mT3.setAnswerBottom(mT3_Ans2);
        mT3_Ans.setChildStory(mT6);
        mT3_Ans2.setChildStory(mT5);
        mT1_Ans2.setChildStory(mT2);
        mT2.setAnswerTop(mT2_Ans);
        mT2.setAnswerBottom(mT2_Ans2);
        mT2_Ans.setChildStory(mT3);
        mT3.setAnswerTop(mT3_Ans);
        mT3.setAnswerBottom(mT3_Ans2);
        mT3_Ans.setChildStory(mT6);
        mT3_Ans2.setChildStory(mT5);
        mT2_Ans2.setChildStory(mT4);

        mStorySelected = mT1;
        mStoryTextView.setText(mStorySelected.getStoryID());
        //mAnswerTop.setTest(mStory


        // TODO: Coloque o evento do click do botão, caso precise colocar a visibilidade no botão invisivel utilize a função
        // do botão setVisibility(View.GONE):
        /*
        mAnswerTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        mAnswerBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }

    @Override
    protected void onSaveInstanceState(Bundle outState)
    {
        super.onSaveInstanceState(outState);
        outState.putInt("StoryKey",mStoryIndex);
    }*/
    }
}
