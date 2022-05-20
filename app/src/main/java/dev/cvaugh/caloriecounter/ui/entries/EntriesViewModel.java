package dev.cvaugh.caloriecounter.ui.entries;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class EntriesViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public EntriesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Entries fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}