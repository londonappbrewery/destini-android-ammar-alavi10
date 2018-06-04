package com.londonappbrewery.destini;

public class answer {
    private int mAnswer_1_id,mAnswer_2_id;
    public answer(int answer1id,int answer2id){
        mAnswer_1_id = answer1id;
        mAnswer_2_id = answer2id;
    }

    public int getAnswer_1_id() {
        return mAnswer_1_id;
    }

    public void setAnswer_1_id(int answer_1_id) {
        mAnswer_1_id = answer_1_id;
    }

    public int getAnswer_2_id() {
        return mAnswer_2_id;
    }

    public void setAnswer_2_id(int answer_2_id) {
        mAnswer_2_id = answer_2_id;
    }
}
