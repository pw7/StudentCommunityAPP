package com.example.studentcommunityapp.ui.publish;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PublishViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public PublishViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is publish fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
    // TODO: Implement the ViewModel
}
