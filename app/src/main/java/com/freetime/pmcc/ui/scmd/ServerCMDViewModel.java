package com.freetime.pmcc.ui.scmd;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ServerCMDViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public ServerCMDViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}