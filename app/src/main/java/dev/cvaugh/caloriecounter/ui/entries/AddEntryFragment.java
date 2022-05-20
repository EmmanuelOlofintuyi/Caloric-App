package dev.cvaugh.caloriecounter.ui.entries;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import dev.cvaugh.caloriecounter.databinding.FragmentAddEntryBinding;

public class AddEntryFragment extends Fragment {

    private FragmentAddEntryBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        AddEntryViewModel addEntryViewModel =
                new ViewModelProvider(this).get(AddEntryViewModel.class);

        binding = FragmentAddEntryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textNotifications;
        addEntryViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}