package dev.cvaugh.caloriecounter.ui.entries;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AddEntryViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public AddEntryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Add Entry fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}